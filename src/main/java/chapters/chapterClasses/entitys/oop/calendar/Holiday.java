package chapters.chapterClasses.entitys.oop.calendar;

import java.util.GregorianCalendar;

public class Holiday extends FreeDay {

    private final String title;

    public Holiday(String title, GregorianCalendar gregorianCalendar) {
        super(gregorianCalendar);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}