package chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * The Array A[N] contains natural numbers.
 * Find the sum of those elements that are multiples of a given K
 **/
public class FirstOneDimFunction extends CustomArrays implements IFunction {

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
        for (Object object : getFirstArray()) {
            if ((int) object % variables[1] == 0) {
                operation[0] += (int) object;
            }
        }
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 1. One Dimension Array";
            addString[1] = "\n General array";
            addString[2] = " Sum of elements multiple";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getFirstArray()));
            resultList.add(format(" %s %.0f is %.0f",
                    addString[2], variables[1], operation[0]));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
