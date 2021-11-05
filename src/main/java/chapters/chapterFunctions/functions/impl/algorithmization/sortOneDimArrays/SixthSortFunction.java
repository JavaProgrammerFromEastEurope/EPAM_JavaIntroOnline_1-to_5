package chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import application.utils.Sort;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Shells sorting
 **/
public class SixthSortFunction extends CustomArrays implements IFunction {

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
        setFirstArray(initLineObjects(false, false, (int) variables[0]));
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 6. Sorted One Dimension Array\n";
            addString[1] = " General Array:";
            addString[2] = " Sorted Array - Shells Method:";
            addString[3] = format("%s%s%n %s", addString[0], addString[1],
                    getArray("", getFirstArray()));
            Sort.sortShells(getFirstArray());
            addString[4] = format("%s%n %s", addString[2],
                    getArray("",getFirstArray()));
            return String.format("%n%s%s%n", addString[3], addString[4]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
