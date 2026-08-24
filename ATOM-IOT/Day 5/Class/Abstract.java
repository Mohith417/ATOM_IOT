package Day5.ClassTask;

public class Abstract {
    public static void main (String [] a) {
        Iphone i1 = new Iphone();
        i1.call();
    }



}

abstract class Phone {

    public void call() {
        System.out.print("Calling from phone");
    }

    abstract void message();
}

class Iphone extends Phone {
    public void call() {
        System.out.print("Calling from iPhone");
    }
    public void message(){
        System.out.print("Messaging from iPhone");
    }


    public void takephoto() {
        System.out.print(" Photo captured by IPhone");
    }






}