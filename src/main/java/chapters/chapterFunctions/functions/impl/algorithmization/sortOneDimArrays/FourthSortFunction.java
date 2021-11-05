package chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import application.sortComparator.impl.function.SortByHigherObject;
import application.utils.Sort;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static application.utils.Sort.sortLineObjects;
import static java.lang.System.out;

/**
 * Sort by exchanging.
 **/
public class FourthSortFunction extends CustomArrays implements IFunction {

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
        setFirstArray(initLineObjects(true, false, (int) variables[0]));
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 4. Sorted One Dimension Array\n";
            addString[1] = " General Array";
            addString[2] = " Sorted by Exchenging Array";
            resultList.add(addString[0]);
            resultList.add(
                      getArray(addString[1],
                        sortLineObjects(getFirstArray(),
                            new SortByHigherObject().reversed())));
            Sort.sortExchange(getFirstArray());
            resultList.add(getArray(addString[2], getFirstArray()));
            return String.format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}