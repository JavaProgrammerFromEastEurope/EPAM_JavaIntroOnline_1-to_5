package chapters.chapterClasses.entitys.composition.auto;

import static java.lang.System.out;

public class Engine {

    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public Engine(){}

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void startEngine() {
        out.printf("Start engine with power %s%n", getPower());
    }
}