/**
 * A subclass of Person that represents a Friend
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam, Mr. Blick & Jake Sonsini
 * @version: 2022-2023
 */
public class Friend extends Person{
    // Declare attribute
    private String hobby;
    public Friend(String firstName, String lastName, String phoneNumber, String hobby){
        // Initialize attributes
        super(firstName, lastName, phoneNumber);
        this.hobby = hobby;
    }

    // Getter method for hobby
    public String getHobby() {
        return hobby;
    }

    // Specific toString using person to String to present specific attributes
    public String toString(){
        return super.toString() + " " + hobby;
    }
}
