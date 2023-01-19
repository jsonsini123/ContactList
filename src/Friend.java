/**
 * A subclass of Person that represents a Friend
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam, Mr. Blick & Jake Sonsini
 * @version: 2022-2023
 */
public class Friend extends Person{
    private String hobby;
    public Friend(String firstName, String lastName, String phoneNumber, String hobby){
        super(firstName, lastName, phoneNumber);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public String toString(){
        return super.getFirstName() + " " + hobby;
    }
}
