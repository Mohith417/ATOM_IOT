package busbooking;

public class ACBus extends Bus {
    public ACBus(String busNumber, String route, int totalSeats, double baseFare)
            throws InvalidFareException {
        super(busNumber, route, totalSeats, baseFare);
    }

    public double calculateFare() {
        return baseFare + 100;
    }

    public void showBusDetails() {
        System.out.println("AC Bus: " + busNumber + " | Route: " + route +
                " | Fare: " + calculateFare());
    }
}
