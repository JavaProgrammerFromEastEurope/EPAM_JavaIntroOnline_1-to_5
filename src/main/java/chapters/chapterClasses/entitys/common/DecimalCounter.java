package chapters.chapterClasses.entitys.common;

import static java.lang.System.out;

public class DecimalCounter {

    private int decimalCounter;

    public DecimalCounter() {
        decimalCounter = 0;
    }

    public DecimalCounter(int decimalCounter) {
        this.decimalCounter =
                checkDecimalValue(decimalCounter) ?
                    decimalCounter : 0;
    }

    public boolean checkDecimalValue(int value){
        if (value > 10 || value < 1) {
            out.printf(" Decimal counter must have value [1..10]%n");
            return false;
        }
        return true;
    }

    public void setDecimalCounter(int decimalCounter) {
        if(checkDecimalValue(decimalCounter))
            this.decimalCounter = decimalCounter;
    }

    public int getDecimalCounter() {
        return decimalCounter;
    }

    public void increaseCounter() {
        if (decimalCounter == 10)
            return;
        decimalCounter++;
    }

    public void decreaseCounter() {
        if (decimalCounter == 0)
            return;
        decimalCounter--;
    }

    @Override
    public String toString() {
        return String.format("decimalCounter=%d}", decimalCounter);
    }
}