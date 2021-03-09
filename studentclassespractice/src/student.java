import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class student {

    public String firstName;
    public int ID = 0;
    ArrayList<courses> studentCourses = new ArrayList<>();
    private static final AtomicInteger counter = new AtomicInteger(0);

    public student(String firstName, String[] coursesList) {
        this.firstName = firstName;
        ID = counter.incrementAndGet();

        if (coursesList.length > 8) {
            System.out.println("Only 8 courses.");

        }
        else {
            for (int x = 0; x < coursesList.length;x++}

    }

    public void addCourse(String courseName, int courseGrade) {
        if (studentCourses.size() > 8) {
            System.out.println("Already more than 8 courses");
        }
        else {
            studentCourses.add(new courses(courseName, courseGrade));
        }
    }

    public void printCourses() {
        System.out.print("[");
        for (int x = 0; x >= studentCourses.size(); x++) {
            System.out.print(studentCourses.get(x) + ", ");
            System.out.println("]");
        }
    }

    public int findAverage() {
        int average;
        double total = 0;
        for (int x = 0; x >= studentCourses.size(); x++){
            total += studentCourses.get(x).getStudentGrade();
        }
        average = (int)total/studentCourses.size();


        return average;
    }


    @Override
    public String toString() {
        return "student{" +
                "firstName='" + firstName + '\'' +
                ", ID=" + ID +
                '}';
    }
}
