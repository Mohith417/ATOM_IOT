import java.util.Scanner;

class CheesePizza {
    String name = "Cheese Pizza";
    int id = 101;
    double price = 299;
    int quantity;

    void displayBill() {
        double total = price * quantity;
        double discount = total * 0.10;
        System.out.println("Item     : " + name);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : " + total);
        System.out.println("Discount : " + discount);
        System.out.println("Final    : " + (total - discount));
    }
}

class PepperoniPizza {
    String name = "Pepperoni Pizza";
    int id = 102;
    double price = 349;
    int quantity;

    void displayBill() {
        double total = price * quantity;
        double discount = total * 0.10;
        System.out.println("Item     : " + name);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : " + total);
        System.out.println("Discount : " + discount);
        System.out.println("Final    : " + (total - discount));
    }
}

class VegBurger {
    String name = "Veg Burger";
    int id = 201;
    double price = 149;
    int quantity;

    void displayBill() {
        double total = price * quantity;
        double discount = total * 0.10;
        System.out.println("Item     : " + name);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : " + total);
        System.out.println("Discount : " + discount);
        System.out.println("Final    : " + (total - discount));
    }
}

class ChickenBurger {
    String name = "Chicken Burger";
    int id = 202;
    double price = 199;
    int quantity;

    void displayBill() {
        double total = price * quantity;
        double discount = total * 0.10;
        System.out.println("Item     : " + name);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : " + total);
        System.out.println("Discount : " + discount);
        System.out.println("Final    : " + (total - discount));
    }
}

class ChickenBiryani {
    String name = "Chicken Biryani";
    int id = 301;
    double price = 249;
    int quantity;

    void displayBill() {
        double total = price * quantity;
        double discount = total * 0.10;
        System.out.println("Item     : " + name);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : " + total);
        System.out.println("Discount : " + discount);
        System.out.println("Final    : " + (total - discount));
    }
}

class VegBiryani {
    String name = "Veg Biryani";
    int id = 302;
    double price = 179;
    int quantity;

    void displayBill() {
        double total = price * quantity;
        double discount = total * 0.10;
        System.out.println("Item     : " + name);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : " + total);
        System.out.println("Discount : " + discount);
        System.out.println("Final    : " + (total - discount));
    }
}

public class FoodOrdering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== FOOD MENU =====");
        System.out.println("1. Cheese Pizza    - 299");
        System.out.println("2. Pepperoni Pizza - 349");
        System.out.println("3. Veg Burger      - 149");
        System.out.println("4. Chicken Burger  - 199");
        System.out.println("5. Chicken Biryani - 249");
        System.out.println("6. Veg Biryani     - 179");
        System.out.print("Choose: ");
        int choice = sc.nextInt();
        System.out.print("Quantity: ");
        int qty = sc.nextInt();

        switch (choice) {
            case 1:
                CheesePizza cp = new CheesePizza();
                cp.quantity = qty;
                cp.displayBill();
                break;
            case 2:
                PepperoniPizza pp = new PepperoniPizza();
                pp.quantity = qty;
                pp.displayBill();
                break;
            case 3:
                VegBurger vb = new VegBurger();
                vb.quantity = qty;
                vb.displayBill();
                break;
            case 4:
                ChickenBurger cb = new ChickenBurger();
                cb.quantity = qty;
                cb.displayBill();
                break;
            case 5:
                ChickenBiryani cbr = new ChickenBiryani();
                cbr.quantity = qty;
                cbr.displayBill();
                break;
            case 6:
                VegBiryani vbr = new VegBiryani();
                vbr.quantity = qty;
                vbr.displayBill();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}