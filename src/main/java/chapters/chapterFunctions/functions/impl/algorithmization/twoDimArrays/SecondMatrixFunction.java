package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * You are given a square matrix. Display the elements on the diagonal.
 **/
public class SecondMatrixFunction extends CustomArrays implements IFunction {

    @Override
    public void calcFunction() {
        setMatrix(new Integer[][]{{9, 2, 4, 4}, {8, 3, 4, 4}, {7, 5, 3, 4}, {6, 2, 3, 1}});
        getMatrix(getInitMatrix());
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 2. Matrix\n";
            addString[1] = " The elements on general diagonal is:\n";
            resultList.add(format("%s%s %s", addString[0], addString[1],
                        getMatrix(getInitMatrix())));
            IntStream.range(0, getInitMatrix().length)
                    .forEach(i ->
                        resultList.add(format(" %s", getInitMatrix()[i][i])));
            return format("%n%s%n", resultList);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}