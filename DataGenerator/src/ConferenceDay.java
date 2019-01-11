public class ConferenceDay {
    private int conferenceDayID;
    private int conferenceID;
    private int peopleLimit;
    private String dateOfConferenceDay;

    public int getConferenceDayID() {
        return conferenceDayID;
    }

    public int getConferenceID() {
        return conferenceID;
    }

    public int getPeopleLimit() {
        return peopleLimit;
    }

    public String getDateOfConferenceDay() {
        return dateOfConferenceDay;
    }

    public ConferenceDay(int conferenceDayID, int conferenceID, int peopleLimit, String dateOfConferenceDay) {
        this.conferenceDayID = conferenceDayID;
        this.conferenceID = conferenceID;
        this.peopleLimit = peopleLimit;
        this.dateOfConferenceDay = dateOfConferenceDay;
    }

    @Override
    public String toString() {
        return "exec dbo.Proc_AddConferenceDay '" + conferenceID + "', '" + peopleLimit + "', '" + dateOfConferenceDay + "'";
    }
}
