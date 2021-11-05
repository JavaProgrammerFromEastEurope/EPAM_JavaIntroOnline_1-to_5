package chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * A sequence of real numbers a1, a2, ..., an is given.
 * Replace all its members larger than the given Z with this number.
 * Count the number of substitutions.
 **/
public class SecondOneDimFunction extends CustomArrays implements IFunction {

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
        setFirstArray(initLineObjects(false, true, (int) variables[0]));
        setExtraArray(getFirstArray().clone());
        int bound = getFirstArray().length;
        for (int index = 0; index < bound; index++) {
            if ((double) getFirstArray()[index] > variables[1]) {
                getFirstArray()[index] = variables[1];
                operation[0]++;
            }
        }
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 2. One Dimension Array\n";
            addString[1] = "General Array";
            addString[2] = "Modified array";
            addString[3] = "with elements higher then";
            addString[4] = "number of replacements";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getExtraArray()));
            resultList.add(getArray(addString[2], getFirstArray()));
            resultList.add(format(" %s %.0f %s %.0f%n%n",
                    addString[4], operation[0], addString[3], variables[1]));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}