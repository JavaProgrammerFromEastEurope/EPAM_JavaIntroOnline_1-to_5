package chapters.chapterClasses.entitys.composition.tourist;
import application.sortComparator.impl.classes.tours.SortByTourCost;

import java.util.ArrayList;
import java.util.List;

public class TourCollection {

    final ArrayList<Tour> tours;

    public TourCollection(ArrayList<Tour> arrayList) {
        this.tours = arrayList;
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public List<Tour> sortAccountsByCost() {
        tours.sort(new SortByTourCost());
        return tours;
    }
}