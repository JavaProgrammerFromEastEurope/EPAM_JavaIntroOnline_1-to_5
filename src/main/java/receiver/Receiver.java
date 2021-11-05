package receiver;

import network.CommunicationBridge;
import network.ITCPConnectionListener;

import static java.lang.System.out;

public class Receiver implements ITCPConnectionListener {
    public static CommunicationBridge communicationBridge;

    final String ipAddress;
    final int port;

    public Receiver(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public boolean run() {
        try {
            communicationBridge = new CommunicationBridge(this, ipAddress, port);
            return true;
        } catch (Exception e) {
            //communicationBridge.disconnect();
            return false;
        }
    }

    @Override
    public void onConnectionReady(CommunicationBridge tcpConnection) {
        out.println("Connection Established");
    }

    @Override
    public void onReceiveString(CommunicationBridge tcpConnection, String value) {
        out.println(value);
    }

    @Override
    public void onDisconnect(CommunicationBridge tcpConnection) {
        out.println("Connection Close");
    }

    @Override
    public void onException(CommunicationBridge tcpConnection, Exception e) {
        //out.println(e.getMessage());
    }
}
