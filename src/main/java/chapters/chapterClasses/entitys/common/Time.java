package chapters.chapterClasses.entitys.common;

public class Time {

    int hour, minute, second;

    public Time() {
        hour = minute = second = 0;
    }

    public Time(int second, int minute, int hour) {
        this.hour = hour > 23 || hour < 0 ? 0 : hour;
        this.minute = minute > 60 || minute < 0 ? 0 : minute;
        this.second = second > 60 || second < 0 ? 0 : second;
    }

    public void setHour(int hour) {
        this.hour = hour > 23 || hour < 0 ? 0 : hour;
    }

    public void setMinute(int minute) {
        this.minute = minute > 60 || minute < 0 ? 0 : minute;
    }

    public void setSecond(int second) {
        this.second = second > 60 || second < 0 ? 0 : second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("Time{hour=%d, minute=%d, second=%d}",
                            hour, minute, second);
    }
}
