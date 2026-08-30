package Day9;

public class RecursionDemo {
    public static void  main(String [] args){
        System.out.println("Main Method");
        greet();
    }
    public static void greet(){
        return;
        greet();
        //

        System.out.println("Good Morning");
    }
}
