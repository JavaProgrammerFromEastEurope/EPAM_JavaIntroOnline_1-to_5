package chapters.chapterFunctions.functions.impl.devSoftwareBasics.branchFunctions;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * 1. Given two angles of the triangle (in degrees).
 * Determine whether such a triangle exists, and if so,
 * whether there will be it is rectangular.
 **/
public class FirstBranchFunction implements IFunction {

    private boolean bRect, bExist = true;

    @Override
    public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
        try {
            IFunction.super.inputVariables(length, bEvenValue, bDouble);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calcFunction() {
        int angle = (int) variables[0] + (int) variables[1];
        bRect = (angle > 180)
                ? bExist = false
                : (180 - angle == 90 || variables[0] == 90 || variables[1] == 90);
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[4] = " 1. Branch function ";
            addString[0] = "rectangular"; addString[1] = "not rectangular";
            addString[2] = "not exist";   addString[3] = " The triangle with angles:";
            String isRectangular = bExist ? bRect ?
                    addString[0] : addString[1] : addString[2];
            return format("%n%s%n%s [%.0f,%.0f] - %s%n",
                    addString[4], addString[3],  variables[0],  variables[1], isRectangular);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}