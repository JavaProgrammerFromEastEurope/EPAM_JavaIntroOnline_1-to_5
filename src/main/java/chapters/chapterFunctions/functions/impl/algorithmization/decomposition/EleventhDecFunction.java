package chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import application.utils.Maths;
import chapters.chapterFunctions.functions.IFunction;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Determine which of the given two numbers has more digits.
 **/
public class EleventhDecFunction implements IFunction {

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
        operation[0] = Maths.countOfElements((int) variables[0]);
        operation[1] = Maths.countOfElements((int) variables[1]);
        operation[2] = (operation[0] != operation[1])
                ?  operation[0] > operation[1]
                ?  variables[0] : variables[1] : 0;
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 11. Decomposition function ";
            addString[1] = " The number with max elements between";
            resultList.add(String.format("%s%n%s %.0f & %.0f is %.0f",
                    addString[0], addString[1],
                    variables[0], variables[1], operation[2]));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}