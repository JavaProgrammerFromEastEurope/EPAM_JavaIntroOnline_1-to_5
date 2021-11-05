package chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import application.utils.Maths;
import chapters.chapterFunctions.functions.IFunction;

import java.util.ArrayList;
import java.util.List;

import static chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays.getArray;
import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.stream.IntStream.rangeClosed;

/**
 * Find and print all pairs of "twins" from the segment [n, 2n],
 * where n is a given natural number greater than 2
 **/
public class ThirteenthDecFunction implements IFunction {

    ArrayList<Integer> arrayList;

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
        arrayList = new ArrayList<>();
        rangeClosed((int) variables[0], (int) (2 * variables[0] - 2))
                .filter(this::isPrimeNumber)
                .forEach(index -> arrayList.add(index));
    }

    private boolean isPrimeNumber(int index) {
        return Maths.isPrimeNumber(index)
                && Maths.isPrimeNumber(index + 2);
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 13. Decomposition function\n";
            addString[1] = format(" General Array with twins prime numbers " +
                    "from %.0f to %.0f%n", variables[0], variables[0] * 2);
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], new ArrayList[]{arrayList}));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}