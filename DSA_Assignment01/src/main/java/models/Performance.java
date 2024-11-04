package models;

import java.lang.reflect.Array;

public class Performance {
    private String performanceDate = "";
    private char performanceTime = 77; // 69 (Evening) or 77 (Matinee)
    private Array balconySeats;
    private Array circleSeats;
    private Array stallsSeats;

    public Performance(String performanceDate, char performanceTime,Array circleSeats, Array stallsSeats, Array balconySeats) {
        this.performanceDate = performanceDate;
        setPerformanceTime(performanceTime);
        this.circleSeats=circleSeats;
        this.stallsSeats=stallsSeats;
        this.balconySeats=balconySeats;
    }

    public String getPerformanceDate() {
        return performanceDate;
    }

    public void setPerformanceDate(String performanceDate) {
        this.performanceDate = performanceDate;
    }

    public char getPerformanceTime() {
        return performanceTime;
    }

    public void setPerformanceTime(char performanceTime) {
        this.performanceTime = performanceTime;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "performanceDate='" + performanceDate + '\'' +
                ", performanceTime=" + performanceTime +
                ", balconySeats=" + balconySeats +
                ", circleSeats=" + circleSeats +
                ", stallsSeats=" + stallsSeats +
                '}';
    }
}
