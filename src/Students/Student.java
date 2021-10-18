package Students;

public class Student {
    private String sId;
    private String sName;
    private double gpa;
    private Course course;

    public Student(String sId, String sName, double gpa, Course course) {
        this.sId = sId;
        this.sName = sName;
        this.gpa = gpa;
        this.course = course;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
