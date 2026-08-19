import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number:");
        int a = scn.nextInt();

        if(a >= 50 & a<=100) {
            System.out.println("Grater than 50");
        } else if(a >= 100 & a<=500) {
            System.out.println("Grater than 100");
        } else if(a > 500) {
            System.out.println("grater than 500");
        }}
}