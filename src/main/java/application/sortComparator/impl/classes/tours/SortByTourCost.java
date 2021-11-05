package application.sortComparator.impl.classes.tours;

import application.sortComparator.ISortTemplate;
import chapters.chapterClasses.entitys.composition.tourist.Tour;

public class SortByTourCost implements ISortTemplate<Tour> {
    @Override
    public int compare(Tour o1, Tour o2) {
        return o1.getCost() - o2.getCost();
    }
}
