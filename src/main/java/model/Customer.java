package model;

/**
 *
 * @author TM
 */
public class Customer {
    private String firstName;
    private String lastName;
    
    public Customer(){};

    public Customer(String firstName) {
        this.firstName = firstName;
    }
    
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
   
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    
}
