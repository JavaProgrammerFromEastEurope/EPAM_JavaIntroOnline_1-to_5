package chapters.chapterClasses.entitys.common.train;

import application.sortComparator.impl.classes.train.SortByTrainNumber;
import application.sortComparator.impl.classes.train.SortByTravel;

import java.util.ArrayList;
import java.util.List;

public class TrainCollection {

    public final List<Train> trainList;

    public TrainCollection() {
        this.trainList = new ArrayList<>();
    }

    public List<Train> sortByTrainNumber() {
        trainList.sort(new SortByTrainNumber());
        return trainList;
    }

    public List<Train> sortByTravelSchedule() {
        trainList.sort(new SortByTravel());
        return trainList;
    }

    public List<Train> getTrainList() {
        return trainList;
    }

    @Override
    public String toString() {
        return trainList.toString();
    }
}