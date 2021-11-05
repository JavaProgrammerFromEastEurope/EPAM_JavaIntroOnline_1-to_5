package chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import chapters.chapterFunctions.functions.IFunction;

import static application.utils.Maths.gcf;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Find the greatest common factor of four natural numbers.
 **/
public class SecondDecFunction implements IFunction {

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
        operation[0] = gcf(gcf((int) variables[0], (int) variables[1]),
                gcf((int) variables[2], (int) variables[3]));
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 2. Decomposition function";
            addString[1] = " The numbers:";
            addString[2] = "The Greatest Common Factor is:";
            addString[3] = (format("%s%n%s[%.0f,%.0f,%.0f,%.0f]%n %s[%.0f]",
                    addString[0], addString[1], variables[0], variables[1],
                    variables[2], variables[3], addString[2], operation[0]));
            return format("%n%s%n", addString[3]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}