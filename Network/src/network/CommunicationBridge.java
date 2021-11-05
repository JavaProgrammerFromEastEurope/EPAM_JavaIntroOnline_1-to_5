package network;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

import static java.lang.String.*;

public class CommunicationBridge {

    private final Socket socket;
    private Thread rxThread;
    private final ITCPConnectionListener eventListener;
    private final BufferedWriter bufferedWriter;

    public CommunicationBridge(ITCPConnectionListener eventListener,
                               String ipAddress, int port) throws IOException {
        this(eventListener, new Socket(ipAddress, port));
    }

    public CommunicationBridge(ITCPConnectionListener eventListener, Socket socket) throws IOException {
        this.eventListener = eventListener;
        this.socket = socket;
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
        rxThread = new Thread(() -> {
            try {
                eventListener.onConnectionReady(this);
                while (!rxThread.isInterrupted()) {
                    eventListener.onReceiveString(
                     this,
                     bufferedReader.readLine());
                }
            } catch (IOException e) {
                eventListener.onException(this, e);
            } finally {
                eventListener.onDisconnect(this);
            }
        });
        rxThread.start();
    }

    public synchronized void sendString(String value) {
        try {
            bufferedWriter.write(value + "\r\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            eventListener.onException(this, e);
            disconnect();
        }
    }

    public synchronized void disconnect() {
        rxThread.interrupt();
        try {
            socket.close();
        } catch (IOException e) {
            eventListener.onException(this, e);
        }
    }

    @Override
    public String toString() {
        return format("TCPConnection: %s: %d",
                socket.getInetAddress(), socket.getPort());
    }
}
