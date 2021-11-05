package chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import chapters.chapterFunctions.functions.IFunction;

import java.math.BigInteger;

import static java.lang.String.*;
import static java.lang.System.out;

/**
 * 4. Make a program for finding the multiplication of the squares of the first two hundred numbers.
 **/
public class FourthCycleFunction implements IFunction {

    private BigInteger bigInteger;

    @Override
    public void calcFunction() {
        bigInteger = BigInteger.valueOf(1L);
        for (int index = 2; index <= 200; index++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf((long) Math.pow(index, 2)));
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 4. Cycle function ";
            addString[1] = " Multiplication of the squares of the first two hundred numbers:";
            return format("%n%s%n%s%n %d %n", addString[0], addString[1], bigInteger);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
