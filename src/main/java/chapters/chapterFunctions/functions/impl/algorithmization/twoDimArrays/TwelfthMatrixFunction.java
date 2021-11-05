package chapters.chapterFunctions.functions.impl.algorithmization.twoDimArrays;

import application.sortComparator.impl.function.SortByHigherObject;
import application.utils.Sort;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Sort matrix rows in ascending and descending order of element values.
 **/
public class TwelfthMatrixFunction extends CustomArrays implements IFunction {

    @Override
    public void calcFunction() {
        variables[0] = 10;
        variables[1] = 20;
        setMatrix(initMatrix((int) variables[0], (int) variables[1]));
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 12. Matrix\n";
            addString[1] = " Sorting matrix rows in ascending and descending order\n";
            addString[2] = format("%s %s", addString[1], getMatrix(getInitMatrix()));
            addString[3] = format("%s",
                    getMatrix(Sort.sortMatrixObjects(getInitMatrix(),
                            new SortByHigherObject())));
            addString[4] = format("%s",
                    getMatrix(Sort.sortMatrixObjects(getInitMatrix(),
                            new SortByHigherObject().reversed())));
            return format("%n%s%s%s%s%n", addString[0],
                    addString[2], addString[3], addString[4]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}