// OutputQuestions.java

// ==================== Question 1 ====================

class A1 {
    static int x = 10;
    int y = 20;

    A1() {
        x++;
        y++;
    }

    void show() {
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        A1 a1 = new A1();
        A1 a2 = new A1();

        a1.show();
        a2.show();
    }
}


// ==================== Question 2 ====================

class Test2 {
    static int x = 10;
    int y = 5;

    void change() {
        try {
            x += 5;
            y += 10;
            int z = 10 / (y - 15);
            System.out.println(z);
        } catch (ArithmeticException e) {
            x--;
            y--;
            System.out.println(x + " " + y);
        }
    }

    public static void main(String[] args) {
        Test2 t1 = new Test2();
        Test2 t2 = new Test2();

        t1.change();
        t2.change();

        System.out.println(Test2.x);
        System.out.println(t1.y + " " + t2.y);
    }
}


// ==================== Question 3 ====================

class Parent3 {
    static int x = 10;

    Parent3() {
        x++;
        System.out.println("Parent " + x);
    }

    void show() {
        System.out.println("Parent Show");
    }
}

class Child3 extends Parent3 {
    static int x = 20;

    Child3() {
        x++;
        System.out.println("Child " + x);
    }

    @Override
    void show() {
        System.out.println("Child Show");
    }

    public static void main(String[] args) {
        Parent3 p = new Child3();

        System.out.println(p.x);
        p.show();
        System.out.println(Child3.x);
    }
}


// ==================== Question 4 ====================

class Demo4 {
    static int x = 10;
    int y = 20;

    Demo4() {
        x++;
        y++;
    }

    void test() {
        try {
            System.out.println(x / (y - 21));
        } catch (ArithmeticException e) {
            System.out.println("Caught");
            x += 10;
        } finally {
            y += 5;
            System.out.println(x + " " + y);
        }
    }

    public static void main(String[] args) {
        Demo4 d1 = new Demo4();
        Demo4 d2 = new Demo4();

        d1.test();
        d2.test();

        System.out.println(Demo4.x);
        System.out.println(d1.y + " " + d2.y);
    }
}


// ==================== Question 5 ====================

class Account5 {
    static int balance = 1000;
    int amount;

    Account5(int amount) {
        this.amount = amount;
    }

    void withdraw() {
        try {
            if (amount > balance) {
                throw new ArithmeticException();
            }

            balance -= amount;
            System.out.println("Success");

        } catch (ArithmeticException e) {
            balance -= 100;
            System.out.println("Failed");

        } finally {
            balance += 50;
        }
    }

    public static void main(String[] args) {
        Account5 a1 = new Account5(600);
        Account5 a2 = new Account5(500);

        a1.withdraw();
        a2.withdraw();

        System.out.println(balance);
    }
}


// ==================== Question 6 ====================

class A6 {
    static int x = 5;

    static void show() {
        try {
            System.out.println(x++);

            int a = 10 / 0;

            System.out.println(x++);

        } catch (ArithmeticException e) {
            System.out.println(x++);

        } finally {
            System.out.println(++x);
        }
    }

    public static void main(String[] args) {
        show();
        System.out.println(x);
    }
}