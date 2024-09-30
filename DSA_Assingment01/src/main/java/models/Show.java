package models;

public class Show {
    private String showTitle = "";
    private int showRunTime; // in minutes
    private String showStartDate = "";
    private String showEndDate = "";
    private double showTicketPrice;

    public Show(String showTitle,int showRunTime, String showStartDate, String showEndDate, double showTicketPrice) {
        this.showTitle = showTitle;
        this.showRunTime = showRunTime;
        this.showStartDate = showStartDate;
        this.showEndDate = showEndDate;
        this.showTicketPrice = showTicketPrice;

    }

    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public int getShowRunTime() {
        return showRunTime;
    }

    public void setShowRunTime(int showRunTime) {
        this.showRunTime = showRunTime;
    }

    public String getShowStartDate() {
        return showStartDate;
    }

    public void setShowStartDate(String showStartDate) {
        this.showStartDate = showStartDate;
    }

    public String getShowEndDate() {
        return showEndDate;
    }

    public void setShowEndDate(String showEndDate) {
        this.showEndDate = showEndDate;
    }

    public double getShowTicketPrice() {
        return showTicketPrice;
    }

    public void setShowTicketPrice(double showTicketPrice) {
        this.showTicketPrice = showTicketPrice;
    }
}
