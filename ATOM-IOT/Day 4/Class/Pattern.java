import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        System.out.print("Enter the Number: ");
        int num = scn.nextInt();

        for (int i = 0; i < num - 1; i++) {      
            for (int j = 0; j < num; j++) {      
                System.out.print(" " +"*" + " ");
            }
            System.out.println();               
        }

        scn.close();
    }
}
