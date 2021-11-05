package chapters.chapterFunctions.functions.impl.devSoftwareBasics.linearFunctions;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * 1. Find the value of the function:
 * z = ((a - 3) * b / 2) + c
 **/
public class FirstLinearFunction implements IFunction {

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
        operation[0] = variables[0] - 3;            /* (a - 3) */
        operation[1] = variables[1] / 2;            /* (b / 2) */
        operation[2] = operation[0] * operation[1]; /* (a - 3) * (b / 2) */
        operation[3] = operation[2] + variables[2]; /* (a - 3) * (b / 2) + c */
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = format("1. Linear Function:\n" +
                        "((%.0f - 3) * %.0f / 2) + %.0f =",
                    variables[0],variables[1],variables[2]);
            return format("%n%s %.1f%n", addString[0], operation[3]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}