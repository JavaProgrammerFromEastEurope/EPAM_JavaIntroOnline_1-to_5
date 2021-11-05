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
 * Find all Armstrong numbers from 1 to k.
 **/
public class FourteenthDecFunction implements IFunction {

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
        rangeClosed(1, (int) variables[0])
                .filter(this::isArmstrongNumber)
                .forEach(index -> arrayList.add(index));
    }

    private boolean isArmstrongNumber(int number) {
        return Maths.sumOfPowerElements(number) == number;
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 14. Decomposition function\n";
            addString[1] = String.format("The Armstrong numbers " +
                    "from %d to %.0f", 1, variables[0]);
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], new Object[]{arrayList}));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}