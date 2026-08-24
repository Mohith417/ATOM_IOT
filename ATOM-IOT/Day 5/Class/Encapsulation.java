package Day5.ClassTask;

public class Encapsulation {
    public static void main (String[] args) {
        Ban10kAccount b1 = new BankAccount() ;
        System.out.print(b1.balance) ;
        b1.accName = "anu" ;
        b1.balance = 3000000 ;
        System.out.print(b1.accName) ;
        b1.deposit(2000) ;
        b1.setBal(5000);

        System.out.print(b1.balance);

    }

}
class BankAccount {
    String accName;
    int accId;
    public int balance;

    public int getBal() {
        return this.balance;
    }
    public void setBal(int amt){
        this.balance =amt;
    }

    public void deposit(int amt) {
        balance = balance + amt;
        System.out.print("Amount deposited " + amt );
    }

    public void withdraw(int amt) {
        balance = balance - amt;
        System.out.print("amount withdrawn" + amt );
    }

}