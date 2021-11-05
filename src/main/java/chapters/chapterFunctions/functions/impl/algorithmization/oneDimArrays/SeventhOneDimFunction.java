package chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * You are given real numbers a1, a2, ..., an.
 * To find max (a1 + a2n, a2 + a2n − 1, ..., an + an + 1).
 **/
public class SeventhOneDimFunction extends CustomArrays implements IFunction {

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
        int halfBound = getFirstArray().length / 2;
        for (int index = 0; index < halfBound; index++) {
            operation[0] = max(isMax(index,
                    getFirstArray().length - 1), operation[0]);
        }
    }

    private double isMax(int index, int localBound) {
        return  (double) getFirstArray()[index] +
                (double) getFirstArray()[localBound - index];
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 7. One Dimension Array\n";
            addString[1] = "General Array";
            addString[2] = "Max sum of twins elements - %.3f";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getFirstArray()));
            resultList.add(format(addString[2], operation[0]));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}