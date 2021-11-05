package application.utils;

import java.util.Comparator;
import java.util.Objects;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public final class Sort {

    public static Object[][] sortMatrixObjects(Object[][] matrix, Comparator<Object> objectComparator) {
        int localBound = matrix.length;
        IntStream.range(0, localBound).forEach(i -> matrix[i] = sortLineObjects(matrix[i], objectComparator));
        return matrix;
    }

    public static Object[] sortLineObjects(Object[] lineObjects, Comparator<Object> objectComparator) {
        lineObjects = stream(lineObjects).filter(Objects::nonNull).sorted(objectComparator).toArray();
        return lineObjects;
    }

    public static Object[] sortHoare(Object[] objectsArray, int low, int high) {
        if (low >= high || objectsArray.length == 0)
            throw new IllegalStateException();
        int middle = low + (high - low) / 2;
        double middleValue = (double) objectsArray[middle];
        int i = low, j = high;
        while (i <= j) {
            while ((double) objectsArray[i] < middleValue) i++;
            while ((double) objectsArray[j] > middleValue) j--;
            if (i > j) break;
            double temp = (double) objectsArray[i];
            objectsArray[i] = objectsArray[j];
            objectsArray[j] = temp;
            i++;
            j--;
        }
        if (low < j)  sortHoare(objectsArray, low, j);
        if (high > i) sortHoare(objectsArray, i, high);
        return objectsArray;
    }

    public static void sortShells(Object[] arraySample) {
        for (int step = arraySample.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arraySample.length; i++) {
                for (int j = i - step; j >= 0; j -= step) {
                    if ((double) arraySample[j] < (double) arraySample[j + step])
                        break;
                    double x = (double) arraySample[j];
                    arraySample[j] = arraySample[j + step];
                    arraySample[j + step] = x;
                }
            }
        }
    }

    public static void sortSelection(Object[] arraySample) {
        int pos, temp;
        int localBound = arraySample.length;
        for (int index = 0; index < localBound; index++) {
            for (int i = pos = index; i < localBound; i++)
                if ((int) arraySample[pos] <= (int) arraySample[i]) {
                    pos = i;
                }
            if (pos == index) continue;
            temp = (int) arraySample[index];
            arraySample[index] = arraySample[pos];
            arraySample[pos] = temp;
        }
    }

    public static void sortInsert(Object[] arraySample) {
        int value, index;
        for (int i = 1; i < arraySample.length; i++) {
            value = (int) arraySample[i];
            for (index = i - 1; index >= 0; index--) {
                if (value >= (int) arraySample[index]) break;
                arraySample[index + 1] = arraySample[index];
            }
            arraySample[index + 1] = value;
        }
    }

    public static void sortExchange(Object[] arraySample) {
        int localBound = arraySample.length, temp;
        for (int step = 0; step < localBound; step++) {
            for (int index = 0; index < localBound - 1; index++)
                if ((int) arraySample[index] <= (int) arraySample[index + 1]) {
                    temp = (int) arraySample[index];
                    arraySample[index] = arraySample[index + 1];
                    arraySample[index + 1] = temp;
                }
        }
    }
}