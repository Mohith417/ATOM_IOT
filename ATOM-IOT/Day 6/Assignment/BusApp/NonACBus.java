package busbooking;

public class NonACBus extends Bus {
    public NonACBus(String busNumber, String route, int totalSeats, double baseFare)
            throws InvalidFareException {
        super(busNumber, route, totalSeats, baseFare);
    }

    public double calculateFare() {
        return baseFare;
    }

    public void showBusDetails() {
        System.out.println("Non-AC Bus: " + busNumber + " | Route: " + route +
                " | Fare: " + calculateFare());
    }
}
