package chapters.chapterClasses.entitys.common.airline;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.text.MessageFormat.format;

public class AirlineCollection implements IDate {

    private final List<Airline> airlineList;

    public AirlineCollection() {
        this.airlineList = new ArrayList<>();
    }

    public AirlineCollection(List<Airline> airlineList) {
        this.airlineList = airlineList;
    }

    public static void printAirlineByParameter(List<Airline> airlines, boolean destination, String parameter) {
        Map<Boolean, List<Airline>> airlineMap = airlines.stream()
                .collect(Collectors.partitioningBy(airline ->
                        (destination) ? airline.getDestinationPoint().equals(parameter)
                                : airline.getDayOfWeek().equals(parameter)));
        printAirlineMap(airlineMap);
    }

    public static void printAirlineByTime(List<Airline> airlines, String destination, String pattern) {
        Map<Boolean, List<Airline>> airlineMap = airlines.stream()
                .filter(airline -> airline.getDestinationPoint().equals(destination))
                .collect(Collectors.partitioningBy(airline -> {
                    try {
                        return airline.getDate().after(simpleDateFormat.parse(pattern));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    return false;
                }));

        printAirlineMap(airlineMap);
    }

    public static void printAirlineMap(Map<Boolean, List<Airline>> airlinesMap) {
        airlinesMap.forEach((k, v) -> out.println("Key:" + k + "  " +
                v.stream().map(Airline::toString)
                        .collect(Collectors.joining("\n"))));
    }

    public List<Airline> getAirlineList() {
        return airlineList;
    }

    @Override
    public String toString() {
        return format("{'airlineList={0}'}'", airlineList);
    }
}