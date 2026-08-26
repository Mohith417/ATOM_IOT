package busbooking;

public class Main {
    static Booking[] bookings = new Booking[10];
    static int count = 0;

    public static Booking bookTicket(Bus bus, String name, int age, int seat)
            throws Exception {
        Passenger p = new Passenger(name, age);
        bus.bookSeat(seat);
        Booking b = new Booking(p, bus, seat, false);
        bookings[count++] = b;
        return b;
    }

    public static Booking bookTicket(Bus bus, String name, int age,
                                     int seat, boolean window)
            throws Exception {
        Passenger p = new Passenger(name, age);
        bus.bookSeat(seat);
        Booking b = new Booking(p, bus, seat, window);
        bookings[count++] = b;
        return b;
    }

    public static void cancelTicket(int id)
            throws BookingNotFoundException {
        for (int i = 0; i < count; i++) {
            if (bookings[i] != null &&
                    bookings[i].getBookingId() == id) {
                try {
                    bookings[i].getBus().cancelSeat(bookings[i].getSeat());
                } catch (InvalidSeatException e) {
                    System.out.println(e.getMessage());
                }
                Booking.totalBookings--;
                bookings[i] = null;
                System.out.println("Booking cancelled");
                return;
            }
        }
        throw new BookingNotFoundException("Booking not found");
    }

    public static void main(String[] args) {
        try {
            Bus ac = new ACBus("AC101", "Bangalore-Hyderabad", 5, 500);
            Bus nonAc = new NonACBus("NA201", "Bangalore-Chennai", 5, 400);

            ac.showBusDetails();
            nonAc.showBusDetails();

            Booking b1 = bookTicket(ac, "Mohith", 19, 1, true);
            b1.showBooking();

            Booking b2 = bookTicket(nonAc, "Rahul", 20, 2);
            b2.showBooking();

            System.out.println("Total bookings: " + Booking.totalBookings);

            cancelTicket(b1.getBookingId());

            System.out.println("Total bookings: " + Booking.totalBookings);

            try {
                bookTicket(ac, "Amit", 20, 10);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                bookTicket(nonAc, "Kiran", 21, 2);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                bookTicket(ac, "Ravi", 0, 3);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                cancelTicket(9999);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                new ACBus("AC999", "Test", 5, -100);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
