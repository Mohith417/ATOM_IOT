// Question 1
class Test1 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
    }
}
// Output: 1 3 6 10 15

// Question 2
class Test2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int a = arr[1];
        int b = arr[3];
        System.out.println(a + b);
    }
}
// Output: 60

// Question 3
class Test3 {
    public static void main(String[] args) {
        int n = 32;
        while (n > 1) {
            System.out.print(n + " ");
            n = n / 2;
        }
    }
}
// Output: 32 16 8 4 2

// Question 4
class Test4 {
    public static void main(String[] args) {
        int n = 3;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
// Output: 27

// Question 5
class Test5 {
    public static void main(String[] args) {
        int n = 4;
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value = value * 2;
            for (int j = 1; j <= n; j++) {
                System.out.print(value + " ");
            }
        }
    }
}
// Output: 2 2 2 2 4 4 4 4 8 8 8 8 16 16 16 16

// Question 6
class Test6 {
    public static void main(String[] args) {
        int n = 16;
        int count = 0;
        for (int i = 1; i <= n; i = i * 2) {
            count++;
        }
        System.out.println(count);
    }
}
// Output: 5