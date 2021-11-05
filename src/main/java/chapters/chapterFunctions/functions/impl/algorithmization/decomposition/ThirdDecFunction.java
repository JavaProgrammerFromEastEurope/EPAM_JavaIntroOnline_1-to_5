package chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.Math.*;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Calculate the area of a regular hexagon with side 'a'
 * using the area calculation method triangle.
 **/
public class ThirdDecFunction implements IFunction {

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
        operation[0] = pow(variables[0], 2) * sqrt(3) / 4;
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 3. Decomposition function";
            addString[1] = " Area of a regular hexagon with side:";
            addString[2] = format("%s%n%s %.0f - %.0f",
                    addString[0], addString[1], variables[0], operation[0]);
            return format("%n%s%n", addString[2]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}