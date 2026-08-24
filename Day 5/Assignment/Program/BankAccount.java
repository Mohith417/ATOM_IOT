// ========== BankAccount.java ==========

public class BankAccount {
    private String accountNumber;
    private String bankName;
    private double balance;

    public BankAccount(String accountNumber, String bankName, double balance) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getBankName()      { return bankName; }
    public double getBalance()       { return balance; }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " | Bank Balance: ₹" + balance);
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient bank balance! Available: ₹" + balance);
            return false;
        }
        balance -= amount;
        System.out.println("Withdrawn ₹" + amount + " | Bank Balance: ₹" + balance);
        return true;
    }
}


// ========== PhonePeUser.java ==========

public class PhonePeUser {
    private String name;
    private String phoneNumber;
    private String upiId;
    private double walletBalance;
    private BankAccount bankAccount;

    public PhonePeUser(String name, String phoneNumber, String upiId, BankAccount bankAccount) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.upiId = upiId;
        this.walletBalance = 0;
        this.bankAccount = bankAccount;
    }

    public String getName()             { return name; }
    public double getWalletBalance()    { return walletBalance; }
    public BankAccount getBankAccount() { return bankAccount; }
    public void setWalletBalance(double amount) { this.walletBalance = amount; }

    public void addMoneyToWallet(double amount) {
        System.out.println("\n" + name + " adding ₹" + amount + " to wallet...");
        if (bankAccount.withdraw(amount)) {
            walletBalance += amount;
            System.out.println("Wallet Balance: ₹" + walletBalance);
        }
    }

    public void sendMoney(PhonePeUser receiver, double amount) {
        System.out.println("\n" + name + " sending ₹" + amount + " to " + receiver.getName() + "...");
        if (walletBalance < amount) {
            System.out.println("Insufficient wallet balance! Available: ₹" + walletBalance);
            return;
        }
        walletBalance -= amount;
        receiver.setWalletBalance(receiver.getWalletBalance() + amount);
        System.out.println("Transfer done! " + name + " wallet: ₹" + walletBalance
                + " | " + receiver.getName() + " wallet: ₹" + receiver.getWalletBalance());
    }

    public void checkBalance() {
        System.out.println("\n--- " + name + "'s Balance ---");
        System.out.println("Wallet : ₹" + walletBalance);
        System.out.println("Bank   : ₹" + bankAccount.getBalance() + " (" + bankAccount.getBankName() + ")");
    }
}


// ========== Main.java ==========

public class Main {
    public static void main(String[] args) {

        // Create bank accounts
        BankAccount bankA = new BankAccount("ACC001", "HDFC Bank", 5000);
        BankAccount bankB = new BankAccount("ACC002", "SBI Bank", 3000);

        // Create users and link bank accounts
        PhonePeUser userA = new PhonePeUser("Arjun", "9876543210", "arjun@okhdfc", bankA);
        PhonePeUser userB = new PhonePeUser("Bhavna", "9123456780", "bhavna@oksbi", bankB);

        System.out.println("======= PhonePe Simulation =======");

        // Add ₹500 to User A's wallet
        userA.addMoneyToWallet(500);

        // Transfer ₹200 from User A to User B
        userA.sendMoney(userB, 200);

        // Print final balances
        userA.checkBalance();
        userB.checkBalance();

        System.out.println("\n==================================");
    }
}