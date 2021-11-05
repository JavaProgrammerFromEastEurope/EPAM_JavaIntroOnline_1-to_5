package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Form a square matrix of order N according to the rule:
 **/
public class SeventhMatrixFunction extends CustomArrays implements IFunction {

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
        setMatrix(new Double[(int) variables[0]][(int) variables[0]]);
        for (int i = 0; i < getInitMatrix().length; i++) {
            for (int j = 0; j < getInitMatrix().length; j++) {
                getInitMatrix()[i][j] = sin(pow(i, 2) - pow(j, 2)) / variables[0];
                if ((double) getInitMatrix()[i][j] > 0) operation[0]++;
            }
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 7. Matrix\n";
            addString[1] = " Number of positive elements:";
            addString[2] = format(" %s%s %.0f", getMatrix(getInitMatrix()),
                    addString[1], operation[0]);
            return format("%n%s%s%n", addString[0], addString[2]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}