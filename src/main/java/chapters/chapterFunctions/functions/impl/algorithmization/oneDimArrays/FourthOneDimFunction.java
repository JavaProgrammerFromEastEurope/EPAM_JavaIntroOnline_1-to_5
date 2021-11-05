package chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * You are given real numbers a1, a2, ..., an.
 * Swap the largest and smallest items.
 **/
public class FourthOneDimFunction extends CustomArrays implements IFunction {

    private TreeSet<Object> sortedElementsSet;

    @Override
    public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
        try {
            IFunction.super.inputVariables(length, bEvenValue, bDouble);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void initArray() {
        sortedElementsSet = new TreeSet<>();
        setFirstArray(initLineObjects(true, true, (int) variables[0]));
        sortedElementsSet.addAll(java.util.Arrays.asList(
                getFirstArray()).subList(0, getFirstArray().length));
        setExtraArray(getFirstArray().clone());
    }

    @Override
    public void calcFunction() {
        initArray();
        int localBound = getFirstArray().length;
        for (int index = 0; index < localBound; index++) {
            if (getFirstArray()[index].equals(sortedElementsSet.first()))
                getFirstArray()[index] = sortedElementsSet.last();
            else if (getFirstArray()[index].equals(sortedElementsSet.last()))
                getFirstArray()[index] = sortedElementsSet.first();
        }
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 4. One Dimension Array\n";
            addString[1] = "General Array"; addString[2] = "Modified Array";
            addString[3] = "largest";       addString[4] = "smallest";
            addString[5] = "element";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getExtraArray()));
            resultList.add(getArray(addString[2], getFirstArray()));
            resultList.add(format(" %s %s - %s, %s %s - %s",
                    addString[3], addString[5], sortedElementsSet.last(),
                    addString[4], addString[5], sortedElementsSet.first()));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}