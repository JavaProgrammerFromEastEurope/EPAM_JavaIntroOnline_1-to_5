package chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import application.utils.Maths;
import chapters.chapterFunctions.functions.IFunction;

import java.util.ArrayList;
import java.util.List;

import static chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays.getArray;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Format of array A, whose elements
 * are numbers and sum of digits is equal to K and which are not greater than N
 **/
public class TwelfthDecFunction implements IFunction {

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
        for (int i = 1; i < variables[1]; i++) {
            if (Maths.sumOfNumberDigits(i) == variables[0]) {
                arrayList.add(i);
            }
        }
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 12. Decomposition function\n";
            addString[1] =
                format("The Array with elements " +
                        "those sum of digits equals %.0f and less then %.0f%n",
                            variables[0], variables[1]);
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], new ArrayList[]{arrayList}));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}