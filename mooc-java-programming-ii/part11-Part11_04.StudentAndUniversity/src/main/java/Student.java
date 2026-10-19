public class Student {
    private int studentID;
    private String name;
    private University university; // Associação com a universidade

    public Student(String name, int studentID, University university) {
        this.name = name;
        this.studentID = studentID;
        this.university = university;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}