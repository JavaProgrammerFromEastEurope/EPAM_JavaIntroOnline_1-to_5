package chapters.chapterFunctions.functions.impl.algorithmization.decomposition;

import application.utils.Maths;
import chapters.chapterFunctions.functions.IFunction;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Calculate the sum of the factorials of all odd numbers from 1 to 9
 **/
public class SeventhDecFunction implements IFunction {

    BigInteger bigInteger;
    HashMap<Integer, BigInteger> hashMap;

    @Override
    public void calcFunction() {
        variables[0] = 9;
        hashMap = new HashMap<>();
        bigInteger = BigInteger.valueOf(1L);
        BigInteger curBigInt;
        int index = 3;
        while (index <= (int) variables[0]) {
            curBigInt = Maths.fact(index);
            hashMap.put(index, curBigInt);
            bigInteger = bigInteger.add(curBigInt);
            index += 2;
        }
    }

    @Override
    public String getResultString() {
        try {
            var resultList = new ArrayList<>();
            out.println(IFunction.warning);
            addString[0] = " 7. Decomposition function\n";
            addString[1] = "The values of factorial odd numbers:\n";
            addString[2] = "The result of sum factorials odd numbers to";
            resultList.add(addString[0]);
            resultList.add(addString[1]);
            hashMap.forEach((key, value) ->
                    resultList.add(format(" [%d : %d] - ", key, value)));
            resultList.add(format("%n%s %.0f! = %d",
                    addString[2], variables[0], bigInteger));
            return format("%n%s%n", List.of(resultList));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}