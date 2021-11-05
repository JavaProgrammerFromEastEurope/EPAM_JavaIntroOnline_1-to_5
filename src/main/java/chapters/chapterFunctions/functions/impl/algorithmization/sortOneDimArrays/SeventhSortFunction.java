package chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import application.utils.Sort;
import chapters.chapterFunctions.functions.IFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays.initLineObjects;
import static chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays.getArray;
import static java.lang.String.*;
import static java.lang.System.out;
import static java.util.Arrays.*;

/**
 * It is required to indicate the places where you want to insert
 * the elements of the sequence in the first sequence.
 **/
public class SeventhSortFunction implements IFunction {

    private ArrayList<Double> firstList;
    private ArrayList<Double> secondList;
    private ArrayList<Integer> indexesList;

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
        firstList = initArrayList((int) variables[0]);
        secondList = initArrayList((int) variables[1]);
        indexesList = getIndexes(firstList, secondList);
    }

    private ArrayList<Double> initArrayList(int bound) {
        return stream(
                 Sort.sortHoare(
                   initLineObjects(false, false, bound), 0, bound - 1))
                .map(object -> (double) object)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private ArrayList<Integer> getIndexes(ArrayList<Double> firstSample, ArrayList<Double> secondSample) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < secondSample.size(); i++) {
            int index = Collections.binarySearch(firstSample, secondSample.get(i));
            if (index < 0) list.add(-(index + 1) + i);
            else list.add(index + i);
        }
        return list;
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 7. Sorted One Dimension Array\n";
            addString[1] = "First Array - Sort of Hoare:";
            addString[2] = "Second Array - Sort of Hoare:";
            addString[3] = "Places to insert sequence elements:";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], firstList.toArray()));
            resultList.add(getArray(addString[2], secondList.toArray()));
            resultList.add(getArray(addString[3], new ArrayList[]{indexesList}));
            for (int i = 0; i < indexesList.size(); i++)
                firstList.add(indexesList.get(i), secondList.get(i));
            resultList.add(getArray("Result Array", firstList.toArray()));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}