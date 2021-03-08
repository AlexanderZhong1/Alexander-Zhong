public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;

    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }
    // get the last name
    public String getLastName() {
        return lastName;
    }
    // get the subject
    public String getSubject() {
        return subject;
    }
    // sets the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // sets the first name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // sets the subjects
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // prints the object as a string
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Subject: " + subject;
    }
}
