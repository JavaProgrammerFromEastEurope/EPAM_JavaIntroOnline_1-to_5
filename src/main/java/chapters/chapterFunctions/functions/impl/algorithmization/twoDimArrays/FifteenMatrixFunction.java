package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.TreeSet;

import static java.lang.Math.max;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Find the largest element of the matrix and replace all odd elements with it.
 **/
public class FifteenMatrixFunction extends CustomArrays implements IFunction {

    private TreeSet<Object> sortedElementsSet;

    private void initArray() {
        variables[0] = 10;
        variables[1] = 20;
        sortedElementsSet = new TreeSet<>();
        setMatrix(initMatrix((int) variables[0], (int) variables[1]));
    }

    private void findMaxElement() {
        for (Object[] objects : getInitMatrix()) {
            sortedElementsSet.addAll(java.util.Arrays.asList(objects).subList(0, objects.length));
            operation[0] = max((int) sortedElementsSet.last(), operation[0]);
        }
    }

    private void initOddElements() {
        for (int i = 0; i < variables[0]; i++)
            for (int j = 0; j < variables[1]; j++)
                if ((j % 2) == 0) getInitMatrix()[i][j] = (int) operation[0];
    }

    @Override
    public void calcFunction() {
        initArray();
        getMatrix(getInitMatrix());
        findMaxElement();
        initOddElements();
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 15. Matrix\n";
            addString[1] = format(" The largest element of the matrix %.0f\n" +
                    " and replace all odd elements with it\n", operation[0]);
            return format("%n%s%s %s%n", addString[0],
                    addString[1], getMatrix(getInitMatrix()));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}