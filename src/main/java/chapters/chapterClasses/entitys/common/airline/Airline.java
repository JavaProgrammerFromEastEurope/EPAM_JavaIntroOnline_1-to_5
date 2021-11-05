package chapters.chapterClasses.entitys.common.airline;

import java.text.ParseException;
import java.util.Date;
import java.util.Objects;

public class Airline implements IDate {

    private int flightNumber;
    private String destinationPoint;
    private String aircraftType;
    private String dayOfWeek;
    private Date date;


    public Airline(int flightNumber, String destinationPoint,
                   String aircraftType, String pattern, String dayOfWeek) {
        this.flightNumber = flightNumber;
        this.destinationPoint = destinationPoint;
        this.aircraftType = aircraftType;
        try {
            date = simpleDateFormat.parse(pattern);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.dayOfWeek = dayOfWeek;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public Date getDate() {
        return date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return flightNumber == airline.flightNumber
                && Objects.equals(destinationPoint, airline.destinationPoint)
                && Objects.equals(aircraftType, airline.aircraftType)
                && Objects.equals(dayOfWeek, airline.dayOfWeek)
                && Objects.equals(date, airline.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, destinationPoint,
                aircraftType, dayOfWeek, date);
    }

    @Override
    public String toString() {
        return String.format("Airline{flightNumber=%d, destinationPoint='%s'," +
                        " aircraftType='%s', dayOfWeek='%s', date=%s}",
                flightNumber, destinationPoint, aircraftType, dayOfWeek, date);
    }
}