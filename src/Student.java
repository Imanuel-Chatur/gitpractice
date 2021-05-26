
public class Student {

    private String studentName;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    //Getters------------------------------------------------------------------
    public String getStudentName() {
        return studentName;
        
    }

    //Setters------------------------------------------------------------------
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
