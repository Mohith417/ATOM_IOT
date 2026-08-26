package Day6;

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.speed = 30;
        c1.brake(0);
        c1.brake();

        ElectricCar e1 = new ElectricCar();
        e1.start();

        Tesla t1 = new Tesla();
        t1.start();
    }
}

class Car {
    String brand;
    String model;
    int speed;
    int MaxSpeed;

    // methods
    public void start() {
        System.out.println("Car Started");
    }

    public void brake() {
        speed = speed - 5;
        System.out.println("Brake applied, car speed is " + speed);
    }

    public void brake(int speed) {
        this.speed = 0;
        System.out.println("Hand brake applied");
    }
}

class ElectricCar extends Car {
    ElectricCar() {
        System.out.println("Electric car started");
    }

    ElectricCar(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Electric car is started");
        super.start();
    }
}

class Tesla extends ElectricCar {
    Tesla() {
        super(); // calls ElectricCar()
    }

    Tesla(String model) {
        super(model); // calls ElectricCar(String model)
    }
}