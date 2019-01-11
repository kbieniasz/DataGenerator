import java.sql.Date;

public class Conference {
    private String language;
    private int conferenceID;
    private String name;
    private String startDate;
    private double studentDiscount;
    private String city;
    private String postalCode;
    private String address;
    private String email;
    private String  endDate;
    private int lenght;

    public String getLanguage() {
        return language;
    }

    public double getStudentDiscount() {
        return studentDiscount;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getLenght() {
        return lenght;
    }

    public int getConferenceID() {
        return conferenceID;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public Conference(String language, int conferenceID, String name, String startDate, double studentDiscount, String city, String postalCode, String address, String email, String endDate, int lenght) {
        this.language = language;
        this.conferenceID = conferenceID;
        this.name = name;
        this.startDate = startDate;
        this.studentDiscount = studentDiscount;
        this.city = city;
        this.postalCode = postalCode;
        this.address = address;
        this.email = email;
        this.endDate = endDate;
        this.lenght = lenght;

    }

    @Override
    public String toString() {
//exec dbo.PROC_AddConference 'Pika nożna', '3/20/2003','0.22','Rzeszow','36084','Wielkopolska 7','dsaads@onet.eu','3/23/2003'

        return "exec dbo.PROC_AddConference '"+ name + "', '" + startDate + "', '" + studentDiscount + "', '"+ city + "', '" + postalCode + "', '" + address + "', '"
                + email +
                "', '" + endDate + "'";
    }
}
