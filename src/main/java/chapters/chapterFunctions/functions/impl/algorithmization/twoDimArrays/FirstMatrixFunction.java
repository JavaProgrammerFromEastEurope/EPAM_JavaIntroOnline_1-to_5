package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.stream.IntStream.iterate;

/**
 * A matrix is given.
 * Display all odd columns with the first item greater than the last.
 **/
public class FirstMatrixFunction extends CustomArrays implements IFunction {

    private ArrayList<Object> objectElementArray;

    @Override
    public void calcFunction() {
        objectElementArray = (new ArrayList<>());
        setMatrix(new Integer[][]{{9, 2, 4, 5}, {8, 3, 4, 5}, {7, 5, 3, 6}, {6, 2, 5, 5}});
        int localBound = getInitMatrix().length - 1;
        for (Object[] objects : getInitMatrix()) {
            iterate(0, column -> column <= localBound, column -> column + 2)
                    .filter(column -> (int) getInitMatrix()[0][column] > (int) getInitMatrix()[localBound][column])
                    .forEach(column -> objectElementArray.add(objects[column]));
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = "1. Matrix\n";
            addString[1] = "First Element Odd Columns greater than the last";
            addString[2] = format("%s:%n%s%n", addString[1], objectElementArray);
            return format("%n%s%s %s%n", addString[0],
                    addString[2], getMatrix(getInitMatrix()));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
