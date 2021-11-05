package chapters.chapterFunctions.functions.impl.devSoftwareBasics.linearFunctions;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.Math.*;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * 3. Calculate the value of the expression using the formula (all variables take on real values):
 * (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 / 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 𝑥𝑦
 **/
public class ThirdLinearFunction implements IFunction {

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
        /* sin(x) + cos(y) */
        operation[0] = sin(variables[0]) + cos(variables[1]);
        /* cos(x) - sin(y) */
        operation[1] = cos(variables[0]) - sin(variables[1]);
        /* (sin(x) + cos(y)) / (cos(x) - sin(y)) */
        operation[2] = operation[0] / operation[1];
        /* (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(xy)  */
        operation[3] = operation[2] * tan(variables[0] * variables[1]);
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = format("3. Linear Function:\n" +
                    " (sin(%.0f) + cos(%.0f)) /" +
                    " (cos(%.0f) - sin(%.0f)) * tan(%.0f*%.0f) =",
                    variables[0], variables[1], variables[0],
                    variables[1], variables[0], variables[1]);
            return format("%n%s %.1f%n", addString[0], operation[3]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
