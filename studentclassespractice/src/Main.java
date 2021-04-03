

public class Main {
    public static void main(String[] args) {
        student studentnumone = new student("Bob", new String[]{"Cooking", "Science", "Math"});
        studentnumone.setCourseGrade("Cooking", 86);
        studentnumone.setCourseGrade("Science", 60);
        studentnumone.setCourseGrade("Math", 90);

        studentnumone.printCourses();

        System.out.println("Average: " + studentnumone.findAverage());

        System.out.println("Add Course: " + "CS");
        studentnumone.addCourse("CS", 64);

        System.out.println("Print Courses");
        studentnumone.printCourses();

    }



}
