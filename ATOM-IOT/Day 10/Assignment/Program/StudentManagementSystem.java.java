import java.util.*;

class Student {
    int id;
    String name;
    String department;
    double marks;

    Student(int id, String name, String department, double marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{id=" + id +
               ", name='" + name + '\'' +
               ", department='" + department + '\'' +
               ", marks=" + marks + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student other = (Student) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student(101, "Rahul", "CSE", 85.5);
        Student s2 = new Student(102, "Ananya", "ECE", 92.0);
        Student s3 = new Student(103, "Kiran", "ISE", 78.5);
        Student s4 = new Student(104, "Meena", "CSE", 92.0);
        Student s5 = new Student(105, "Arjun", "ECE", 85.5);

        // Same ID but different details
        Student s6 = new Student(101, "Vikram", "ISE", 95.0);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        System.out.println("Students before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort ArrayList:
        // 1. Higher marks first
        // 2. Name alphabetical order
        // 3. Lower ID first
        Comparator<Student> marksComparator = (a, b) -> {
            int result = Double.compare(b.marks, a.marks);

            if (result == 0) {
                result = a.name.compareTo(b.name);
            }

            if (result == 0) {
                result = Integer.compare(a.id, b.id);
            }

            return result;
        };

        students.sort(marksComparator);

        System.out.println("\nStudents after sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // TreeSet:
        // 1. Department alphabetical order
        // 2. Marks descending
        // 3. ID ascending
        Comparator<Student> treeComparator = (a, b) -> {
            int result = a.department.compareTo(b.department);

            if (result == 0) {
                result = Double.compare(b.marks, a.marks);
            }

            if (result == 0) {
                result = Integer.compare(a.id, b.id);
            }

            return result;
        };

        TreeSet<Student> treeSet = new TreeSet<>(treeComparator);
        treeSet.addAll(students);

        System.out.println("\nTreeSet sorted by department, marks and ID:");
        for (Student s : treeSet) {
            System.out.println(s);
        }
    }
}