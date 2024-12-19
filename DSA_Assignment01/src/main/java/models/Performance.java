package models;

import java.lang.reflect.Array;

public class Performance {
    private String performanceDate = "";
    private char performanceTime; // 69 (Evening) or 77 (Matinee)
    private boolean[][] balconySeats;
    private boolean[][] circleSeats;
    private boolean[][] stallsSeats;

    public Performance(String performanceDate, char performanceTime, boolean circleSeats[][], boolean stallsSeats[][], boolean balconySeats[][]) {
        this.performanceDate = performanceDate;
        setPerformanceTime(performanceTime);
        // Initialize seating arrangements
        this.balconySeats = new boolean[3][8]; // 3 rows of 8 seats
        this.circleSeats = new boolean[3][10]; // 3 rows of 10 seats
        this.stallsSeats = new boolean[4][10]; // 4 rows of 10 seats
    }
    // Helper method to return the correct seating section based on the provided name
    private boolean[][] getSection(String section) {
        String sectionLower = section.toLowerCase();

        return sectionLower.equals("balcony") ? balconySeats :
               sectionLower.equals("circle") ? circleSeats :
               sectionLower.equals("stalls") ? stallsSeats : null;
        }


   /* public boolean reserveSeat(String section, int row, int seat){
        boolean[][] selectedSection = getSection(section);
        if (selectedSection == null){

        }
    }

    */

    public String getPerformanceDate() {
        return performanceDate;
    }

    public void setPerformanceDate(String performanceDate) {
        this.performanceDate = performanceDate;
    }

    public String classifyPerformanceTime(){
        return (performanceTime == 69) ? "Evening" : "Matinee";
    }

    public char getPerformanceTime() {
        return (performanceTime=='E') ? 69 : (performanceTime=='M') ? 77: 'I';
    }

    public void setPerformanceTime(char performanceTime) {
        performanceTime = Character.toUpperCase(performanceTime);
        if(performanceTime == 'E' || performanceTime == 'M') { this.performanceTime = performanceTime; }
    }

    @Override
    public String toString() {
        return "Performance -> " +
                " Date: " + performanceDate + '\'' +
                ", Time: " + performanceTime +
                ", BalconySeats: " + balconySeats +
                ", CircleSeats: " + circleSeats +
                ", StallsSeats=" + stallsSeats;
    }
}
