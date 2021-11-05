package chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

/**
 * Integers a1, a2, ..., aN -  are given.
 * Print only those numbers for which aI > I.
 **/
public class FifthOneDimFunction extends CustomArrays implements IFunction {

    private ArrayList<Object> objectElementArray;

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
        objectElementArray = new ArrayList<>();
        range(0, getFirstArray().length)
                .filter(index -> (int) getFirstArray()[index] > index)
                .forEach(index -> objectElementArray.add(getFirstArray()[index]));
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 5. One Dimension Array";
            addString[1] = "\nGeneral Array:";
            addString[2] = "List of elements higher then index:";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getFirstArray()));
            resultList.add(format("%s%n %s",
                    addString[2], objectElementArray));
            return format("%s%n%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}