package chapters.chapterFunctions.functions.impl.algorithmization.sortOneDimArrays;

import application.utils.Fraction;
import chapters.chapterFunctions.functions.IFunction;

import java.util.ArrayList;
import java.util.List;

import static application.utils.Maths.gcd;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Creates fractions to the total
 * denominator and orders them in order
 **/
public class EighthSortFunction implements IFunction {

    final ArrayList<Fraction> fs = new ArrayList<>(java.util.Arrays.asList(
            new Fraction(9, 12), new Fraction(1, 2),
            new Fraction(3, 4), new Fraction(6, 7),
            new Fraction(1, 5), new Fraction(7, 8),
            new Fraction(9, 10), new Fraction(1, 2),
            new Fraction(5, 12), new Fraction(3, 8)));

    long lcd = 0L;

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
        lcd = fs.stream().mapToLong(Fraction::getDenominator)
                .reduce(1, (d1, d2) -> d1 * d2 / gcd(d1, d2));
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 8. Sorted One Dimension Array\n";
            return format("%n%s%s%n", addString[0],
                    List.of(fs.stream().map(f ->
                            f.setLCD(lcd))
                            .sorted(Fraction::sort)
                            .map(Fraction::toString).toArray()));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}