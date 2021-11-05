package application.sortComparator.impl.apps.flowers;

import application.sortComparator.ISortTemplate;
import chapters.chapterSerialization.projects.flowers.entity.FlowerComposition;

public class SortByPriceItem implements ISortTemplate<FlowerComposition> {

    @Override
    public int compare(FlowerComposition o1, FlowerComposition o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
