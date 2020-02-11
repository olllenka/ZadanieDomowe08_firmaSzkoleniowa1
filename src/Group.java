import java.util.Arrays;

public class Group {

    private Teacher teacher;
    private Person[] students;
    private String classDateTime;

    public Group() {
    }

    public Group(Teacher teacher, Person[] students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Group(Teacher teacher, Person[] students, String classDateTime) {
        this.teacher = teacher;
        this.students = students;
        this.classDateTime = classDateTime;
    }

    @Override
    public String toString() {
        return "Grupa: " +
                "\nnauczyciel: " + teacher +
                ",\nuczestnicy: " + Arrays.toString(students) +
                ",\ntermin zajec: " + classDateTime;
    }
}
