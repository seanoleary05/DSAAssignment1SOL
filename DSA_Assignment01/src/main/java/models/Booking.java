package models;


public class Booking {
    private String customerDetails;
    private int bookingID;
    private Performance performance;
    private String seatDetails;

    public Booking(String customerDetails, int bookingID, Performance performance, String seatDetails) {
        this.customerDetails = customerDetails;
        this.bookingID = bookingID;
        this.performance = performance;
        this.seatDetails = seatDetails;
    }

    public String getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(String customerDetails) {
        this.customerDetails = customerDetails;
    }

    public String getSeatDetails() {
        return seatDetails;
    }

    public void setSeatDetails(String seatDetails) {
        this.seatDetails = seatDetails;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }
}
