package model;

public class User {
    protected String userName;
    protected String firstName;
    protected String lastName;
    protected String emailAddress;
    protected String telephoneNumber;
    protected String password;
    protected UserType userType;

    public User(String userName, String firstName, String lastName, String emailAddress, String telephoneNumber, String password, UserType userType) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.telephoneNumber = telephoneNumber;
        this.password = password;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
