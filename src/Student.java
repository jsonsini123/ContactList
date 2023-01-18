/**
 * A subclass of Person that represents a Student
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

public class Student extends Person{
    private int grade;
    public Student(String firstName, String lastName, String phoneNumber, int grade){
        super(firstName, lastName, phoneNumber);
        this.grade = grade;
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

    public int getGrade() {
        return grade;
    }

    public String toString(){
        return super.getFirstName() + " Grade: " + grade;
    }
}
