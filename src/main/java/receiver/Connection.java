package receiver;

import java.io.IOException;
import java.util.Properties;

import static java.lang.String.format;
import static java.lang.System.out;

public class Connection {

    private static final String PATH = "config/receiver.properties";
    private static String ipAddress;
    private static int port;

    public static void connect() {
        /** Do some preparation work
         * and start the receiver **/
        readPropertyFromFile();
        startReceiver();
    }

    private static void readPropertyFromFile() {
        try {
            var property = new Properties();
            property.load(Connection.class.getResourceAsStream(format("/%s", PATH)));
            ipAddress = property.getProperty("ipAddress");
            port = Integer.parseInt(property.getProperty("port"));
        } catch (IOException e) {
            out.println(e.getMessage());
        }
    }

    private static void startReceiver() {
        int trying = 0;
        while (!new Receiver(ipAddress, port).run()) {
            out.printf("%s try connect to server is failed!%n", ++trying);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}