package application.utils;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public final class Input {

    private static final Scanner scanner = new Scanner(in);
    private static Object inputObject;

    public static int getInteger() {
        if (scanner.hasNextInt()) {
            inputObject = scanner.nextInt();
            if ((int) inputObject > 0)
                return (int) inputObject;
        }
        getWarningString();
        return getInteger();
    }

    public static int getInteger(String message) {
        out.println(message);
        return getInteger();
    }

    public static String getString() {
        return scanner.next();
    }

    public static String getString(String message) {
        out.println(message);
        return getString();
    }

    public static int anyIntInitialize() {
        if (scanner.hasNextInt()) {
            inputObject = scanner.nextInt();
            return (int) inputObject;
        }
        getWarningString();
        return anyIntInitialize();
    }

    public static int anyIntInitialize(String message) {
        out.println(message);
        return anyIntInitialize();
    }

    public static int inputPosition(int bound) {
        if (scanner.hasNextInt()) {
            inputObject = scanner.nextInt();
            if ((int) inputObject > 0
                    && (int) inputObject <= bound)
                return (int) inputObject;
        }
        getWarningString();
        return inputPosition(bound);
    }

    public static Object inputCharacter() {
        if (scanner.hasNext("[a-zA-Z]")) {
            inputObject = scanner.next();
            return inputObject;
        }
        getWarningString();
        return inputCharacter();
    }

    public static double doubleInitialize() {
        if (scanner.hasNextDouble()) {
            inputObject = scanner.nextDouble();
            if ((double) inputObject > 0)
                return (double) inputObject;
        }
        getWarningString();
        return doubleInitialize();
    }

    private static void getWarningString() {
        if (inputObject == null)
            inputObject = scanner.next();
        String repeatInput = "Please enter the correct data: ";
        String warningMessage = "this is an invalid value!";
        out.printf(" %s - %s %n %s", inputObject, warningMessage, repeatInput);
        inputObject = null;
    }
}