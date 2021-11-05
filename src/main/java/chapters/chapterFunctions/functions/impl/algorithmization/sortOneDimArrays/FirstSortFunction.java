package chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Two one-dimensional arrays with different elements and a natural number k are given.
 * Combine them into one array, including the second array between the kth and (k + 1).
 * **/
public class FirstSortFunction extends CustomArrays implements IFunction {

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
        setFirstArray(initLineObjects(true, (int) variables[0], (int) variables[1]));
        setExtraArray(initLineObjects(true, true, (int) variables[1]));
        operation[0] = inputPosition((int) variables[0]);
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 1. Sorted One Dimension Array\n";
            addString[1] = "First Array is";
            addString[2] = "Second array is";
            addString[3] = "Resulting array is";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getFirstArray()));
            resultList.add(getArray(addString[2], getExtraArray()));
            resultList.add(getArray(addString[3],
                    combineArrays(getFirstArray(), getExtraArray(), (int) operation[0])));
            return String.format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}