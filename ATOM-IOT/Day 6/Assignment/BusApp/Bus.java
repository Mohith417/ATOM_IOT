package busbooking;

public abstract class Bus {
    protected String busNumber, route;
    protected int totalSeats;
    protected double baseFare;
    protected boolean[] seats;

    public Bus(String busNumber, String route, int totalSeats, double baseFare)
            throws InvalidFareException {
        if (baseFare <= 0) throw new InvalidFareException("Invalid fare");
        this.busNumber = busNumber;
        this.route = route;
        this.totalSeats = totalSeats;
        this.baseFare = baseFare;
        seats = new boolean[totalSeats + 1];
    }

    public abstract double calculateFare();
    public abstract void showBusDetails();

    public void bookSeat(int seat)
            throws InvalidSeatException, SeatAlreadyBookedException {
        if (seat < 1 || seat > totalSeats)
            throw new InvalidSeatException("Invalid seat number");
        if (seats[seat])
            throw new SeatAlreadyBookedException("Seat already booked");
        seats[seat] = true;
    }

    public void cancelSeat(int seat) throws InvalidSeatException {
        if (seat < 1 || seat > totalSeats)
            throw new InvalidSeatException("Invalid seat number");
        seats[seat] = false;
    }
}
