package application.sortComparator.impl.classes.train;

import application.sortComparator.ISortTemplate;
import chapters.chapterClasses.entitys.common.train.Train;
import chapters.chapterClasses.entitys.common.train.Travel;

public class SortByTravel implements ISortTemplate<Train> {

    @Override
    public int compare(Train o1, Train o2) {
        o1.getSchedule().sort(Travel::compareTo);
        o2.getSchedule().sort(Travel::compareTo);
        return o1.getSchedule().hashCode()
                - o2.getSchedule().hashCode();
    }
}