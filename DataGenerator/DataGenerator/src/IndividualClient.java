public class IndividualClient {
    private int individualClientID;
    private String firstanme;
    private String lastname;
    private String phone;
    private String email;
    private String address;
    private String postalCode;
    private String city;
    private String country;

    public IndividualClient(int individualClientID, String firstanme, String lastname, String phone, String email, String address, String postalCode, String city, String country) {
        this.individualClientID = individualClientID;
        this.firstanme = firstanme;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public int getIndividualClientID() {
        return individualClientID;
    }

    public String getFirstanme() {
        return firstanme;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "exec dbo.Proc_AddClient " +
                "'" + phone + "', '" + email.replaceAll("\'","").replaceAll(" ","") + "' ,'" + address.replaceAll("\'","") + "', '" +  postalCode  + "', '" +  city.replaceAll("\'","") + "', '" + country + "'" + '\n'
                + "exec dbo.Proc_AddIndividualClient '"+ individualClientID + "', '" + firstanme.replaceAll("\'","") + "', ' " + lastname.replaceAll("\'","") + "'";
    }
}
