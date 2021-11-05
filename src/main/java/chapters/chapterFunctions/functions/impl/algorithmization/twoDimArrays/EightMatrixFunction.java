package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * In a numeric matrix, swap two columns of any column, i.e. put all elements of one column
 * to the corresponding positions of the other,
 * and move its elements of the second to the first.
 * Column numbers introduces keyboard user.
 **/
public class EightMatrixFunction extends CustomArrays implements IFunction {

    @Override
    public void calcFunction() {
        variables[0] = 10;
        variables[1] = 20;
        operation[1] = IFunction.super.inputPosition((int) variables[1]);
        operation[2] = IFunction.super.inputPosition((int) variables[1]);
        setMatrix(initMatrix((int) variables[0], (int) variables[1]));
    }

    private void changePositions() {
        int localBound = getInitMatrix().length;
        for (int index = 0; index < localBound; index++) {
            operation[0] = (int) getInitMatrix()[index][(int) (operation[1] - 1)];
            getInitMatrix()[index][(int) (operation[1] - 1)] = getInitMatrix()[index][(int) (operation[2] - 1)];
            getInitMatrix()[index][(int) (operation[2] - 1)] = (int) operation[0];
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 8. Matrix\n";
            addString[1] = format(" Swap %.0f to %.0f matrix columns:\n", operation[1], operation[2]);
            addString[2] = format("%s %s", addString[0], getMatrix(getInitMatrix()));
            this.changePositions();
            addString[3] = format("%s %s", addString[1], getMatrix(getInitMatrix()));
            return format("%n%s%s%n", addString[2], addString[3]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}