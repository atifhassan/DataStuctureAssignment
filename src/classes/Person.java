//Simple class to set and get info
//Atif Hassan
//CSC 202
package classes;

/**
 *
 * @author atifm
 */
import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private String ssn;
    private LocalDate dob;
    private String gender;

    public Person() {

    }
    public Person(String firstName, String lastName, String ssn, LocalDate dob, String gender) {
        setFirstName(firstName);
        setLastName(lastName);
        setSSN(ssn);
        setDOB(dob);
        setGender(gender);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return ssn;
    }

    public LocalDate getDOB() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public void setDOB(LocalDate dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
