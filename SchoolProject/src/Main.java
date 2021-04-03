import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        School school = new School("School123", 2020, 30);

        // add ten random students
        school.addStudent("Bobby", "Smith", 11);
        school.addStudent("Tony", "Chan", 12);
        school.addStudent("Lorenzo", "Smith", 9);
        school.addStudent("Timmy", "Chan", 10);
        school.addStudent("Pat", "Smith", 12);
        school.addStudent("Sara", "Chan", 11);
        school.addStudent("Zoe", "Smith", 12);
        school.addStudent("Bob", "Chan", 10);
        school.addStudent("Sob", "Smith", 10);
        school.addStudent("Rob", "Chan", 8);


        // prints out all the students
        System.out.println(school.showStudents());

        school.addTeacher("Alex", "Bob", "Math");
        school.addTeacher("Mat", "Bob", "Computer Science");
        school.addTeacher("Bob", "tob", "English");

        // prints out all the teachers
        System.out.println(school.showTeachers());

        // deletes the students

        school.deleteStudent("Bob", "Chan");
        school.deleteStudent("Pat", "Smith");

        // shows the students to check if students are deleted

        System.out.println(school.showStudents());

        // deletes the teachers
        school.deleteTeacher("Alex", "Bob");


        // checks if teachers are deleted
        System.out.println(school.showTeachers());

 



    }
}
