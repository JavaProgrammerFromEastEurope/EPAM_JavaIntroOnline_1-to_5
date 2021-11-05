package chapters.chapterFunctions.functions.impl.devSoftwareBasics.linearFunctions;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.Math.floor;
import static java.lang.String.*;
import static java.lang.System.out;

/**
 * 5. A natural number T is given, which represents the duration of the elapsed time in seconds.
 * Withdraw the given duration value in hours, minutes and seconds in the following form:
 * NNh MM min SSc.
 **/
public class FifthLinearFunction implements IFunction {

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
        operation[1] = floor(variables[0] / 3600);
        operation[2] = floor(variables[0] / 60);
        operation[3] = variables[0] % 60;
        while (operation[2] > 59) {
               operation[2] = floor(operation[2] / 60);
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 5. Linear function ";
            addString[1] = " Time format is:";
            return format("%n%s%n%s %.0fs - '%.0f:%.0f:%.0f'%n",
                    addString[0], addString[1], variables[0],
                    operation[1], operation[2], operation[3]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}