package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Form a square matrix of order n according to a given pattern (n is even):
 **/
public class FourthMatrixFunction extends CustomArrays implements IFunction {

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
        setMatrix(new Integer[(int) variables[0]][(int) variables[0]]);
        for (int i = 0; i < getInitMatrix().length; i++)
            for (int j = 0; j < getInitMatrix().length; j++)
                getInitMatrix()[i][j] = ((i % 2) == 0)
                        ? (int) ++operation[0] : (int) operation[0]--;
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = "4. Matrix\n";
            return format("%n%s %s%n", addString[0], getMatrix(getInitMatrix()));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}