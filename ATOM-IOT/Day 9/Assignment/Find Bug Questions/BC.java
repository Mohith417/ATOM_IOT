// ==================== BUGGY CODE QUESTION 1 ====================

class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0);        // BUG: semicolon here ends the if statement
                System.out.println(i);
        }
    }
}

// a) ACTUAL OUTPUT:
// 1
// 2
// 3
// 4
// 5

// b) MISTAKE: Semicolon after if condition makes it an empty statement
//    println runs for every iteration regardless of condition

// c) FIX: Remove the semicolon after if(i % 2 == 0)

class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
// CORRECT OUTPUT:
// 2
// 4


// ==================== BUGGY CODE QUESTION 2 ====================

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        name = name;       // BUG: assigning parameter to itself
        marks = marks;     // BUG: assigning parameter to itself
    }

    void display() {
        System.out.println(name + " : " + marks);
    }
}

class Test {
    public static void main(String[] args) {
        Student s = new Student("Arun", 85);
        s.display();
    }
}

// a) ACTUAL OUTPUT:
// null : 0

// b) MISTAKE: In constructor, name=name and marks=marks assigns
//    the parameter to itself, instance variables never get assigned

// c) FIX: Add this. keyword

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " : " + marks);
    }
}
// CORRECT OUTPUT:
// Arun : 85


// ==================== BUGGY CODE QUESTION 3 ====================

class Test {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
            System.out.println("Division completed");
        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
        System.out.println("Program completed");
    }
}

// a) ACTUAL OUTPUT:
// Exception occurred
// Program completed

// b) "Division completed" will NOT be executed
//    because a/b throws exception and jumps to catch block

// c) FIX: Use finally block for "Division completed"

class Test {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("Division completed");
        }
        System.out.println("Program completed");
    }
}
// CORRECT OUTPUT:
// Exception occurred
// Division completed
// Program completed


// ==================== BUGGY CODE QUESTION 4 ====================

class Test {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
            if (sum > 6) {     // BUG: this breaks the loop early
                break;
            }
            System.out.println(sum);
        }
        System.out.println("Final Sum = " + sum);
    }
}

// a) ACTUAL OUTPUT:
// 1
// 3
// 6
// Final Sum = 10

// b) MISTAKE: if(sum > 6) break causes loop to exit at i=4
//    so 10 and 15 never get printed

// c) FIX: Remove the if-break block completely

class Test {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println("Final Sum = " + sum);
    }
}
// CORRECT OUTPUT:
// 1
// 3
// 6
// 10
// 15
// Final Sum = 15