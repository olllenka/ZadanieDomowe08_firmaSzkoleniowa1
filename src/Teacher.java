public class Teacher extends Person {

    private String subject;
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, String secondName, String subject, double salary) {
        super(name, secondName);
        this.subject = subject;
        this.salary = salary;
    }
}
