package chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import application.utils.Maths;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Determine the following sums:
 * D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
 **/
public class EighthDecFunction extends CustomArrays implements IFunction {

    @Override
    public void calcFunction() {
        setFirstArray(initLineObjects(true, true, 6));
        Integer[] firstArray = java.util.Arrays.stream(getFirstArray())
                .map(Object::toString).map(Integer::valueOf).toArray(Integer[]::new);
        operation[0] = Maths.sumOfIndexValues(firstArray, 1, 3);
        operation[1] = Maths.sumOfIndexValues(firstArray, 3, 5);
        operation[2] = Maths.sumOfIndexValues(firstArray, 4, 6);
    }

    @Override
    public String getResultString() {

        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 8. Decomposition function ";
            addString[1] = "\n The integer array itself:";
            addString[2] = "Sum of elements between elements";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getFirstArray()));
            resultList.add(
                    format(" %s 1 & 3: %.0f%n " +
                            "%s 3 & 5: %.0f%n " +
                            "%s 4 & 6: %.0f%n",
                    addString[2], operation[0], addString[2],
                    operation[1], addString[2], operation[2]));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}