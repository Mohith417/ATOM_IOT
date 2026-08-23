public class OutputQuestions {
    public static void main(String[] args) {
        System.out.print("Q1: ");
        int x = 5;
        for (int i = 1; i <= 4; i++) {
            if (x % 2 == 1) x += i;
            else x -= i;
            System.out.print(x + " ");
        }

        // ========================

        System.out.print("\nQ2: ");
        int a = 10;
        for (int i = 1; i <= 5; i++) {
            if (a > 10) a -= i;
            else a += i * 2;
            System.out.print(a + " ");
        }

        // ========================

        System.out.print("\nQ3: ");
        x = 1;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) x *= 2;
            else x += i;
            System.out.print(x + " ");
        }

        // ========================

        System.out.print("\nQ4: ");
        int n = 20;
        while (n > 5) {
            if (n % 3 == 0) n -= 4;
            else n -= 3;
            System.out.print(n + " ");
        }

        // ========================

        System.out.print("\nQ5: ");
        int result = 0;
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0 && i > 2) result += i * 2;
            else if (i % 2 == 1) result += i;
            else result -= i;
            System.out.print(result + " ");
        }
    }
}




//javac OutputQuestions.java && java OutputQuestions