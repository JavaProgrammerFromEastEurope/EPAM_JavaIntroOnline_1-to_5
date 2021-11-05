package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Fill the 10x20 matrix with random numbers from 0 to 15.
 * Display the matrix itself and the row numbers,
 * in which the number 5 occurs three or more times.
 **/
public class EleventhMatrixFunction extends CustomArrays implements IFunction {

    private ArrayList<Object> objectElementArray;

    private void initArray() {
        objectElementArray = (new ArrayList<>());
        variables[0] = 10;
        variables[1] = 20;
        setMatrix(initMatrix((int) variables[0], (int) variables[1]));
    }

    @Override
    public void calcFunction() {
        initArray();
        for (int i = 0; i < variables[0]; i++) {
            for (int j = 0; j < variables[1]; j++) {
                if (getInitMatrix()[i][j].equals(5))
                    operation[0]++;
            }
            if (operation[0] >= 3)
                objectElementArray.add(i + 1);
            operation[0] = 0;
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 11. Matrix\n";
            addString[1] = " Numbers of lines in which number '5'" +
                              " occurs three or more times:";
            return format("%n%s %s%s%n",
                    addString[0], getMatrix(getInitMatrix()),
                    getArray(addString[1], objectElementArray.toArray()));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}