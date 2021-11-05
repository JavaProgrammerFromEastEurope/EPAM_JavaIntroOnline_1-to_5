package chapters.chapterFunctions.functions.impl.devSoftwareBasics.branchFunctions;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.String.*;
import static java.lang.System.out;

/**
 * 2. Find max{min(a, b), min(c, d)}
 **/
public class SecondBranchFunction implements IFunction {

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
        operation[3] = max(min(variables[0], variables[1]),
                           min(variables[2], variables[3]));
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 2. Branch function ";
            addString[1] = " The max value from:";
            return format("%n%s%n%s max(min(%.0f,%.0f), min(%.0f,%.0f)) - %.0f%n",
                    addString[0], addString[1], variables[0],
                    variables[1], variables[2],
                    variables[3], operation[3]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}