package chapters.chapterClasses.entitys.oop.calendar;

import java.util.GregorianCalendar;
import java.util.Objects;

public class FreeDay {

    GregorianCalendar gregorianCalendar;

    public FreeDay(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }

    public void setGregorianCalendar(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeDay freeDay = (FreeDay) o;
        return Objects.equals(gregorianCalendar, freeDay.gregorianCalendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gregorianCalendar);
    }

    @Override
    public String toString() {
        return String.format("dates = %s", gregorianCalendar);
    }
}