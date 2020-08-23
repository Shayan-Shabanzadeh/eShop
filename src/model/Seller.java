package model;

public class Seller extends User{

    private String companyName;

    public Seller(String userName,
                  String firstName,
                  String lastName,
                  String emailAddress,
                  String telephoneNumber,
                  String password,
                  UserType userType,
                  String companyName) {
        super(userName, firstName, lastName, emailAddress, telephoneNumber, password, userType);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
