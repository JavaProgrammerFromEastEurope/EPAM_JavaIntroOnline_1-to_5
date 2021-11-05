package chapters.chapterClasses.entitys.common.train;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

import static java.lang.System.out;
import static java.text.MessageFormat.format;

public class Train extends Transport {

    public enum TravelClass {
        FirstClass, SecondClass, Economic;
        public static TravelClass valueOf(int i) {
            switch (i) {
                case 0:
                    return Economic;
                case 1:
                    return SecondClass;
                default:
                    return FirstClass;
            }
        }
    }

    private TravelClass travelClass;
    private String trainNumber;
    private ArrayList<Travel> schedule = new ArrayList<>();

    public Train() {
        super();
        this.travelClass = TravelClass.FirstClass;
        this.trainNumber = "Millennium Falcon - IV";
    }

    public Train(String transportName, String devCompany, GregorianCalendar calendar,
                 TravelClass travelClass, String trainNumber) {
        super(transportName, devCompany, calendar);
        this.travelClass = travelClass;
        this.trainNumber = trainNumber;
    }

    public void setTravelClass(TravelClass travelClass) {
        this.travelClass = travelClass;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setSchedule(ArrayList<Travel> schedule) {
        this.schedule = schedule;
    }

    public TravelClass getTravelClass() {
        return travelClass;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public ArrayList<Travel> getSchedule() {
        return schedule;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Train train = (Train) o;
        return travelClass == train.travelClass
                && Objects.equals(trainNumber, train.trainNumber)
                && Objects.equals(schedule, train.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), travelClass, trainNumber, schedule);
    }

    private void printArray(List<Travel> travelList) {
        travelList.forEach(array ->
                out.printf("%s | ", array.toString()));
    }

    @Override
    public String toString() {
        String string = format("{0} {1} {2} ",
                super.toString(), travelClass, trainNumber);
        out.printf("%s%n%t", string);
        out.println("List of travels:");
        printArray(schedule);
        return "";
    }
}
