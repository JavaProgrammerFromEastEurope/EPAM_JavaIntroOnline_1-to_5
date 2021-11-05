package chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import chapters.chapterFunctions.functions.IFunction;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.*;
import static java.lang.System.out;

/**
 * 6. Display the correspondences between symbols
 * and their numerical designations in the computer memory.
 **/
public class SixthCycleFunction implements IFunction {

    @Override
    public void calcFunction() {
        /** Empty Method **/
    }

    @Override
    public String getResultString() {
        var resultList = new ArrayList<>();
        for (int i = 122992; i <= 123646; i++) {
            if (i % 15 == 0) {
                resultList.add("\n");
            }
            resultList.add(format("- [%d:%c] ", i, (char) (i)));
        }
        try {
            out.println(IFunction.warning);
            addString[0] = " 6. Cycle function ";
            return format("%n%s%n%s%n", addString[0], List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}