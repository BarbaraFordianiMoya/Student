package student;

public class Student {
    String fName;
    String lName;
    int stuId;
    String stuStatus;
    
    public Student(String fName, String lName, int stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }
    public String getFirstName() {
        return fName;
    }
    public String getLastName() {
        return lName;
    }
    public int getStudentId() {
        return stuId;
    }
    public String getStudentStatus() {
        return stuStatus;
    }
    public void setFirstName(String fName) {
        this.fName = fName;
    }
    public void setLastName(String lName) {
        this.lName = lName;
    }
    public void setStudentId(int stuId) {
        this.stuId = stuId;
    }
    public void setStudentStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }
}
