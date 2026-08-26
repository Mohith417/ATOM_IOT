package busbooking;

public class Passenger {
    private String name;
    private int age;

    public Passenger(String name, int age) throws InvalidAgeException {
        if (age <= 0) throw new InvalidAgeException("Invalid age");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
