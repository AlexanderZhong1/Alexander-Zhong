public class courses {
    public String courseName;
    public int studentGrade;





    // constructor
    public courses(String courseName, int studentGrade) {
        this.courseName = courseName;
        this.studentGrade = studentGrade;

    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override

    public String toString() {
        return "courses{" +
                "courseName='" + courseName + '\'' +
                ", studentGrade=" + studentGrade +
                '}';
    }
}
