package chapters.chapterFunctions.functions.impl.devSoftwareBasics.branchFunctions;

import application.utils.Coordinate;
import chapters.chapterFunctions.functions.IFunction;

import static java.lang.String.*;
import static java.lang.System.out;

/**
 * 3. Three points - A (x1, y1), B (x2, y2) and C (x3, y3) are given.
 * Determine if they will be located on the same line.
 **/
public class ThirdBranchFunction implements IFunction {

    private boolean bBelong = false;
    private Coordinate[] coordinates;

    @Override
    public void calcFunction() {
        coordinates = new Coordinate[3];
        IFunction.super.inputAnyCoordinate(coordinates);
        /* if (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0 */
        bBelong = ((coordinates[0].getX() - coordinates[2].getX())
                 * (coordinates[1].getY() - coordinates[2].getY())
                == (coordinates[1].getX() - coordinates[2].getX())
                 * (coordinates[0].getY() - coordinates[2].getY()));
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[3] = " 3. Branch function ";
            addString[0] = "belong";
            addString[1] = "not belong";
            addString[2] = bBelong ? addString[0] : addString[1];
            return format(
                "%n%s%n Coordinates - A[%d,%d], B[%d,%d], C[%d,%d] are %s one line.%n",
                    addString[3],
                    coordinates[0].getX(), coordinates[0].getY(),
                    coordinates[1].getX(), coordinates[1].getY(),
                    coordinates[2].getX(), coordinates[2].getY(),
                    addString[2]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}