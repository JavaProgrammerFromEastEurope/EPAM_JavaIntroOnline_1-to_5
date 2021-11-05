package chapters.chapterClasses.entitys.common;

import application.utils.Coordinate;

import java.util.Arrays;

import static java.lang.Math.sqrt;
import static java.text.MessageFormat.format;

public class Triangle {

    private final Coordinate[] coordinates;
    private double fDimension, sDimension, tDimension;

    public Triangle() {
        this.coordinates = new Coordinate[3];
        this.coordinates[0].setX(2);
        this.coordinates[0].setY(2);
        this.coordinates[1].setX(6);
        this.coordinates[1].setY(2);
        this.coordinates[2].setX(4);
        this.coordinates[2].setY(8);
    }

    public Triangle(Coordinate[] coordinates) {
        this.coordinates = coordinates;
    }

    private double setFDimension() {
        return Coordinate.getDistance(
                coordinates[1].getX(), coordinates[1].getY(),
                coordinates[0].getX(), coordinates[0].getY());
    }

    private double setSDimension() {
        return Coordinate.getDistance(
                coordinates[2].getX(), coordinates[2].getY(),
                coordinates[0].getX(), coordinates[0].getY());
    }

    private double setTDimension() {
        return Coordinate.getDistance(
                coordinates[2].getX(), coordinates[2].getY(),
                coordinates[1].getX(), coordinates[1].getY());
    }

    public Coordinate[] getCoordinates() {
        return coordinates;
    }

    public double findPerimeter() {
        fDimension = setFDimension();
        sDimension = setSDimension();
        tDimension = setTDimension();
        return fDimension + sDimension + tDimension;
    }

    public double findArea() {
        double per = findPerimeter();
        return sqrt(per / 2 * (per / 2 - fDimension)
                            * (per / 2 - sDimension)
                            * (per / 2 - tDimension));
    }

    public double getXMedian()
    {
       return Coordinate.getXMedian(
               coordinates[0].getX(), coordinates[1].getX(), coordinates[2].getX());
    }

    public double getYMedian()
    {
        return Coordinate.getYMedian(
                coordinates[0].getY(), coordinates[1].getY(), coordinates[2].getY());
    }

    @Override
    public String toString() {
        return format("Triangle'{'coordinates={0}'}'",
                Arrays.toString(coordinates));
    }
}