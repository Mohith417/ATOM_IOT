package Day10;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String [] args){
        ArrayList<Car> cars = new ArrayList<Car>();

        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Fortuner";

        Car c2 = new Car();
        c2.brand = "Ford";
        c2.model = "Mustang";

        Car c3 = new Car();
        c3.brand = "VolksWagen";
        c3.model = "Virtus";

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        // ✅ For-each loop to print cars
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

class Car {
    String brand;
    String model;

    @Override
    public String toString() {
        return this.brand + " " + this.model;
    }

    @Override
    public boolean equals(Object o) {
        Car c = (Car) o;
        return this.brand.equals(c.brand) && this.model.equals(c.model);
    }
}
