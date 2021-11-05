package application.sortComparator.impl.apps.treasures;

import application.sortComparator.ISortTemplate;
import chapters.chapterSerialization.projects.dragonTreasures.entity.Treasure;

public class SortByNameItem implements ISortTemplate<Treasure> {

    @Override
    public int compare(Treasure o1, Treasure o2) {
        return o1.getName().compareTo(o2.getName());
    }
}