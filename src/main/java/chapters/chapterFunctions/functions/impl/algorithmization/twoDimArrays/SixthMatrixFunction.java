package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Form a square matrix of order n according to a given pattern (n is even):
 **/
public class SixthMatrixFunction extends CustomArrays implements IFunction {

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
        setMatrix(new Integer[(int)variables[0]][(int)variables[0]]);
        operation[0] = getInitMatrix().length >> 1;
        operation[1] = getInitMatrix().length;
        for (int i = 0; i < (int)operation[0]; i++) {
            for (int j = 0; j < getInitMatrix().length; j++) {
                getInitMatrix()[i][j] = (j < (int)operation[1] && j >= (int)operation[2]) ? 1 : 0;
            }
            --operation[1]; operation[2]++;
        }
        for (int i = (int) (int)operation[0]; i < getInitMatrix().length; i++) {
            --operation[1];
            for (int j = 0; j < getInitMatrix().length; j++) {
                getInitMatrix()[i][j] = (j >= operation[1] && j <= operation[2]) ? 1 : 0;
            }
            operation[2]++;
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 6. Matrix\n";
            addString[1] = " Matrix for given";
            return format("%n%s%s[%.0f]%n %s%n", addString[0],
                    addString[1], variables[0], getMatrix(getInitMatrix()));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}