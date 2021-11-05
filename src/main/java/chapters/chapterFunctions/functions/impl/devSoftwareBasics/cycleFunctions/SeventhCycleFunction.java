package chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import chapters.chapterFunctions.functions.IFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * 7. For each natural number in the range from m to n, output all divisors except one and the number itself.
 * The 'm' and 'n' are entered from the keyboard.
 **/
public class SeventhCycleFunction implements IFunction {

    private HashMap<Integer, ArrayList<Integer>> divisorListMap;

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
        ArrayList<Integer> divisorsList;
        divisorListMap = new HashMap<>();

        for (int i = (int) variables[0]; i < (int) variables[1]; i++) {
            divisorsList = new ArrayList<>();
            for (int divisor = 2; divisor < i; divisor++)
                if (i % divisor == 0) {
                    divisorsList.add(divisor);
                }
            divisorListMap.put(i, divisorsList);
        }
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<String>();
            out.println(IFunction.warning);
            addString[0] = " 7. Cycle function ";
            addString[1] = " Divided list of numbers - ";
            resultList.add(format("%s%n%s[%.0f,%.0f]:%n",
                    addString[0], addString[1], variables[0], variables[1]));
            divisorListMap.forEach((key, value) ->
                    resultList.add(format("%d : %s%n", key, value)));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}