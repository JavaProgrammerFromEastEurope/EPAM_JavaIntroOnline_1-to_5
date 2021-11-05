package chapters.chapterClasses.entitys.composition.tourist.entity;

import chapters.chapterClasses.entitys.composition.tourist.Tour;
import chapters.chapterClasses.entitys.composition.tourist.enums.Duration;
import chapters.chapterClasses.entitys.composition.tourist.enums.Supply;
import chapters.chapterClasses.entitys.composition.tourist.enums.Transport;

public class Shopping extends Tour {

    public Shopping(int cost, String country, Duration duration, Transport transport, Supply supply) {
        super(cost, country, duration, transport, supply);
    }
}