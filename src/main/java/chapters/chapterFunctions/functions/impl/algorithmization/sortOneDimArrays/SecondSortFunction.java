package chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import application.sortComparator.impl.function.SortByHigherObject;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static application.utils.Sort.sortLineObjects;
import static java.lang.String.*;
import static java.lang.System.out;

/**
 * Two sequences are given a1 <= a2 <= ... <= an and b1 <= b2 <= ... <= bm.
 * Form a new sequence from them numbers so that it is also non-decreasing.
 **/
public class SecondSortFunction extends CustomArrays implements IFunction {

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
        setFirstArray(initLineObjects(false, (int) variables[0], (int) variables[1]));
        setExtraArray(initLineObjects(true, false, (int) variables[1]));
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 2. Sorted One Dimension Array\n";
            addString[1] = "First sorted Array is";
            addString[2] = "Second sorted array is";
            addString[3] = "Resulting array is";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1],
                    sortLineObjects(getFirstArray(), new SortByHigherObject().reversed())));
            resultList.add(getArray(addString[2],
                    sortLineObjects(getExtraArray(), new SortByHigherObject().reversed())));
            resultList.add(getArray(addString[3],
                    sortLineObjects(combineArrays(getFirstArray(), getExtraArray()),
                            new SortByHigherObject().reversed())));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}