package Day6.ExceptionHandling;

public class BankAcc {
    String accName;
    double balance;
    int accId;
    static String bankName;
    //withdraw
    public void withdraw(double amt) throws LowBalanceException, InvalidAmountException {
        if(amt<=0){
            throw new InvalidAmountException();
        }
        else if (balance <= 0){
            throw new LowBalanceException();
        }
        else{
            balance = balance - amt;
            System.out.println("Amount withdrawn: " + amt);
        }}
    public void deposit(double amt) throws LimitExceedException, InvalidAmountException{
        if (amt > 10000){
            throw new LimitExceedException();}
        else if (amt < 0){
            throw new InvalidAmountException();
        }
        else{
        balance = balance + amt;
        System.out.println("Deposited ₹" + amt + " | Bank Balance: ₹" + balance);
    }}
    }
    class BankDemo{
        public static void main(String [] args) {
            BankAcc b1 = new BankAcc();
            try{
                b1.deposit(1);
                b1.withdraw(10);

            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("Not Depositable!");

            }
            System.out.println(b1.balance);


        }
    }