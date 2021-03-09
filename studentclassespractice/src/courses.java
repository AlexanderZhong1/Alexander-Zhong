public class courses {
    public String courseName;
    public int studentGrade;





    // constructor
    public courses(String courseName, int studentGrade) {
        this.courseName = courseName;
        this.studentGrade = studentGrade;

    }

    public courses(String courseName) {
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override

    public String toString() {
        return courseName + " " + studentGrade;
    }
}
