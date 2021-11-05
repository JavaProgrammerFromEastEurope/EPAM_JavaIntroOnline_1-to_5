package chapters.chapterClasses.actions.impl;

import chapters.chapterClasses.actions.IClassAction;
import chapters.chapterClasses.entitys.common.airline.Airline;
import chapters.chapterClasses.entitys.common.airline.AirlineCollection;

import static java.lang.System.out;
import static java.text.MessageFormat.format;

public class AirlineAction implements IClassAction {

    AirlineCollection airlineCollection;

    @Override
    public void inputVariables() {
        airlineCollection = new AirlineCollection();

        airlineCollection.getAirlineList()
                .add(new Airline(56, "Guangzhou",
                        "Airbus A310-300", "14:30", "Saturday"));

        airlineCollection.getAirlineList()
                .add(new Airline(55, "Shivaji",
                        "COMAC ARJ21", "02:30", "Monday"));

        airlineCollection.getAirlineList()
                .add(new Airline(54, "Sydney",
                        "Beechcraft 1900", "10:15", "Tuesday"));

        airlineCollection.getAirlineList()
                .add(new Airline(39, "Guangzhou",
                        "Boeing 747", "16:00", "Wednesday"));

        airlineCollection.getAirlineList()
                .add(new Airline(25, "Narita",
                        "Boeing 777", "18:00", "Monday"));
    }

    @Override
    public void printResult() {
        addString[0] = "Guangzhou";
        out.print(format("%n Show airlines with city destination: '{0}'", addString[0]));
        AirlineCollection.printAirlineByParameter(
                airlineCollection.getAirlineList(), true, addString[0]);

        addString[0] = "Monday";
        out.print(format("%n Show airlines with day of week: '{0}':", addString[0]));
        AirlineCollection.printAirlineByParameter(
                airlineCollection.getAirlineList(), false, addString[0]);

        addString[0] = "Monday"; addString[1] = "15:00";
        out.print(format("%n  Show airlines with day of week '{0}'" +
                " and time '{1}':", addString[0], addString[1]));
        AirlineCollection.printAirlineByTime(
                airlineCollection.getAirlineList(), addString[0], addString[1]);

        IClassAction.super.setDefaultOperations();
    }
}