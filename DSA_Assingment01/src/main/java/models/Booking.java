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

}
