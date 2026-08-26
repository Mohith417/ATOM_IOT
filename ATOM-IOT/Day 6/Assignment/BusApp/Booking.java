package busbooking;

public class Booking {
    static int totalBookings = 0;
    static int nextId = 1001;

    private int bookingId;
    private Passenger passenger;
    private Bus bus;
    private int seat;
    private boolean window;

    public Booking(Passenger passenger, Bus bus, int seat, boolean window) {
        bookingId = nextId++;
        totalBookings++;
        this.passenger = passenger;
        this.bus = bus;
        this.seat = seat;
        this.window = window;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Bus getBus() {
        return bus;
    }

    public int getSeat() {
        return seat;
    }

    public void showBooking() {
        System.out.println("Booking ID: " + bookingId +
                " | Name: " + passenger.getName() +
                " | Seat: " + seat +
                " | Window: " + window);
    }
}
