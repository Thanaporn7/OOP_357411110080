package OOP_lab8;
//person is superclass
//student is subclass
public class student  extends Person{
   private String studentID;
    private String  major;


    public student(String personID, String name) {
        super(personID, name, gender, age);
        this.studentID = studentID;
        this.major = major;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentID='" + studentID + '\'' +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}//class
