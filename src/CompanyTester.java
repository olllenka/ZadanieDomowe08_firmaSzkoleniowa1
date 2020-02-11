public class CompanyTester {
    public static void main(String[] args) {
        Person teacher1 = new Teacher("Adam","Nowak", "Folozofia", 3000);
        Person student1 = new Student("Jas","Kowalski","Nihilizm");
        Person student2 = new Student("Zosia","Fortepian","Nihilizm");

        Person[] studentsGroup1 = new Student[2];
        studentsGroup1[0] = student1;
        studentsGroup1[1] = student2;

        Group group1 = new Group((Teacher) teacher1,studentsGroup1,"Pn 9.30-12");

        System.out.println("Nauczyciel: " + teacher1);
        System.out.println("Student: " + student1);
        System.out.println("Student: " + student2);
        System.out.println();

        System.out.println(group1);


    }
}
