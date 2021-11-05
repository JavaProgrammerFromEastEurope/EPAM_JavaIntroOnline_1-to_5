package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Generate a random m x n matrix consisting of zeros and ones,
 * and in each column the number units is equal to column number.
 **/
public class FourteenMatrixFunction extends CustomArrays implements IFunction {

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
        setMatrix(new Integer[(int) variables[0]][(int) variables[1]]);
        for (int i = 0; i < variables[0]; i++)
            for (int j = 0; j < variables[1]; j++)
                getInitMatrix()[i][j] = (j >= i) ? 1 : 0;
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = "14. Matrix\n";
            return format("%n%s %s%n", addString[0],
                    getMatrix(getInitMatrix()));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}