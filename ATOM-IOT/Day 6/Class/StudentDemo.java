package Day6;

public class StudentDemo {
    int id;
    String name;
    String dept;
    static String clg = "SNPSU";

    static {
        System.out.println("Static block executed");
    }

    StudentDemo(int id, String name, String dept, String clg) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        StudentDemo.clg = clg;
    }

    public void write() {
        System.out.println("ID: " + id + " | Name: " + name + " | Dept: " + dept + " | College: " + clg);
    }

    public void studentInfo() {
        System.out.println("Student Info:");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Dept   : " + dept);
        System.out.println("College: " + clg);
    }

    public void getCollegeInfo() {
        System.out.println(StudentDemo.clg);
    }

    public void writeTest() {
        System.out.print(name + " is writinng test.");
    }

    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo(1, "Mohith", "CSE", "SNPSU");
        StudentDemo s2 = new StudentDemo(2, "Santosh", "DS", "SNPSU");
        StudentDemo s3 = new StudentDemo(3, "Keshava", "AIDS", "SNPSU");

        s1.write();
        s2.write();
        s3.write();

        s1.studentInfo();
        s2.studentInfo();
        s1.getCollegeInfo();
        s1.writeTest();
    }
}