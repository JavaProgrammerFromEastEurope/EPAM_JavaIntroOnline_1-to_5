package chapters.chapterClasses.entitys.composition.tourist.entity;

import chapters.chapterClasses.entitys.composition.tourist.Tour;
import chapters.chapterClasses.entitys.composition.tourist.enums.Duration;
import chapters.chapterClasses.entitys.composition.tourist.enums.Supply;
import chapters.chapterClasses.entitys.composition.tourist.enums.Transport;

public class Rest extends Tour {

    public Rest(int cost, String country, Duration duration, Transport transport, Supply supply) {
        super(cost, country, duration, transport, supply);
    }
}