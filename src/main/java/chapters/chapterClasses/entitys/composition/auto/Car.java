package chapters.chapterClasses.entitys.composition.auto;

import java.util.Arrays;
import java.util.Objects;

import static java.lang.System.out;

public class Car {

    private final Wheel[] wheels = new Wheel[4];
    private Engine engine;
    private String title;

    public Car(Engine engine, String title) {
        this.engine = engine;
        this.title = title;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getTitle() {
        return title;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void start() {
        try {
            out.println("Starting engine...");
            Thread.currentThread().wait(1000);
            engine.startEngine();
            out.printf("%s is running. %n", title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void refuel(){
        try {
            out.println("The car out of fuel.");
                Thread.currentThread().wait(1000);
            out.println("Begin of car refueling process...");
                Thread.currentThread().wait(1000);
            out.printf("Refueling of car %s is complete!", title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Arrays.equals(wheels, car.wheels)
                && Objects.equals(engine, car.engine)
                && Objects.equals(title, car.title);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(engine, title);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;

    }

    @Override
    public String toString() {
        return String.format("Car{wheels=%s, engine=%s, title='%s'}",
                            Arrays.toString(wheels), engine, title);
    }
}