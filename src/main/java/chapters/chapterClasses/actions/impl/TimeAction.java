package chapters.chapterClasses.actions.impl;

import chapters.chapterClasses.actions.IClassAction;
import chapters.chapterClasses.entitys.common.Time;

import static java.lang.System.out;

public class TimeAction implements IClassAction {

    Time firstTime, secondTime;

    @Override
    public void inputVariables() {

        firstTime = new Time();
        secondTime = new Time(3,12,6);

        firstTime.setHour(12);
        firstTime.setMinute(46);
        firstTime.setSecond(38);
    }

    @Override
    public void printResult() {
        addString[0] =  "The value of first time is:";
        addString[1] = "The value of second time is:";
        addString[2] = "For more info about class 'Time' structure %n" +
                "look at the class folder '/chapter/chapterClasses/classes/Time'!";
        out.printf(" %s %n %s %n %s %s %n %s %s %n %s %n%n",
                 addString[0],  firstTime.toString(),
                 addString[1], secondTime.toString(),
                 addString[2]);
    }
}
