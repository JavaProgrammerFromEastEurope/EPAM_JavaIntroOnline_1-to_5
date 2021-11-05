package chapters.chapterClasses.entitys.composition.tourist;

import chapters.chapterClasses.entitys.composition.tourist.enums.Duration;
import chapters.chapterClasses.entitys.composition.tourist.enums.Supply;
import chapters.chapterClasses.entitys.composition.tourist.enums.Transport;

public abstract class Tour {

    private final int cost;
    private final String country;
    private final Duration duration;
    private final Transport transport;
    private final Supply supply;


    public Tour(int cost, String country, Duration duration, Transport transport, Supply supply) {
        this.cost = cost;
        this.country = country;
        this.duration = duration;
        this.transport = transport;
        this.supply = supply;
    }

    public String getCountry() {
        return country;
    }

    public int getCost() {
        return cost;
    }

    public Supply getSupply() {
        return supply;
    }

    public Duration getCountOfDays() {
        return duration;
    }

    public Transport getTransport() {
        return transport;
    }
}