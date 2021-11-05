package chapters.chapterClasses.actions.impl;

import application.utils.Input;
import chapters.chapterClasses.actions.IClassAction;
import chapters.chapterClasses.entitys.common.train.Train;
import chapters.chapterClasses.entitys.common.train.TrainCollection;
import chapters.chapterClasses.entitys.common.train.Travel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.System.out;

public class TrainAction implements IClassAction {

    TrainCollection trainCollection;
    ArrayList<Travel> firstSchedule;
    ArrayList<Travel> secondSchedule;
    Train firstTrain, secondTrain;

    @Override
    public void inputVariables() {
        trainCollection = new TrainCollection();
        firstSchedule = new ArrayList<>();
        secondSchedule = new ArrayList<>();

        firstSchedule.add(new Travel("Washington", "14:30",
                new GregorianCalendar(2021, Calendar.AUGUST, 10)));
        firstSchedule.add(new Travel("Indiana", "15:00",
                new GregorianCalendar(2021, Calendar.AUGUST, 10)));
        firstSchedule.add(new Travel("Georgia", "15:30",
                new GregorianCalendar(2021, Calendar.AUGUST, 10)));
        firstSchedule.add(new Travel("Kansas", "16:00",
                new GregorianCalendar(2021, Calendar.AUGUST, 10)));
        firstSchedule.add(new Travel("Connecticut", "16:30",
                new GregorianCalendar(2021, Calendar.AUGUST, 10)));

        secondSchedule.add(new Travel("Minnesota", "08:30",
                new GregorianCalendar(2021, Calendar.AUGUST, 10)));
        secondSchedule.add(new Travel("Carolina", "09:00",
                new GregorianCalendar(2021, Calendar.AUGUST, 10)));
        secondSchedule.add(new Travel("Oregon", "09:30",
                new GregorianCalendar(2021, Calendar.AUGUST, 10)));
        secondSchedule.add(new Travel("Carolina", "10:00",
                new GregorianCalendar(2021, Calendar.AUGUST, 10)));
        secondSchedule.add(new Travel("Utah", "10:30",
                new GregorianCalendar(2021, Calendar.AUGUST, 10)));

        firstTrain = new Train("Falcon III", "SW:ISB",
                new GregorianCalendar(2005, Calendar.MAY, 17),
                Train.TravelClass.FirstClass, "West-03");

        secondTrain = new Train("Falcon V", "SW:ISB",
                new GregorianCalendar(1980, Calendar.MAY, 17),
                Train.TravelClass.FirstClass, "East-01");

         firstTrain.setSchedule(firstSchedule);
        secondTrain.setSchedule(secondSchedule);

        trainCollection.getTrainList().add(0, firstTrain);
        trainCollection.getTrainList().add(1, secondTrain);
    }

    private String getTrainInfo(String trainNumber) {
        for (Train train : trainCollection.getTrainList()) {
            if (train.getTrainNumber().equals(trainNumber)) {
                return train.toString();
            }
        }
        return String.format("The train with '%s' number -" +
                " not found!", trainNumber);
    }

    @Override
    public void printResult() {

        out.println("Train numbers:{'East-01', 'West-03'}");
        String train = Input.getString();
        out.printf("%n%s%n", getTrainInfo(train));

        out.printf(" Train sorting by Train Number:%n %s%n",
                trainCollection.sortByTrainNumber());

        out.printf(" Train sorting by Travels Schedule:%n %s%n",
                trainCollection.sortByTravelSchedule());
    }
}