import java.util.Scanner;

class Car {
    String brand;
    String model;
    int speed;
    int maxSpeed = 50;

    public void start() {
        System.out.println("Car Started");
    }

    public void accelerate() {
        speed = speed + 5;
        System.out.println("accelerated , car travelling at " + speed + " kms");
    }

    public void brake() {
        speed = speed - 5;
        System.out.println("Speed decreased , car travelling at " + speed + " kms");
    }
}

class NewCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Mercedes";
        System.out.println(c1.brand);
	c1.model = "GLS";
	System.out.println(c1.model);
        c1.start();
	c1.accelerate();
	c1.brake();
	c1.accelerate();
	c1.accelerate();
	c1.accelerate();
	c1.accelerate();
	c1.accelerate();
	c1.brake();
	c1.brake();


    }
}
