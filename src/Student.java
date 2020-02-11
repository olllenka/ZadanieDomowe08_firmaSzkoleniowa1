public class Student extends Person{

    private String course;

    public Student() {
    }

    public Student(String name, String secondName, String course) {
        super(name, secondName);
        this.course = course;
    }
}
