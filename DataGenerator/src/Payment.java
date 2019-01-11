public class Payment {
    private int paymentID;
    private double valueOfPayment;
    private String paymentDate;
    private int conferenceBookingID;

    public Payment(int paymentID, double valueOfPayment, String paymentDate, int conferenceBookingID) {
        this.paymentID = paymentID;
        this.valueOfPayment = valueOfPayment;
        this.paymentDate = paymentDate;
        this.conferenceBookingID = conferenceBookingID;
    }

    @Override
    public String toString() {
        return "exec [dbo].[PROC_AddPayment] '" + valueOfPayment + "', '"+ paymentDate + "', '"
                + conferenceBookingID + "'";

    }
}
