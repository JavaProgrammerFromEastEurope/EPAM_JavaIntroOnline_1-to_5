package chapters.chapterFunctions.functions.impl.devSoftwareBasics.branchFunctions;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.String.*;
import static java.lang.System.out;

/**
 * 4. The dimensions A, B of the rectangular hole and the dimensions - (x, y, z) of the brick are given.
 * Determine if a brick will pass through hole.
 **/
public class FourthBranchFunction implements IFunction {

    @Override
    public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
        try {
            out.println(" Please, input 2 coordinate for the hole\n " +
                            "then 3 coordinate for the brick:");
            IFunction.super.inputVariables(length, bEvenValue, bDouble);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calcFunction() {

        addString[0] =
                             /* (y <= a && x <= b) */
           variables[3] <= variables[0] && variables[2] <= variables[1] ||
                             /* (x <= a && y <= b) */
           variables[2] <= variables[0] && variables[3] <= variables[1] ||
                             /* (x <= a && z <= b) */
           variables[2] <= variables[0] && variables[4] <= variables[1] ||
                             /* (z <= a && x <= b) */
           variables[4] <= variables[0] && variables[2] <= variables[1] ||
                             /* (z <= a && y <= b) */
           variables[4] <= variables[0] && variables[3] <= variables[1] ||
                             /* (y <= a && z <= b) */
           variables[3] <= variables[0] && variables[4] <= variables[1]
        ? "pass" : "not pass";
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[1] = " 4. Branch function ";
            return format("%n%s%n The brick[%.0f,%.0f,%.0f] will %s through the hole[%.0f,%.0f].%n",
                    addString[1], variables[2], variables[3],
                    variables[4], addString[0], variables[0], variables[1]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}