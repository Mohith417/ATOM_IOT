import java.util.*;

class Student {

    int id;

    Student(int id) {
        this.id = id;
    }

    public String toString() {
        return "Student-" + id;
    }
}

class Question2 {

    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(10);
        Student s2 = new Student(10);

        set.add(s1);
        set.add(s2);

        System.out.println(set.size());
        System.out.println(set);
    }
}

// OUTPUT
// 2
// [Student-10, Student-10]
//
// NOTE:
// HashSet does not guarantee order, so the order inside
// the brackets is not guaranteed.