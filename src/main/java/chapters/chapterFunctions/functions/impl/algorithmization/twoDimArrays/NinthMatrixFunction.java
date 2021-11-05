package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import application.utils.Input;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * A matrix of non-negative numbers is given.
 * Calculate the sum of the items in each column.
 * Determine which the column contains the maximum amount
 **/
public class NinthMatrixFunction extends CustomArrays implements IFunction {

    private ArrayList<Object> objectElementArray;

    @Override
    public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
        try {
            variables[0] = Input.anyIntInitialize("Enter any positive value:");
            variables[1] = variables[0];
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calcFunction() {
        objectElementArray = new ArrayList<>();
        setMatrix(initMatrix((int) variables[0], (int) variables[1]));
        for (int i = 0; i < variables[0]; i++) {
            for (int j = 0; j < variables[1]; j++) {
                operation[0] += (int) getInitMatrix()[j][i];
            }
            objectElementArray.add((int) operation[0]);
            if ((int) operation[1] < operation[0]) {
                operation[1] = (int) operation[0];
                operation[2] = i + 1;
            }
            operation[0] = 0;
        }
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = "9. Matrix\n";
            addString[1] = "Max column value";
            addString[2] = "The column itself";
            addString[3] = "The sum of elements at columns\n";
            resultList.add(format("%n%s %s%n", addString[0], getMatrix(getInitMatrix())));
            resultList.add(getArray(addString[3],
                    objectElementArray.toArray()));
            resultList.add(format("%s - %.0f,%n - %s %.0f",
                    addString[1], operation[1],
                    addString[2], operation[2]));
            return format("%n%s%n", resultList);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}