public class WorkshopReservation {
    private int workshopReservationID;
    private  int dayReservationID;
    private int workshopBookingID;

    public WorkshopReservation(int workshopReservationID, int dayReservationID, int workshopBookingID) {
        this.workshopReservationID = workshopReservationID;
        this.dayReservationID = dayReservationID;
        this.workshopBookingID = workshopBookingID;
    }

    @Override
    public String toString() {
        return "exec [dbo].[PROC_AddWorkshopReservation] '" + dayReservationID + "', '" + workshopBookingID + "'";
    }
}
