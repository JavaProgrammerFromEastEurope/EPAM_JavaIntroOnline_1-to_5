package chapters.chapterFunctions.functions.impl.devSoftwareBasics.linearFunctions;

import application.utils.Coordinate;
import chapters.chapterFunctions.functions.IFunction;

import java.util.stream.IntStream;

import static java.lang.String.*;
import static java.lang.System.out;

/**
 * 6. For a given area, compose a linear program that prints true - if the point with coordinates (x, y)
 * belongs to the filled area, and false - otherwise.
 **/
public class SixthLinearFunction implements IFunction {

    private boolean bTotal, bSide;
    private Coordinate[] coordinates;

    private boolean checkAreaX(int start, int finish, int x) {
        return IntStream.rangeClosed(start, finish)
                .filter(index -> index != 0)
                .anyMatch(index -> x == index);
    }

    private boolean checkAreaY(int start, int finish, int y) {
        return IntStream.rangeClosed(start, finish)
                .anyMatch(index -> y == index);
    }

    @Override
    public void calcFunction() {
        bSide = false;
        coordinates = new Coordinate[(int) 1];
        IFunction.super.inputAnyCoordinate(coordinates);
        bTotal = (checkAreaX(-2, 2, coordinates[0].getX())
                && checkAreaY(1, 4, coordinates[0].getY())
                ? bSide = true
                : (checkAreaX(-4, 4,  coordinates[0].getX())
                && checkAreaY(-3, -1, coordinates[0].getY())));
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[5] = " 6. Linear function ";
            addString[0] = "upper side"; addString[1] = "below side";
            addString[2] = "other side"; addString[3] = " The point with parameters: ";
            addString[4] = bTotal ? bSide ? addString[0] : addString[1] : addString[2];
            return format("%n%s%n%s[%d,%d] - %s%n",
                    addString[5], addString[3],coordinates[0].getX(),
                    coordinates[0].getY(), addString[4]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}