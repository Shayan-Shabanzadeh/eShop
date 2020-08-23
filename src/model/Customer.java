package model;

public class Customer extends User  {
    public Customer(String userName, String firstName, String lastName, String emailAddress, String telephoneNumber, String password, UserType userType) {
        super(userName, firstName, lastName, emailAddress, telephoneNumber, password, userType);
    }
}
