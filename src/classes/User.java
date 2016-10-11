//User class does all of the writing
//Atif Hassan
//CSC 202
package classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

/**
 *
 * @author atifm
 */
public final class User extends Person {

    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String photo;
    private PrintWriter out;
    private PrintWriter out2;
    private Person one;

    /**
     *
     */
    public User() {
    }

    //writes to final when new user created
    //there are two files, one for just only usernames, and one will all the of the data

    /**
     *
     * @param firstName
     * @param lastName
     * @param ssn
     * @param dob
     * @param gender
     * @param username
     * @param email
     * @param phone
     * @param photo
     * @param password
     */
    public User(String firstName, String lastName, String ssn, LocalDate dob, String gender, String username, String email, String phone, String photo, String password) {
        one = new Person(firstName, lastName, ssn, dob, gender);
        try {
           out = new PrintWriter("databases/userList.txt");
           
        } catch (IOException e) {
        }
        
        try {
           out2 = new PrintWriter("databases/userNameList.txt");
           
        } catch (IOException e) {
        }
        setUsername(username);
        setPassword(password);
        setEmail(email);
        setPhoto(photo);
        setPhoneNumber(phone);
        
        out2.print("(("+username+"))");
        out2.flush();
        out2.close();

        out.println("((Username:\n"+username);
        out.println("Password:\n"+password);
        out.println("First Name:\n"+firstName);
        out.println("Last Name:\n"+lastName);
        out.println("SSN:\n"+ssn);
        out.println("DOB:\n"+dob);
        out.println("Gender:\n"+gender);
        out.println("EMail:\n"+email);
        out.println("Phone Number:\n"+phone);
        out.println("Photo:\n"+photo+"))");
        out.flush();
        out.close();
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public String getPhoto() {
        return photo;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Name " + one.getFirstName() + " " + one.getLastName()
                + "\nDate of First: " + one.getDOB()
                + "\nGender: " + one.getGender()
                + "\nUsername: " + getUsername()
                + "\nE-mail: " + getEmail()
                + "\nPhone Number: " + getPhoneNumber()
                + "\nSSN: " + getSSN()
                + "\nPhoto Path: " + getPhoto()
                + "\nPassword: " + getPassword();
    }
}
