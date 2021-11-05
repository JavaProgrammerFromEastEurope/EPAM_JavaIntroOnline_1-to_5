package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Find the positive elements of the main diagonal of a square matrix.
 **/
public class TenthMatrixFunction extends CustomArrays implements IFunction {

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
        setMatrix(initMatrix((int) variables[0], (int) variables[0]));
        objectElementArray = new ArrayList<>();
        IntStream.range(0, getInitMatrix().length)
                .filter(i -> (int) getInitMatrix()[i][i] > 0)
                .forEach(i -> objectElementArray.add(getInitMatrix()[i][i]));
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 10. Matrix\n";
            addString[1] = "Positive elements of the main diagonal:";
            addString[2] = format("%s %s", addString[0], getMatrix(getInitMatrix()));
            addString[3] = format(" %s", getArray(addString[1], objectElementArray.toArray()));
            return format("%n%s%s%n", addString[2], addString[3]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}