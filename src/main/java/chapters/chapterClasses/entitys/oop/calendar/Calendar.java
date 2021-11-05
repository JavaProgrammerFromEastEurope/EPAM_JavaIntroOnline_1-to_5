package chapters.chapterClasses.entitys.oop.calendar;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class Calendar {

    private final HashMap<Integer, FreeDay> holidays = new HashMap<>();

    private static final Calendar instance = new Calendar();

    private Calendar() {

        holidays.put(1, new Holiday("Happy New Year",
                new GregorianCalendar(2021, java.util.Calendar.JANUARY, 1)));
        holidays.put(2, new Holiday("Religious Freedom Day",
                new GregorianCalendar(2021, java.util.Calendar.JANUARY, 16)));
        holidays.put(3, new Holiday("Robert Lee's birthday",
                new GregorianCalendar(2021, java.util.Calendar.JANUARY, 19)));
        holidays.put(4, new Holiday("National Freedom Day",
                new GregorianCalendar(2021, java.util.Calendar.FEBRUARY, 1)));
        holidays.put(5, new Holiday("Groundhog Day",
                new GregorianCalendar(2021, java.util.Calendar.FEBRUARY, 2)));
        holidays.put(6, new Holiday("Abraham Lincoln's birthday",
                new GregorianCalendar(2021, java.util.Calendar.FEBRUARY, 12)));
        holidays.put(7, new Holiday("Valentine's Day",
                new GregorianCalendar(2021, java.util.Calendar.FEBRUARY, 14)));
        holidays.put(8, new Holiday("A day of spontaneous kindness",
                new GregorianCalendar(2021, java.util.Calendar.FEBRUARY, 17)));
        holidays.put(9, new Holiday("Birthday of George Washington",
                new GregorianCalendar(2021, java.util.Calendar.JANUARY, 21)));
        holidays.put(10, new Holiday("National Day of Colored Women",
                new GregorianCalendar(2021, java.util.Calendar.MARCH, 1)));
        holidays.put(11, new Holiday("St.Patrick 's Day",
                new GregorianCalendar(2021, java.util.Calendar.MARCH, 17)));
        holidays.put(12, new Holiday("National Doctors Day",
                new GregorianCalendar(2021, java.util.Calendar.MARCH, 30)));
        holidays.put(13, new Holiday("Cesar Chavez Day",
                new GregorianCalendar(2021, java.util.Calendar.MARCH, 31)));
        holidays.put(14, new Holiday("April Fool's Day",
                new GregorianCalendar(2021, java.util.Calendar.APRIL, 1)));
        holidays.put(15, new Holiday("Good Friday Day",
                new GregorianCalendar(2021, java.util.Calendar.APRIL, 2)));
        holidays.put(16, new Holiday("Catholic Easter",
                new GregorianCalendar(2021, java.util.Calendar.APRIL, 4)));
        holidays.put(17, new Holiday("International Mather Earth Day",
                new GregorianCalendar(2021, java.util.Calendar.APRIL, 22)));
        holidays.put(18, new Holiday("Arbor Festival",
                new GregorianCalendar(2021, java.util.Calendar.APRIL, 25)));
        holidays.put(19, new Holiday("Vietnam Veterans Day",
                new GregorianCalendar(2021, java.util.Calendar.APRIL, 30)));
        holidays.put(20, new Holiday("Loyalty Day",
                new GregorianCalendar(2021, java.util.Calendar.MAY, 1)));
        holidays.put(21, new Holiday("Cinco de Mayo Day",
                new GregorianCalendar(2021, java.util.Calendar.MAY, 5)));
        holidays.put(22, new Holiday("Mother's Day",
                new GregorianCalendar(2021, java.util.Calendar.MAY, 10)));
        holidays.put(23, new Holiday("American Flag Day",
                new GregorianCalendar(2021, java.util.Calendar.JUNE, 14)));
        holidays.put(24, new Holiday("Father's Day",
                new GregorianCalendar(2021, java.util.Calendar.JUNE, 15)));
        holidays.put(25, new Holiday("National Hot Dog Day",
                new GregorianCalendar(2021, java.util.Calendar.JUNE, 18)));
        holidays.put(26, new Holiday("System Administrator Day",
                new GregorianCalendar(2021, java.util.Calendar.JUNE, 30)));
        holidays.put(27, new Holiday("Coast Guard Day",
                new GregorianCalendar(2021, java.util.Calendar.AUGUST, 4)));
        holidays.put(28,
                new Holiday("Day of Remembrance for the Victims of the Hiroshima Bombing",
                new GregorianCalendar(2021, java.util.Calendar.AUGUST, 6)));
        holidays.put(29, new Holiday("Day of forest fire protection",
                new GregorianCalendar(2021, java.util.Calendar.AUGUST, 9)));
        holidays.put(30, new Holiday("Elvis Presley Memorial Day",
                new GregorianCalendar(2021, java.util.Calendar.AUGUST, 16)));
        holidays.put(31, new Holiday("Women's Equality Day",
                new GregorianCalendar(2021, java.util.Calendar.AUGUST, 26)));
        holidays.put(32, new Holiday("Labor Day",
                new GregorianCalendar(2021, java.util.Calendar.SEPTEMBER, 6)));
        holidays.put(33, new Holiday("Day of California's admission to the Union",
                new GregorianCalendar(2021, java.util.Calendar.SEPTEMBER, 9)));
        holidays.put(34, new Holiday("American Business Women Day",
                new GregorianCalendar(2021, java.util.Calendar.SEPTEMBER, 22)));
        holidays.put(35, new Holiday("Alaska Day",
                new GregorianCalendar(2021, java.util.Calendar.OCTOBER, 18)));
        holidays.put(36, new Holiday("Sweets day",
                new GregorianCalendar(2021, java.util.Calendar.OCTOBER, 23)));
        holidays.put(37, new Holiday("Halloween",
                new GregorianCalendar(2021, java.util.Calendar.OCTOBER, 31)));
        holidays.put(38, new Holiday("International smoking cessation day",
                new GregorianCalendar(2021, java.util.Calendar.NOVEMBER, 19)));
        holidays.put(39, new Holiday("Kwanzaa Festival",
                new GregorianCalendar(2021, java.util.Calendar.DECEMBER, 26)));
    }

    public static Calendar getInstance() {
        return instance;
    }

    public HashMap<Integer, FreeDay> getHolidays() {
        return holidays;
    }
}