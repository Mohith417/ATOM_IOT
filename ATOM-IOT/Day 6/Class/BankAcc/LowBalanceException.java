package Day6.ExceptionHandling;

public class LowBalanceException extends Exception {
    LowBalanceException(){
        System.out.println("Cannot withdraw while 0 Balance");
    }

}
