package chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.lang.Math.max;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Find the most frequent number in an array of integers with n elements. If such
 * there are several numbers, then determine the smallest of them
 **/
public class NinthOneDimFunction extends CustomArrays implements IFunction {

    private TreeMap<Object, Integer> treeMap;
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
        setFirstArray(initLineObjects(true, false, (int) variables[0]));
        sortedElementsSet.addAll(java.util.Arrays.asList(getFirstArray()).subList(0, getFirstArray().length));
    }

    private void initTreeMap() {
        treeMap = new TreeMap<>();
        int localBound = sortedElementsSet.size();
        for (int index = 0; index < localBound; index++) {
            treeMap.put(sortedElementsSet.pollFirst(), 0);
        }
    }

    private void incValueMap() {
        for (Object object : getFirstArray()) {
            treeMap.put(object, treeMap.get(object) + 1);
            operation[0] = max(operation[0], treeMap.get(object));
        }
    }

    private void addMaxValueToSet() {
        treeMap.forEach((key, value) -> {
            if (value.equals((int) operation[0])) {
                sortedElementsSet.add(key);
            }
        });
    }

    @Override
    public void calcFunction() {
        initArray();
        initTreeMap();
        incValueMap();
        addMaxValueToSet();
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 9. One Dimension Array\n";
            addString[1] = "Most frequent number key (lowest)";
            addString[2] = "The Map with key - array number, and value - frequent number:\n";
            resultList.add(addString[0]);
            resultList.add(addString[2]);
            treeMap.forEach((key, value) ->
                    resultList.add(format(" [ %s : %d ]", key, value)));
            resultList.add(format("%n %s[%s]", addString[1], sortedElementsSet.first()));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}