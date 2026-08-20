class Oddeven {
    public static void main(String[] args) {
        value(5); 
    }

    public static void value(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}