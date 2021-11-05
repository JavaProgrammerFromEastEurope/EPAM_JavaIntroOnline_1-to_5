package chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import application.utils.Maths;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

/**
 * Calculate the sum of numbers whose ordinal numbers
 * are prime numbers.
 **/
public class SixthOneDimFunction extends CustomArrays implements IFunction{

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
        setFirstArray(initLineObjects(false, true, (int)variables[0]));
        range(0, getFirstArray().length)
                .filter(Maths::isPrimeNumber)
                .forEach(index ->
                    operation[0] += (double) getFirstArray()[index]);
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 6. One Dimension Array\n";
            addString[1] = "General Array";
            addString[2] = "Sum of numbers whose ordinal indexes are prime";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getFirstArray()));
            resultList.add(format(" %s - %.3f", addString[2], operation[0]));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}