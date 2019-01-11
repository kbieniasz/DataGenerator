public class Company {
    private int companyID;
    private String companyName;
    private String nip;
    private String phone;
    private String email;
    private String address;
    private String postalCode;
    private String city;
    private String country;

    public Company(int companyID, String companyName, String nip, String phone, String email, String address, String postalCode, String city, String country) {
        this.companyID = companyID;
        this.companyName = companyName;
        this.nip = nip;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public int getCompanyID() {
        return companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getNip() {
        return nip;
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
                "'" + phone + "', '" + email.replaceAll(" ","").replaceAll("\'","")
                + "' ,'" + address.replaceAll("\'","") + "', '" +
                postalCode  + "', '" +  city.replaceAll("\'","") + "', '" + country + "'" + '\n'
                + "exec dbo.Proc_AddCompany '" + companyID + "', '" + companyName.replaceAll("\'","")
                + "', '" + nip  + "'";
    }
}
