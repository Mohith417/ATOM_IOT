package Day5.ClassTask;

public class CarDemo {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar();
        e1.speed = 30;
        e1.brake(0);   // calls hand brake
        e1.brake();    // calls normal brake
    }
}

class Car {
    String brand;
    String model;
    int speed;
    int maxSpeed;

    public void start() {
        System.out.println("Car started...");
    }
}

class ElectricCar extends Car {
    public void start() {
        System.out.println("Electric car started...");
    }
    public void start(String fuel){
        System.out.println("Car started with diesel...");
    }
    public void brake(){
        speed = speed - 5;
        System.out.println("Brake applied, car speed is " + speed);
    }
    public void brake(int speed){
        this.speed = 0;
        System.out.println("Hand brake applied");
    }
}
