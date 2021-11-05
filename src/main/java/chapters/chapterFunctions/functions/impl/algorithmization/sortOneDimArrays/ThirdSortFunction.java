package chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import application.sortComparator.impl.function.SortByHigherObject;
import application.utils.Sort;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import static application.utils.Sort.sortLineObjects;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Sort by Selection.
 **/
public class ThirdSortFunction extends CustomArrays implements IFunction {

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
        setFirstArray(initLineObjects(true, false, (int) variables[0]));
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 3. Sorted One Dimension Array\n";
            addString[1] = " General Array";
            addString[2] = " Sorted by Selection Array";
            addString[3] = format("%s %s", addString[0],
                    getArray(addString[1],
                        sortLineObjects(getFirstArray(),
                            new SortByHigherObject().reversed())));
            Sort.sortSelection(getFirstArray());
            addString[4] = format("%s",getArray(addString[2], getFirstArray()));
            return format("%n%s%s%n", addString[3], addString[4]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
