package chapters.chapterClasses.entitys.common.train;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

import static java.text.MessageFormat.format;

public class Transport {

    private String transportName;
    private String devCompany;
    private Calendar calendar;

    public Transport() {
        this.transportName = "Deccan Odyssey";
        this.devCompany = "Indian Railways";
        this.calendar = new GregorianCalendar(1980, Calendar.MAY, 17);
    }

    public Transport(String transportName, String operatedBy, Calendar calendar) {
        this.transportName = transportName;
        this.devCompany = operatedBy;
        this.calendar = calendar;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public void setDevCompany(String devCompany) {
        this.devCompany = devCompany;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getTransportName() {
        return transportName;
    }

    public String getDevCompany() {
        return devCompany;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(transportName, transport.transportName)
                && Objects.equals(devCompany, transport.devCompany)
                  && Objects.equals(calendar, transport.calendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportName, devCompany, calendar);
    }

    @Override
    public String toString() {
        return format("{0} {1} {2}",
                transportName, devCompany, calendar.toString());
    }
}