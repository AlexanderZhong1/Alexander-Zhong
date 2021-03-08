import java.util.UUID;

public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    public String studentID = UUID.randomUUID().toString();

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    // sets the last name of the student
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // sets the first name of the student
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // sets the grade of the student
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // gets the last name of the student
    public String getLastName() {
        return lastName;
    }

    // gets the first name of the student
    public String getFirstName() {
        return firstName;
    }
    // returns the grade
    public int getGrade() {
        return grade;
    }

    // returns the student id
    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade;
    }
}
