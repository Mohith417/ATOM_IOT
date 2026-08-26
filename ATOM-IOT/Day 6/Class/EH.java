package Day6;

public class EH {
    public static void main(String[] args) {
        System.out.println("Program Starts....");

        String s = null;
        System.out.println(s.length());

        try {

            System.out.println(s.length());
        }

        catch(Exception e){
            System.out.println(e);
            System.out.println("Exception Handled");
        }

        System.out.println("Program Ends...");
    }
}