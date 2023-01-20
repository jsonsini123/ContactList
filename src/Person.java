/**
 * A class that represents a Person
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam, Mr. Blick & Jake Sonsini
 * @version: 2022-2023
 */

public class Person {
    // Declare attributes
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Person(String firstName, String lastName, String phoneNumber){
        // Initialize attributes
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods for attributes
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // toString method to print all attributes
    public String toString(){
        return firstName + " " + lastName + " - #" + phoneNumber;
    }
}
