package chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import application.utils.Input;
import chapters.chapterFunctions.functions.IFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * 2. Calculate the values of the function on the segment [a, b] with step h:
 * ->  x, x > 2
 * -> -x, x <= 2
 **/
public class SecondCycleFunction implements IFunction {

    private TreeMap<Integer, Integer> iTreeMap;

    @Override
    public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
        try {
            variables[0] = Input.anyIntInitialize("Start segment:");
            variables[1] = Input.anyIntInitialize("End segment:");
            variables[2] = Input.anyIntInitialize("Step:");
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calcFunction() {
        iTreeMap = new TreeMap<>();
        for (int i = (int) variables[0]; i <= variables[1]; i += variables[2]) {
            iTreeMap.put(i, i > 2 ? i : -i);
        }
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 2. Cycle function ";
            addString[1] = " The values of function on array - ";
            resultList.add(format("%s%n%s[%.0f,%.0f] with step %.0f:%n",
                    addString[0], addString[1],
                    variables[0], variables[1], variables[2]));
            iTreeMap.forEach((key, value) ->
                    resultList.add(format("[%d : %s] ", key, value)));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}