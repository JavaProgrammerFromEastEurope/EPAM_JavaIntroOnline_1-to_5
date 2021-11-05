package chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import application.utils.Maths;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Forming an array, the elements of which
 * are the digits of the number N
 **/
public class TenthDecFunction extends CustomArrays implements IFunction {

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
        operation[0] = variables[0];
        operation[1] = Maths.countOfElements((int) variables[0]);
        setFirstArray(new Object[(int) operation[0]]);
        for (int i = (int) operation[1]; i > 0; i--) {
            getFirstArray()[i] = (int) operation[0] % 10;
            operation[0] /= 10;
        }
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 10. Decomposition function\n";
            addString[1] = "The Array with elements of a variable";
            resultList.add(addString[0]);
            resultList.add(getArray(format("%s %d", addString[1],
                    (int) variables[0]), getFirstArray()));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}