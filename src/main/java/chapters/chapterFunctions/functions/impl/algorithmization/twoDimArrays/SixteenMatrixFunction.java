package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.*;
import static java.lang.System.out;

/**
 * A magic square of order n is a square nxn matrix composed of numbers 1, 2, 3, ..., n2
 * so that the sums for each column, each row, and each of the two large diagonals are equals.
 * **/
public class SixteenMatrixFunction extends CustomArrays implements IFunction {

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
        if (variables[0] % 2 == 1)
            initOddMagicSquare();
        else initEvenMagicSquare();
    }

    private void initOddMagicSquare() {
        operation[0] = (int) variables[0] >> 1;
        operation[1] = 1;
        for (int i = 0; i < getInitMatrix().length; i++)
            for (int j = 0; j < getInitMatrix().length; j++) {
                operation[2] = (-operation[0] + i + j + variables[0]) % variables[0];
                operation[3] = ( operation[0] + i - j + variables[0]) % variables[0];
                getInitMatrix()[(int) operation[2]][(int) operation[3]]
                             = (int) operation[1]++;
            }
    }

    private void initEvenMagicSquare() {
        for (int i = 0; i < variables[0]; i++)
            for (int j = 0; j < variables[0]; j++)
                getInitMatrix()[i][j] = ((int) variables[0] * i) + j + 1;

        additionEvenMagicOperation(
                0, (int) variables[0] >> 2,
                0, (int) variables[0] >> 2);
        additionEvenMagicOperation(
                3 * (int) variables[0] >> 2, (int) variables[0],
                3 * (int) variables[0] >> 2, (int) variables[0]);
        additionEvenMagicOperation(
                (int) variables[0] >> 2, 3 * (int) variables[0] >> 2,
                (int) variables[0] >> 2, 3 * (int) variables[0] >> 2);
        additionEvenMagicOperation(
                0, (int) variables[0] >> 2,
                3 * (int) variables[0] >> 2, (int) variables[0]);
        additionEvenMagicOperation(
                3 * (int) variables[0] >> 2, (int) variables[0],
                0, (int) variables[0] >> 2);
    }

    private void additionEvenMagicOperation(int xStart, int xFinish, int yStart, int yFinish) {
        for (int x = xStart; x < xFinish; x++)
            for (int y = yStart; y < yFinish; y++)
                getInitMatrix()[x][y] = ((int) variables[0] * (int) variables[0] + 1) - (int) getInitMatrix()[x][y];
    }

    private List<Object> reverseIndexPrintMatrix() {
        var objectList = new ArrayList<>();
        for (int i = (int) variables[0] - 1; i >= 0; i--) {
            objectList.add(getLineObjects(getInitMatrix()[i]));
            objectList.add("\n");
        }
        objectList.add("\n");
        return objectList;
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 16. Matrix\n";
            addString[1] = "Magic Square";
            if ((int) variables[0] % 2 == 1)
                 addString[2] = format("%s Odd %s for %.0f%n %s", addString[0],
                      addString[1], variables[0], reverseIndexPrintMatrix());
            else addString[2] = format("%s Even %s for %.0f%n %s", addString[0],
                      addString[1], variables[0], getMatrix(getInitMatrix()));
            return format("%n%s%n", addString[2]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}