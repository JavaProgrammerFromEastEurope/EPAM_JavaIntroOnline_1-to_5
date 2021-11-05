package network;

public interface ITCPConnectionListener {
    void onConnectionReady(CommunicationBridge tcpConnection);
    void onReceiveString(CommunicationBridge tcpConnection, String value);
    void onDisconnect(CommunicationBridge tcpConnection);
    void onException(CommunicationBridge tcpConnection, Exception e);
}
