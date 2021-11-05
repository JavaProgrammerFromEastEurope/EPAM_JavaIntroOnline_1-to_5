package chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import chapters.chapterFunctions.functions.IFunction;

import java.util.Arrays;

import static java.lang.String.*;
import static java.lang.System.out;

/**
 * 8. Two numbers are given.
 * Determine the digits included in the recording of both the first and second numbers.
 **/
public class EightCycleFunction implements IFunction {

    private char[] firstNumberDigits;
    private char[] secondNumberDigits;

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
        firstNumberDigits  = valueOf((int) variables[0]).toCharArray();
        secondNumberDigits = valueOf((int) variables[1]).toCharArray();
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 8. Cycle function ";
            addString[1] = " There are couple arrays of digits from two inputted numbers:";
            return format("%n%s%n%s%n %.0f - %s,%n %.0f - %s %n%n",
                    addString[0], addString[1],
                    variables[0], Arrays.toString(firstNumberDigits),
                    variables[1], Arrays.toString(secondNumberDigits));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}