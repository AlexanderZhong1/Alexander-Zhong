import java.util.ArrayList;

public class School {

    // all the datatypes
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    public String schoolName;
    public int yearEstablished;
    public int numOfStudents;


    // constructor
    public School(String schoolName, int yearEstablished, int numOfStudents) {
        this.schoolName = schoolName;
        this.yearEstablished = yearEstablished;
        this.numOfStudents = numOfStudents;
    }


    // sets the number of student
    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    // set the school name
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    // set years established
    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }
    // get number of the students
    public int getNumOfStudents() {
        return numOfStudents;
    }
    // get the year the school was established
    public int getYearEstablished() {
        return yearEstablished;
    }
    // get the school name
    public String getSchoolName() {
        return schoolName;
    }


    // add the teacher
    public void addTeacher(String firstName, String lastName, String subject) {
        teachers.add(new Teacher(firstName, lastName, subject));
    }

    // deletes the teacher from system
    public void deleteTeacher(String firstName, String lastName) {
        for (int x = 0; x < teachers.size(); x++) {
            if (teachers.get(x).getFirstName() == firstName && teachers.get(x).getLastName() == lastName) {
                teachers.remove(x);
                break;
            }
        }
    }


    // adds the student
    public void addStudent(String firstName, String lastName, int grade) {
        students.add(new Student(firstName, lastName, grade));
    }
    // deletes a students
    public void deleteStudent(String firstName, String lastName) {
        for (int x = 0; x < students.size(); x++) {
            if (students.get(x).getFirstName() == firstName && students.get(x).getLastName() == lastName) {
                students.remove(x);
                break;
            }
        }
    }

    // show all the teachers
    public String showTeachers() {
        String listofteachers = "[";
        for (int x = 0; x < teachers.size(); x++) {
            if (x == teachers.size() - 1) {
                listofteachers += teachers.get(x).getFirstName() + " " + teachers.get(x).getLastName();
                break;
            }
            listofteachers += teachers.get(x).getFirstName() + " " + teachers.get(x).getLastName() + ", ";

        }
        listofteachers += "]";
        return listofteachers;
    }

    // show all the students
    public String showStudents() {
        String listofstudents = "[";
        for (int x = 0; x < students.size(); x++) {
            if (x == students.size() - 1) {
                listofstudents += students.get(x).getFirstName() + " " + students.get(x).getLastName();
                break;
            }
            listofstudents += students.get(x).getFirstName() + " " + students.get(x).getLastName() + ", ";
        }
        listofstudents += "]";
        return listofstudents;
    }


}
