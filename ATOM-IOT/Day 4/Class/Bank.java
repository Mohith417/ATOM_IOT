import java.util.Scanner;

class Bank {
    public static void main(String[] args) {
        String name;
        int age;
        double balance = 5000;

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the name: ");
        name = scn.nextLine();

        System.out.print("Enter the age: ");
        age = scn.nextInt();

        
        balance = deposit(500, balance, age);

        System.out.println("Final Balance: " + balance);
    }

   
    public static double deposit(int amount, double balance, int age) {
        if (amount > 1000) {
            if (age < 18) {
                System.out.println("Not allowed");
                return balance; // No deposit if under 18 and amount > 1000
            }
        }

        balance = balance + amount;
        return balance;
    }
}