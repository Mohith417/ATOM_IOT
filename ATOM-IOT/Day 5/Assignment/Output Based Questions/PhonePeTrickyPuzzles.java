public class PhonePeTrickyPuzzles {
    public static void main(String[] args) {

        // Q1
        int wallet = 10;
        int count = 0;
        while (wallet++ < 15) {
            count++;
        }
        System.out.println("Output 1: " + wallet + ", " + count);
        // wallet++ means: use first, then increment
        // Loop runs when wallet = 10,11,12,13,14 → 5 times
        // After last check wallet becomes 16
        // Answer: 16, 5


        // Q2
        int balance = 100;
        int score = 50;
        balance += (score > 30) ? (score < 40 ? 10 : 20) : 5;
        System.out.println("Output 2: " + balance);
        // score=50: outer → true, inner: 50 < 40 → false → picks 20
        // balance = 100 + 20 = 120
        // Answer: 120


        // Q3
        int totalBill = 500;
        int people = 4;
        double share = totalBill / people;
        System.out.println("Output 3: " + share);
        // int / int = int first → 500/4 = 125 (not 125.5)
        // then stored as double → 125.0
        // Answer: 125.0


        // Q4
        int attempts = 3;
        int totalLog = 0;
        do {
            totalLog += --attempts;  // pre-decrement: decrements FIRST
        } while (attempts > 0);
        System.out.println("Output 4: " + totalLog);
        // Round 1: --attempts = 2, totalLog = 2
        // Round 2: --attempts = 1, totalLog = 3
        // Round 3: --attempts = 0, totalLog = 3, loop ends
        // Answer: 3


        // Q5
        boolean isAccountActive = false;
        int cashback = 0;
        if (isAccountActive && (++cashback > 0)) {
            System.out.println("Txn Success");
        }
        System.out.println("Output 5: " + cashback);
        // isAccountActive is false → short circuit
        // ++cashback never runs → cashback stays 0
        // Answer: 0
    }
}