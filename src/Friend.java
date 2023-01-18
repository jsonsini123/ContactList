public class Friend extends Person{
    private String hobby;
    public Friend(String firstName, String lastName, String phoneNumber, String hobby){
        super(firstName, lastName, phoneNumber);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }
    public String getFirstName() {
        return super.getFirstName();
    }

    public String getLastName() {
        return super.getLastName();
    }

    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    public String toString(){
        return super.getFirstName() + " " + hobby;
    }
}
