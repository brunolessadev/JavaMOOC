public class Student extends Person{

    private int studyCredits = 0;

    public Student(String name, String address) {
        super(name, address);
    }

    public Student(String name, String address, int studyCredits) {
        super(name, address);
        this.studyCredits = studyCredits;
    }

    public void study(){
        studyCredits++;
    }

    public int credits(){
        return studyCredits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.studyCredits;
    }
}
