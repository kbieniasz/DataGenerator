public class Workshop {
    private int workshopID;
    private int dayOfConferenceID;
    private String subject;
    private String startTime;
    private String endTime;
    private int peopleLimit;
    private Double money;
    private int currentOccupancy;

    public Workshop(int workshopID, int dayOfConferenceID, String subject, String startTime, String endTime, int peopleLimit, Double money) {
        this.workshopID = workshopID;
        this.dayOfConferenceID = dayOfConferenceID;
        this.subject = subject;
        this.startTime = startTime;
        this.endTime = endTime;
        this.peopleLimit = peopleLimit;
        this.money = money;
        this.currentOccupancy = 0;
    }

    public int getPeopleLimit() {
        return peopleLimit;
    }

    public int getCurrentOccupancy() {
        return currentOccupancy;
    }

    public void setCurrentOccupancy(int currentOccupancy) {
        this.currentOccupancy = currentOccupancy;
    }

    public int getWorkshopID() {
        return workshopID;
    }

    public int getDayOfConferenceID() {
        return dayOfConferenceID;
    }

    @Override
    public String toString() {
        return "exec dbo.PROC_AddWorkshop '" + dayOfConferenceID + "', '" + subject + "', '" + startTime + "', '" +
                 endTime + "', '" + peopleLimit + "', '" + money + "'";
    }

    /*@DayOfConferenceID int,
    @Subject varchar(50),
    @StartTime time(7),
    @EndTime time(7),
    @PeopleLimit int,
    @Price money)
    */
}
