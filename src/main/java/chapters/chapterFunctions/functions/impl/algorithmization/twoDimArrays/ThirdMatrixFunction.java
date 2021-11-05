package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.*;
import static java.lang.System.out;

/**
 * A matrix is given. Print the k-th row and p-th column of the matrix.
 **/
public class ThirdMatrixFunction extends CustomArrays implements IFunction {

    @Override
    public void calcFunction() {
        setMatrix(new Integer[][]{{9, 8, 7, 6}, {5, 4, 3, 2}, {1, 0, 1, 2}, {3, 4, 5, 6}});
        getMatrix(getInitMatrix());
        operation[0] = inputPosition(getInitMatrix().length) - 1;
        operation[1] = inputPosition(getInitMatrix().length) - 1;
    }

    private List<Object> printMatrixElement(boolean bLine, int element) {
        var objectList = new ArrayList<>();
        for (int i = 0; i < getInitMatrix().length; i++)
            objectList.add(format(" %s", bLine
                    ? getInitMatrix()[element][i]
                    : getInitMatrix()[i][element]));
        objectList.add("\n");
        return objectList;
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 3. Matrix\n";
            addString[1] = format(" %s %s", addString[0], getMatrix(getInitMatrix()));
            addString[2] = format(" Print %.0f Line:%n  %s",  operation[0]+1,
                    printMatrixElement( true, (int) operation[0]));
            addString[3] = format(" Print %.0f Column:%n  %s",operation[1]+1,
                    printMatrixElement(false, (int) operation[1]));
            return format("%n%s%s%s%n", addString[1], addString[2], addString[3]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}