/**
 * A subclass of Person that represents a Student
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam, Mr. Blick & Jake Sonsini
 * @version: 2022-2023
 */

public class Student extends Person{
    // Declare attribute
    private int grade;
    public Student(String firstName, String lastName, String phoneNumber, int grade) {
        // Initialize attributes
        super(firstName, lastName, phoneNumber);
        this.grade = grade;
    }

    // Getter method for grade
    public int getGrade() {
        return grade;
    }

    // Specific toString using person to String to present specific attributes
    public String toString(){
        return super.toString() + " Grade: " + grade;
    }
}
