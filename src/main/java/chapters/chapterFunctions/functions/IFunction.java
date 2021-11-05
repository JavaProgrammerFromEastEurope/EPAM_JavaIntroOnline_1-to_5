package chapters.chapterFunctions.functions;

import application.utils.Coordinate;
import application.utils.Input;
import application.utils.Tuple;

import static application.utils.Input.*;
import static java.lang.System.out;
import static java.util.Arrays.*;

public interface IFunction {

    String[] addString = new String[6];
    double[] variables = new double[6];
    double[] operation = new double[4];

    String warning = ("\nThe Result of function printed on Server side.\n");

    default void inputVariables(int length, boolean bEvenValue, boolean bDouble) throws IllegalStateException {
        String evenLengthInvitation = " Enter even value ";
        String theValueOfVariable = " Enter any positive value ";
        switch (length) {
            case 1: case 2: case 3:
            case 4: case 5: case 6:
                for (int index = 0; index < length; index++) {
                    if (bEvenValue) do {
                        out.printf("%s%c: ", evenLengthInvitation, (char) 78);
                        variables[index] = getInteger();
                    } while (variables[index] % 2 == 1);
                    else {
                        out.printf("%s%c: ", theValueOfVariable, (char) (index + 77));
                        variables[index] = bDouble ? doubleInitialize()
                                : getInteger();
                    }
                }
                return;
            default:
                throw new IllegalStateException("Unexpected value: " + length);
        }
    }

    default void inputAnyCoordinate(Coordinate[] coordinates) {
        int bound = coordinates.length;
        Coordinate coordinate;
        for (int i = 0, coordinatesLength = coordinates.length; i < coordinatesLength; i++) {
            coordinate = new Coordinate();
            out.printf("Enter the X of coordinate: %d out of %d%n", i + 1, bound);
            coordinate.setX(anyIntInitialize());
            out.printf("Enter the Y of coordinate: %d out of %d%n", i + 1, bound);
            coordinate.setY(anyIntInitialize());
            coordinates[i] = coordinate;
        }
    }

    default Tuple<Integer> inputAnyPositionOfTuple() {
        return new Tuple<>(anyIntInitialize("Input first:"),
                           anyIntInitialize("Input second:"));
    }

    default int inputPosition(int bound) {
        out.printf("Input a position that is below %d: ", bound);
        return Input.inputPosition(bound);
    }

    default void setDefaults() {
        fill(operation, 0);
        fill(variables, 0);
        fill(addString, null);
    }

    void calcFunction();

    String getResultString();
}