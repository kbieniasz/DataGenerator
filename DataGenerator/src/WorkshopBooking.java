public class WorkshopBooking {
    private int workshopBookingID;
    private int conferenceDayBookingID;
    private int workshopID;
    private int numberOfParticipnats;

    public WorkshopBooking(int workshopBookingID, int conferenceDayBookingID, int workshopID, int numberOfParticipnats) {
        this.workshopBookingID = workshopBookingID;
        this.conferenceDayBookingID = conferenceDayBookingID;
        this.workshopID = workshopID;
        this.numberOfParticipnats = numberOfParticipnats;
    }

    public int getWorkshopBookingID() {
        return workshopBookingID;
    }

    public int getConferenceDayBookingID() {
        return conferenceDayBookingID;
    }

    public int getWorkshopID() {
        return workshopID;
    }

    public int getNumberOfParticipnats() {
        return numberOfParticipnats;
    }

    @Override
    public String toString() {
        return "exec [dbo].[PROC_AddWorkshopBooking] '" + conferenceDayBookingID +
                "', '" + workshopID + "', '" + numberOfParticipnats + "'";
    }
    ///    CREATE PROCEDURE [dbo].[PROC_AddWorkshopBooking]
 //           (@ConferenceDayBookingID int,
 //   @WorkshopID int,
 //   @NumberOfParticipants int)
}
