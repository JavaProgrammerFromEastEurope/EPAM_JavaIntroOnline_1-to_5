package chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import application.utils.Maths;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.algorithmization.CustomArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

public class SixthDecFunction extends CustomArrays implements IFunction {

    @Override
    public void calcFunction() {
        setFirstArray(initLineObjects(true, true, 3));
    }

    private boolean areCoprimes(int first, int second, int third) {
        return Maths.gcd(Maths.gcd(first, second), third) == 1;
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 6. Decomposition function\n";
            addString[1] = " The Array itself: ";
            resultList.add(addString[0]);
            resultList.add(getArray(addString[1], getFirstArray()));
            resultList.add(
                areCoprimes((int) getFirstArray()[0], (int) getFirstArray()[1], (int) getFirstArray()[2])
                    ? "Numbers are coprimes"
                    : "Numbers are not coprimes");
            resultList.add(
                  Maths.gcd((int) getFirstArray()[0], (int) getFirstArray()[1]) == 1 &&
                  Maths.gcd((int) getFirstArray()[1], (int) getFirstArray()[2]) == 1 &&
                  Maths.gcd((int) getFirstArray()[2], (int) getFirstArray()[0]) == 1
                    ? "and which pairwise coprimes \n"
                    : "and which not pairwise coprimes \n");
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}