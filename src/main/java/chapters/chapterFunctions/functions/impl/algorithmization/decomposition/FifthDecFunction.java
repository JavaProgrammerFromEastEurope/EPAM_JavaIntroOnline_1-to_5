package chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import application.utils.Maths;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Print a number, which is less than the maximum element of the array,
 * but more than all other elements.
 **/
public class FifthDecFunction extends CustomArrays implements IFunction {

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
        setFirstArray(initLineObjects(true, true, (int) variables[0]));
        operation[0] = Maths.previousMax(java.util.Arrays.stream(getFirstArray())
                .map(Object::toString).map(Integer::valueOf).toArray(Integer[]::new));
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 5. Decomposition function\n";
            addString[1] = " The Array:";
            addString[2] = " The Next Before Max element is:";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getFirstArray()));
            resultList.add(format("%s %.0f",
                            addString[2], operation[0]));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}