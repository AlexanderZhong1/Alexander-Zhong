import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    public String schoolName;
    public int yearEstablished;
    public int numOfStudents;

    public School(String schoolName, int yearEstablished, int numOfStudents) {
        this.schoolName = schoolName;
        this.yearEstablished = yearEstablished;
        this.numOfStudents = numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void addTeacher(String firstName, String lastName, String subject) {
        teachers.add(new Teacher(firstName, lastName, subject));
    }

    public void deleteTeacher(String firstName) {
        for (int x = 0; x < teachers.size(); x++) {
            if (teachers.get(x).getFirstName() == firstName) {
                teachers.remove(x);
                break;
            }
        }
    }

    public void addStudent(String firstName, String lastName, int grade) {
        students.add(new Student(firstName, lastName, grade));
    }

    public void deleteStudent(String firstName) {
        for (int x = 0; x < students.size(); x++) {
            if (students.get(x).getFirstName() == firstName) {
                students.remove(x);
                break;
            }
        }
    }


}
