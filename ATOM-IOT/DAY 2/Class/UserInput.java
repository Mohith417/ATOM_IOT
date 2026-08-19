import java.util.Scanner;
class UserInput {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your Rollno:");
        String rollno = scn.nextLine();

        System.out.print("Enter your Name:");
        String name = scn.nextLine();

        System.out.print("Enter your age:");
        int age = scn.nextInt();
        scn.nextLine();   

        System.out.print("Enter your Department:");
        String Department = scn.nextLine();

        //System.out.print("Enter your Aadhar Number:");
        //long aadhar = scn.nextLong();    
        //scn.nextLine();
 
        //System.out.print("Enter your DOB:");
        //String dob = scn.nextLine();  
   
        System.out.print("My name is " + name + " and age is " + age + " and my roll number is " + rollno + " and my department is " + Department);
    }
}