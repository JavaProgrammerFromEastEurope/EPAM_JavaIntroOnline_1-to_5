package application.sortComparator.impl.classes.train;

import application.sortComparator.ISortTemplate;
import chapters.chapterClasses.entitys.common.train.Train;

public class SortByTrainNumber implements ISortTemplate<Train> {

    @Override
    public int compare(Train o1, Train o2) {
        return o1.getTrainNumber().compareTo(o2.getTrainNumber());
    }
}
