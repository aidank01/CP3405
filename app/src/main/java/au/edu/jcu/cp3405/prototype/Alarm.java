package au.edu.jcu.cp3405.prototype;

import android.util.Log;

import java.util.Calendar;

public class Alarm {
    int id;
    int hour;
    int min;
    int day;
    String label;

    public Alarm(int id, int hour, int min, int day, String label) {
        this.id = id;
        this.hour = hour;
        this.min = min;
        this.day = day;
        this.label = label;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public String getDay() {
        switch (day) {
            case 0:
                return "Mon";
            case 1:
                return "Tue";
            case 2:
                return "Wed";
            case 3:
                return "Thur";
            case 4:
                return "Fri";
            case 5:
                return "Sat";
            case 6:
                return "Sun";
            default:
                return "Not Set";
        }
    }

    public String getLabel() {
        return label;
    }
}
