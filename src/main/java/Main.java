import application.Application;
import receiver.Connection;

public class Main {
    public static void main(String[] args) {
         Connection.connect();
        Application.startEntertainment();
    }
}