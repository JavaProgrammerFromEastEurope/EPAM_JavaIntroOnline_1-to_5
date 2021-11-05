package chapters.chapterFunctions.functions.impl.algorithmization.oneDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * An array of real numbers is given, the dimension of which is N.
 * Calculate how many negative numbers there are in it,
 * positive and zero elements.
 **/
public class ThirdOneDimFunction extends CustomArrays implements IFunction {

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
        super.setFirstArray(initLineObjects(false, false, (int) variables[0]));
        for (Object object : getFirstArray())
            if ((double) object < 0) operation[2]++;
            else if ((double) object > 0) operation[1]++;
            else if ((double) object == 0) operation[0]++;
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 3. One Dimension Array\n";
            addString[1] = "General Array"; addString[2] = "positive";
            addString[3] = "negative";      addString[4] = "equal";
            addString[5] = "elements";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getFirstArray()));
            resultList.add(format(" %s %s - %.0f, %s %s - %.0f, %s %s - %.0f",
                    addString[2], addString[5], operation[1],
                    addString[3], addString[5], operation[2],
                    addString[4], addString[5], operation[0]));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
