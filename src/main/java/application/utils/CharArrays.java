package application.utils;

import static java.lang.String.*;

public final class CharArrays {

    public static String makeMultipleChar(int count, String str) {
        return count == 1 ? str
                       : makeMultipleChar(
                           --count, format("%s%s", str, str.charAt(0)));
    }

    public static int sumOfDigits(char[] charArray, int pos) {
        return !Character.isDigit(charArray[pos]) ? 0
                : 1 + sumOfDigits(charArray, ++pos);
    }

    public static int sumOfSequenceChar(char[] charArray, int pos, char ch) {
        return charArray[pos] != ch ? 0
                : 1 + sumOfSequenceChar(charArray, ++pos, ch);
    }

    public static int sumOfCharValues(char[] charArray, int pos, char ch) {
        return pos == charArray.length - 1 ? charArray[pos] == ch ? 1 : 0
                : charArray[pos] == ch
                ? 1 + sumOfCharValues(charArray, ++pos, ch)
                    : sumOfCharValues(charArray, ++pos, ch);
    }
}