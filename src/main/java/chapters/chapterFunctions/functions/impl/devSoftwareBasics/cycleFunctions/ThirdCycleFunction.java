package chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.Math.pow;
import static java.lang.String.*;
import static java.lang.System.out;

/**
 * 3. Find the sum of the squares of the first hundred numbers.
 **/
public class ThirdCycleFunction implements IFunction {

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
        for (int index = 1; index <= 100; index++) {
            operation[3] += pow(index, 2);
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 3. Cycle function ";
            addString[1] = " Sum of the squares of the first hundred numbers:";
            return format("%n%s%n%s %.0f%n",
                    addString[0], addString[1], operation[3]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
