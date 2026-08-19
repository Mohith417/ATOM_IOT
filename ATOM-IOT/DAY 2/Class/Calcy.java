import java.util.Scanner;

class Calcy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = scn.nextInt();

        System.out.println("Enter the second number:");
        int b = scn.nextInt();

        scn.nextLine(); 
        System.out.println("Enter the Arithmetic Operator:");
        String op = scn.nextLine();

        if(op.equals("+")) {
            System.out.println("The sum of the numbers is: " + (a + b));
        } else if(op.equals("-")) {
            System.out.println("The difference of the numbers is: " + (a - b));
        } else if(op.equals("*")) {
            System.out.println("The product of the numbers is: " + (a * b));
        } else if(op.equals("/")) {
            if(b != 0) {
                System.out.println("The quotient of the numbers is: " + (a / b));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator entered.");
        }}}
