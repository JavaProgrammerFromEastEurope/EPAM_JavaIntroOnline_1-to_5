package application.sortComparator.impl.apps.treasures;

import application.sortComparator.ISortTemplate;
import chapters.chapterSerialization.projects.dragonTreasures.entity.Treasure;

public class SortByPriceItem implements ISortTemplate<Treasure> {

    @Override
    public int compare(Treasure o1, Treasure o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
