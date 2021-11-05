package chapters.chapterFunctions.functions.impl.devSoftwareBasics.cycleFunctions;

import application.utils.Tuple;
import chapters.chapterFunctions.functions.IFunction;

import java.util.ArrayList;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.String.*;
import static java.lang.System.out;

/**
 * 5. Given a number of series and some number e.
 * Find the sum of those terms of the series whose modulus is greater than or equal to given e.
 * The general term of the series is:
 * -> 1 / (2 ^ n) + 1 / (3 ^ n)
 **/
public class FifthCycleFunction implements IFunction {

    private ArrayList<Integer> intList;
    Tuple<Integer> tuple;

    @Override
    public void inputVariables(int length, boolean bEvenValue, boolean bDouble) {
        try {
            out.print("Enter the first & last position of numbers sequence:\n");
            tuple = inputAnyPositionOfTuple();
            IFunction.super.inputVariables(length, bEvenValue, bDouble);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calcFunction() {
        intList = new ArrayList<>();
        for (int i = tuple.getFirstItem(); i < tuple.getSecondItem(); i++) {
            operation[0] = (1 / (pow(2, i))) + (1 / (pow(3, i)));
            if (abs(operation[0]) >= variables[0]) {
                intList.add((int) operation[0]);
                operation[1] += operation[0];
            }
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 5. Cycle function ";
            addString[1] = " Sum of those terms of the series whose " +
                    "modulus is greater then or equal to given e:";
            return format("%n%s%n Array[%s,%s]%n %s %.0f = %.0f%n %s %n",
                    addString[0], tuple.getFirstItem(), tuple.getSecondItem(),
                     addString[1], variables[0], operation[1], intList);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}