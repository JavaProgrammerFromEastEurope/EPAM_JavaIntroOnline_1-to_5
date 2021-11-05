package chapters.chapterClasses.actions.impl;

import chapters.chapterClasses.actions.IClassAction;
import chapters.chapterClasses.entitys.common.DecimalCounter;

import static java.lang.System.out;

public class DCAction implements IClassAction {

    DecimalCounter firstDecimalCounter, secondDecimalCounter;

    @Override
    public void inputVariables() {
         out.println(" The first decimal counter has been seted to a '0' value.");
        firstDecimalCounter = new DecimalCounter();

        out.println(" The second decimal counter has been seted to a '6' value.");
        secondDecimalCounter = new DecimalCounter(6);

        firstDecimalCounter.increaseCounter();
        firstDecimalCounter.increaseCounter();

        secondDecimalCounter.decreaseCounter();
        secondDecimalCounter.decreaseCounter();
        secondDecimalCounter.decreaseCounter();
    }

    @Override
    public void printResult() {
        addString[0] = "The value of first decimal counter:";
        addString[1] = "The value of second decimal counter:";
        addString[2] = "The value of first decimal counter has been increased up to double times.";
        addString[3] = "The value of second decimal counter has been decreased to three times.";
        out.printf(" %s %n %s %n %s %s %n %s %s %n%n", addString[2], addString[3],
                addString[0], firstDecimalCounter.toString(),
                addString[1], secondDecimalCounter.toString());
    }
}