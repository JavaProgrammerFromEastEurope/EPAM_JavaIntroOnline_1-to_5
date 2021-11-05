package chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * You are given a sequence of integers a1, a2, ..., an.
 * Form a new sequence by throwing out the original terms
 * that are equal to min (a1, a2, ..., an)
 **/
public class EighthOneDimFunction extends CustomArrays implements IFunction {

    private TreeSet<Object> sortedElementsSet;
    private ArrayList<Object> objectElementArray;

    @Override
    public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
        try {
            IFunction.super.inputVariables(length, bEvenValue, bDouble);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void initArray() {
        sortedElementsSet  = new TreeSet<>();
        objectElementArray = new ArrayList<>();
        setFirstArray(initLineObjects(true, false, (int) variables[0]));
        sortedElementsSet.addAll(
                java.util.Arrays.asList(getFirstArray()).subList(0, getFirstArray().length));
    }

    @Override
    public void calcFunction() {
        initArray();
        for (Object object : getFirstArray())
            if (!object.equals(sortedElementsSet.first()))
                objectElementArray.add(object);
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 8. One Dimension Array";
            addString[1] = "\nGeneral Array:";
            addString[2] = "List of elements higher then min:";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getFirstArray()));
            resultList.add(format("%s%n %s",
                    addString[2], objectElementArray));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
