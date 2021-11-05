package chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Arrays.copyOf;

/**
 * An integer array is given with the number of elements n.
 * Compress the array by throwing out every second element (fill the vacated elements with zeros).
 * Note. Do not use additional array.
 **/
public class TenthOneDimFunction extends CustomArrays implements IFunction {

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
        setFirstArray(initLineObjects(true, true, (int) variables[0]));
    }

    private void makeCalculation() {
        int localBound = getFirstArray().length;
        int index = 0;
        for (int step = 0; step < localBound; step += 2) {
            getFirstArray()[index++] = getFirstArray()[step];
        }
        setFirstArray(copyOf(getFirstArray(),
                (localBound + getFirstArray().length % 2) / 2));
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 10. One Dimension Array\n";
            addString[1] = " General Array";
            addString[3] = " Array compressed by double:";
            addString[2] = format("%s%s%n%s%n", addString[0],
                    addString[1], List.of(getFirstArray()));
            resultList.add(addString[2]);
            makeCalculation();
            resultList.add(format("%s",
                    List.of(getArray(addString[3], getFirstArray()))));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}