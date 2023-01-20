/**
 * A class that stores subclasses of Person as a contact list.
 * The user is presented with a menu of options and may add, sort,
 * search, or list the contacts.
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam, Mr. Blick & Jake Sonsini
 * @version: 2022-2023
 */
// Import necessary classes that contain needed methods or objects
import java.util.ArrayList;
import java.util.Scanner;
public class ContactList
{
    // Declare the contacts ArrayList
    ArrayList<Person> contacts;
    // Initialize the contacts ArrayList
    public ContactList(){
        contacts = new ArrayList<Person>();
    }
    // Print instructions for the Contact List
    public void printMenuOptions() {
        System.out.println("Menu: ");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. Search By First Name");
        System.out.println("7. Search By Last Name");
        System.out.println("8. Search by Phone Number");
        System.out.println("0. Exit");
    }

    /**
     * Asks user for input to create and add a new Person
     * to the contact list
     */
    public void addContact() {
        // Select contact type for desired choice
        System.out.println("Select a type of contact to add:\n" +
                "1. Student\n" +
                "2. Friend\n" +
                "3. Person");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        // Run specific methods based off of the contact type selected
        if (input.equals("1")){
            newStudent();
        }
        if (input.equals("2")){
            newFriend();
        }
        if (input.equals("3")){
            newPerson();
        }
    }
    // Method for the user to create a new Student
    public void newStudent(){
        // Get first name
        System.out.println("First Name: ");
        Scanner t = new Scanner(System.in);
        String firstName = t.nextLine();
        System.out.println();

        // Get Last name
        System.out.println("Last Name: ");
        Scanner y = new Scanner(System.in);
        String lastName = y.nextLine();
        System.out.println();

        // Get phoneNumber
        System.out.println("Phone Number: ");
        Scanner u = new Scanner(System.in);
        String phoneNumber = u.nextLine();
        System.out.println();

        // Get student specific attribute "grade"
        System.out.println("Grade: ");
        Scanner i = new Scanner(System.in);
        int grade = i.nextInt();
        System.out.println();

        // Combine all values in a new object and add to the contacts ArrayList
        Person in = new Student(firstName, lastName, phoneNumber, grade);
        contacts.add(in);
    }

    // Method for the user to create a new Friend
    public void newFriend(){
        // Get first name
        System.out.println("First Name: ");
        Scanner t = new Scanner(System.in);
        String firstName = t.nextLine();
        System.out.println();

        // Get last name
        System.out.println("Last Name: ");
        Scanner y = new Scanner(System.in);
        String lastName = y.nextLine();
        System.out.println();

        // Get phone number
        System.out.println("Phone Number: ");
        Scanner u = new Scanner(System.in);
        String phoneNumber = u.nextLine();
        System.out.println();

        // Get friend specific attribute "hobby"
        System.out.println("Hobby: ");
        Scanner i = new Scanner(System.in);
        String hobby = i.nextLine();
        System.out.println();

        // Combine all values to create new friend object and add to contact ArrayList
        Person in = new Friend(firstName, lastName, phoneNumber, hobby);
        contacts.add(in);
    }

    // Method for user to create new Person
    public void newPerson(){
        // Get first name
        System.out.println("First Name: ");
        Scanner t = new Scanner(System.in);
        String firstName = t.nextLine();
        System.out.println();

        // Get last name
        System.out.println("Last Name: ");
        Scanner y = new Scanner(System.in);
        String lastName = y.nextLine();
        System.out.println();

        // Get phone number
        System.out.println("Phone Number: ");
        Scanner u = new Scanner(System.in);
        String phoneNumber = u.nextLine();
        System.out.println();

        // Combine all values to make new person object and add to contacts ArrayList
        Person in = new Person(firstName, lastName, phoneNumber);
        contacts.add(in);
    }
    /**
     * Loops through and prints all contacts
     */
    public void printContacts() {
        for (int i = 0; i < contacts.size(); i++){
            System.out.println(contacts.get(i));
        }
    }

