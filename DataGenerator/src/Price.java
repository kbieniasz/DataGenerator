public class Price {
    private int priceID;
    private int conferenceID;
    private double valuePerDay;
    private String startdate;
    private String endDate;

    public Price(int priceID, int conferenceID, double valuePerDay, String startdate, String endDate) {
        this.priceID = priceID;
        this.conferenceID = conferenceID;
        this.valuePerDay = valuePerDay;
        this.startdate = startdate;
        this.endDate = endDate;
    }

    public int getPriceID() {
        return priceID;
    }

    public int getConferenceID() {
        return conferenceID;
    }

    public double getValuePerDay() {
        return valuePerDay;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "exec dbo.PROC_AddPrice '" + conferenceID +"', '" + valuePerDay +"', '" + startdate + "', '" + endDate + "'";
    }
}
