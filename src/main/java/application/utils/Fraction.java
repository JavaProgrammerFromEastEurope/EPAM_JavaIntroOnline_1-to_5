package application.utils;

import static java.lang.String.*;

public final class Fraction {

    private long numerator;
    private long denominator;

    public long getDenominator() {
        return denominator;
    }

    public Fraction(long n, long d) {
        this.numerator   = n;
        this.denominator = d;
    }

    public Fraction setLCD(long lcd) {
        numerator = numerator * (lcd / denominator);
        denominator = lcd;
        return this;
    }

    public static int sort(Fraction f1, Fraction f2) {
        return Long.compare(f1.numerator, f2.numerator);
    }

    @Override
    public String toString() {
        return format("%d/%d", numerator, denominator);
    }
}