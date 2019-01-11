public class ConferenceDayBooking {
    private int conferenceDayBookingID;
    private int dayOfConferenceID;
    private int conferenceBookingID;
    private int numberOfParticipants;
    private int numberOfStudents;
    private double priceOfWorkshops;

    public ConferenceDayBooking(int conferenceDayBookingID, int dayOfConferenceID, int conferenceBookingID, int numberOfParticipants, int numberOfStudents) {
        this.conferenceDayBookingID = conferenceDayBookingID;
        this.dayOfConferenceID = dayOfConferenceID;
        this.conferenceBookingID = conferenceBookingID;
        this.numberOfParticipants = numberOfParticipants;
        this.numberOfStudents = numberOfStudents;
        this.priceOfWorkshops = 0;
    }

    public double getPriceOfWorkshops() {
        return priceOfWorkshops;
    }

    public void setPriceOfWorkshops(double priceOfWorkshops) {
        this.priceOfWorkshops = priceOfWorkshops;
    }

    public int getDayOfConferenceID() {
        return dayOfConferenceID;
    }

    public int getConferenceDayBookingID() {
        return conferenceDayBookingID;
    }

    public int getConferenceBookingID() {
        return conferenceBookingID;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        return "exec dbo.Proc_AddConferenceDayBooking '" + dayOfConferenceID +"', '" + conferenceBookingID + "', '"
                + numberOfParticipants +
                "', '" + numberOfStudents + "'";
    }

    /*    CREATE PROCEDURE [dbo].[PROC_AddConferenceDayBooking]
            (@DayOfConferenceID int,
    @ConferenceBookingID int,
    @NumberOfParticpiants int,
    @NumberOfStudents int)
    */
    }
