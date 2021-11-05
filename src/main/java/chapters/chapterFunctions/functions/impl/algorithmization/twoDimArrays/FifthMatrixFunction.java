package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Form a square matrix of order n according to a given pattern (n is even):
 **/
public class FifthMatrixFunction extends CustomArrays implements IFunction {

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
        int bound = getInitMatrix().length;
        for (int i = 0; i < getInitMatrix().length; i++) {
            for (int j = 0; j < getInitMatrix().length; j++)
                getInitMatrix()[i][j] = (j >= bound) ? 0 : i + 1;
            bound--;
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 5. Matrix\n";
            addString[1] = " Matrix for given";
            return format("%n%s%s[%.0f]%n %s%n", addString[0],
                    addString[1], variables[0], getMatrix(getInitMatrix()));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
