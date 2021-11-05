package application.utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.stream.IntStream;

import static java.lang.Math.*;
import static java.lang.String.*;
import static java.util.stream.IntStream.iterate;

public final class Maths {

    public static int countOfElements(int digit) {
        return digit < 10 ? 1
                : 1 + countOfElements(digit / 10);
    }

    public static int countOfEvenElements(int digit) {
        return digit < 10 ? digit % 2 == 0 ? 1 : 0
                : digit % 2 == 0
                ? 1 + countOfEvenElements(digit / 10)
                    : countOfEvenElements(digit / 10);
    }

    public static int sumOfNumberDigits(int digit) {
        return digit < 10 ? digit
                    : sumOfNumberDigits(digit % 10)
                    + sumOfNumberDigits(digit / 10);
    }

    public static int sumOfIndexValues(Integer[] array, int first, int last) {
        return first == last ? array[first - 1]
                    : sumOfIndexValues(array, first, first)
                    + sumOfIndexValues(array, ++first, last);
    }

    public static boolean isStrictlyOrderedSequence(int number) {
        return number < 10 || (number % 10 > number / 10 % 10
                       && isStrictlyOrderedSequence(number / 10));
    }

    public static boolean isStrictlyOddNumberSequence(int number) {
        return number < 10 ? number % 2 == 1 : number % 2 == 1
                       && isStrictlyOddNumberSequence(number / 10);
    }

    public static long gcf(long first, long second) {
        return first * second / gcd(first, second);
    }

    public static long gcd(long first, long second) {
        return (second == 0) ? first
                     : gcd(second, first % second);
    }

    public static int sumOfPowerElements(long number) {
        String testNum = valueOf(number);
        return testNum.chars()
                .map(character -> character - '0')
                .map(index -> (int) pow(index, testNum.length())).sum();
    }

    public static boolean isPrimeNumber(double number) {
        return !(number < 2) && iterate(2, index ->
                index <= number / 2, index -> index + 1)
                .noneMatch(index -> number % index == 0);
    }

    public static int setDimension(int number) {
        return IntStream.range(0, number - 1)
                .map(i -> 10)
                .reduce(1, (a, b) -> a * b);
    }

    public static int previousMax(Integer[] numbersArray) {
        int max = numbersArray[0], subMax = Integer.MIN_VALUE;
        for (Integer obj : numbersArray) {
            if (obj > max) {
                subMax = max;
                max = obj;
            } else if (obj < max && obj > subMax) {
                subMax = obj;
            }
        }
        return subMax;
    }

    public static BigInteger fact(int number) {
        if (number < 0)
            return BigInteger.valueOf(0);
        switch (number) {
            case 0:
                return BigInteger.valueOf(1);
            case 1: case 2:
                return BigInteger.valueOf(number);
        }
        boolean[] u = new boolean[number + 1];
        ArrayList<Tuple<Integer>> points = new ArrayList<>();
        for (int i = 2; i <= number; ++i)
            if (!u[i]) {
                int k = number / i;
                int c = 0;
                while (k > 0) {
                    c += k;
                    k /= i;
                }
                points.add(new Tuple<>(i, c));
                int j = 2;
                while (i * j <= number) {
                    u[i * j] = true;
                    ++j;
                }
            }
        BigInteger r = BigInteger.valueOf(1);
        BigInteger current;
        for (int i = points.size() - 1; i >= 0; --i) {
            current = BigInteger.valueOf(points.get(i).getFirstItem());
            r = r.multiply(current.pow(points.get(i).getSecondItem()));
        }
        return r;
    }
}