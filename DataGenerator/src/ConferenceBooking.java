public class ConferenceBooking {
    private int conferenceBookingID;
    private int conferenceID;
    private int clientID;
    private String bookingDate;

    public ConferenceBooking(int conferenceBookingID, int conferenceID, int clientID, String bookingDate) {
        this.conferenceBookingID = conferenceBookingID;
        this.conferenceID = conferenceID;
        this.clientID = clientID;
        this.bookingDate = bookingDate;
    }

    public int getConferenceBookingID() {
        return conferenceBookingID;
    }

    public int getConferenceID() {
        return conferenceID;
    }

    public int getClientID() {
        return clientID;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    @Override
    public String toString() {
        return "exec dbo.Proc_AddConferenceBooking '" + conferenceID + "', '" + clientID + "', '" + bookingDate + "'";
    }

    //CREATE PROCEDURE [dbo].[PROC_AddConferenceBooking]
     //       (@ConferenceID int,
    //@ClientID int,
    //@BookingDate date)


}
