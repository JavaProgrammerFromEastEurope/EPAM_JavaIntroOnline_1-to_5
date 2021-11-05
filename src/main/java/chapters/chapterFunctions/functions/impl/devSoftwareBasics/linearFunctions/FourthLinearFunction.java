package chapters.chapterFunctions.functions.impl.devSoftwareBasics.linearFunctions;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.String.*;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * 4. You are given a real number R of the form nnn.ddd (three digital digits in fractional and integer parts).
 * Swap fractional and integer parts of the number and display the resulting value of the number.
 * use input with comma -',', not dot '.'
 **/
public class FourthLinearFunction implements IFunction {

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
        getResultString();
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 4. Linear function ";
            addString[1] = " The number write back of ";
            String[] splitter = valueOf(variables[0]).split("\\.");
            return format("%n%s%n%s%.3f - %.3f %n",
                    addString[0], addString[1], variables[0],
                    Double.parseDouble(format("%s.%s", splitter[1], splitter[0])));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}