    /**
     * Bubble sorts the contacts in the list by firstName,
     * lastName, or phoneNumber
     * @param sortBy: 0=firstName, 1=lastName, 2=phoneNumber
     */
    public void sort(int sortBy) {
        // Create a temporary person object to hold values critical for swapping
        Person temp;
        // Run bubble sort method to sort by first name
        if (sortBy == 0){
            for(int pass = 1; pass < contacts.size(); pass++) {
                for(int p = 0; p < contacts.size() - pass; p++){
                    // Compare first name of current object and future object and determine whether to swap
                    if (contacts.get(p).getFirstName().compareTo(contacts.get(p + 1).getFirstName()) >= 0){
                        // Swap using temporary person object
                        temp = contacts.get(p);
                        contacts.set(p, contacts.get(p + 1));
                        contacts.set(p + 1, temp);
                    }
                }
            }
        }
        // Run bubble sort method to sort by last name
        if (sortBy == 1){
            for(int pass = 1; pass < contacts.size(); pass++) {
                for(int p = 0; p < contacts.size() - pass; p++){
                    // Compare last name of current object and future object and determine whether to swap
                    if (contacts.get(p).getLastName().compareTo(contacts.get(p + 1).getLastName()) >= 0){
                        // Swap using temporary person object
                        temp = contacts.get(p);
                        contacts.set(p, contacts.get(p + 1));
                        contacts.set(p + 1, temp);
                    }
                }
            }
        }
        // Run bubble sort method to sort by phone number
        if (sortBy == 2){
            for(int pass = 1; pass < contacts.size(); pass++) {
                for(int p = 0; p < contacts.size() - pass; p++){
                    // Compare phone number of current object and future object and determine whether to swap
                    if (contacts.get(p).getPhoneNumber().compareTo(contacts.get(p + 1).getPhoneNumber()) >= 0){
                        // Swap using temporary person object
                        temp = contacts.get(p);
                        contacts.set(p, contacts.get(p + 1));
                        contacts.set(p + 1, temp);
                    }
                }
            }
        }
    }

    public Person searchByFirstName(String firstName){
        // Run for loop to gather object with given first name
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getFirstName().equals(firstName)){
                return contacts.get(i);
            }
        }
        return null;
    }
    public Person searchByLastName(String lastName){
        // Run for loop to gather object with given last name
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getLastName().equals(lastName)){
                return contacts.get(i);
            }
        }
        return null;
    }
    public Person searchByPhoneNumber(String phoneNumber){
        // Run for loop to gather object with given phone number
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)){
                return contacts.get(i);
            }
        }
        return null;
    }
    /**
     * Lists just the Student objects in the Contact List
     */
    public void listStudents() {
        // Use for loop to print all students
        for (int i = 0; i < contacts.size(); i++){
            // Use instanceof command to determine whether the specific contact is a stuent
            if (contacts.get(i) instanceof Student){
                System.out.println(contacts.get(i));
            }
        }
    }

    /**
     * Loops providing menu options to the user
     * until the user exits
     */
    public void run() {
        String input = "empty";
        // Run a while loop so program runs until user chooses against that
        while (!input.equals("0")) {
            System.out.println("Welcome to your Contacts List");
            System.out.println("Please pick from the following menu options");
            printMenuOptions();
            //based off of input run certain programs
            Scanner i = new Scanner(System.in);
            input = i.nextLine();
            if (input.equals("1")){
                addContact();
            }
            if (input.equals("2")){
                sort(0);
                printContacts();
            }
            if (input.equals("3")){
                sort(1);
                printContacts();
            }
            if (input.equals("4")){
                sort(2);
                printContacts();
            }
            if (input.equals("5")){
                listStudents();
            }
            if (input.equals("6")){
                // Take in first name selection
                Scanner f = new Scanner(System.in);
                System.out.println("Enter a First Name: ");
                String name = f.nextLine();
                // If the name is in the contact list print, otherwise inform user
                if (searchByFirstName(name) == null){
                    System.out.println(name + " is not in the list");
                }
                else{
                    System.out.println(searchByFirstName(name));
                }
            }
            if (input.equals("7")){
                // Take in last name selection
                Scanner l = new Scanner(System.in);
                System.out.println("Enter a Last Name: ");
                String last = l.nextLine();
                // If the name is in the contact list print, otherwise inform user
                if (searchByLastName(last) == null){
                    System.out.println(last + " is not in the list");
                }
                else{
                    System.out.println(searchByLastName(last));
                }
            }
            if (input.equals("8")){
                // Take in phone number selection
                Scanner p = new Scanner(System.in);
                System.out.println("Enter a Phone Number: ");
                String phone = p.nextLine();
                // If the phone number is in the contact list print, otherwise inform user
                if (searchByPhoneNumber(phone) == null){
                    System.out.println(phone + " is not in the list");
                }
                else{
                    System.out.println(searchByPhoneNumber(phone));
                }
            }
        }
    }


    public static void main(String[] args)
    {
        // Run program
        ContactList cl = new ContactList();
        cl.run();
    }
}
