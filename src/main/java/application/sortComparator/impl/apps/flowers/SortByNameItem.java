package application.sortComparator.impl.apps.flowers;

import application.sortComparator.ISortTemplate;
import chapters.chapterSerialization.projects.flowers.entity.FlowerComposition;

public class SortByNameItem implements ISortTemplate<FlowerComposition> {

    @Override
    public int compare(FlowerComposition o1, FlowerComposition o2) {
        return o1.getFlower().getName().compareTo(o2.getFlower().getName());
    }
}