package chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.String.*;
import static java.lang.System.out;

/**
 * 1. Write a program where the user enters any positive integer.
 * And the program sums up all numbers from 1 to a user-entered number.
 **/
public class FirstCycleFunction implements IFunction {

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
        for (int i = 1; i <= variables[0]; i++) {
            operation[0] += i;
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 1. Cycle function ";
            addString[1] = " Sum of numbers from 1 to ";
            return format("%n%s%n%s%.0f = %.0f%n",
                    addString[0], addString[1], variables[0], operation[0]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
