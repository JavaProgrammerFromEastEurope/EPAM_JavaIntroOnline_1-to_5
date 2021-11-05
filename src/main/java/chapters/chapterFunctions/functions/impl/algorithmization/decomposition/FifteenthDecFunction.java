package chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import application.utils.Maths;
import chapters.chapterFunctions.functions.IFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;

import static chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays.getArray;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Find all natural n-digit numbers whose digits form a strictly increasing sequence.
 **/
public class FifteenthDecFunction implements IFunction {

    TreeSet<Integer> treeSet;

    @Override
    public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
        try {
            variables[0] = IFunction.super.inputPosition(10);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private boolean isStrictlyOrderedSequence(int number) {
        return Maths.isStrictlyOrderedSequence(number);
    }

    @Override
    public void calcFunction() {
        treeSet = new TreeSet<>();
        IntStream.rangeClosed(Maths.setDimension((int) variables[0]),
                Maths.setDimension((int) variables[0] + 1))
                .filter(this::isStrictlyOrderedSequence)
                .forEach(index -> treeSet.add(index));
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 15. Decomposition function";
            addString[1] = format("\n The Strictly Ordered Sequence to %.0f%n", variables[0]);
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], new Object[]{treeSet}));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}