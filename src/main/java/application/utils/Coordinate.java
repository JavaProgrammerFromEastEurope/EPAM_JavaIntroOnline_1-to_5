package application.utils;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public final class Coordinate {

    private int x;
    private int y;

    public Coordinate() {}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public static double getXMedian(double x1, double x2, double x3) {
        return (x1 + x2 + x3) / 3;
    }

    public static double getYMedian(double y1, double y2, double y3) {
        return (y1 + y2 + y3) / 3;
    }

    @Override
    public String toString() {
        return String.format("Coordinate{x=%d, y=%d}", x, y);
    }
}