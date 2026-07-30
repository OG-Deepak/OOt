class Booking {
    int bookingId;
    String bookingDate;
    String travelDate;
    int seatsBooked;

    Customer customer;
    Vehicle vehicle;
    Route route;

    Booking(int bookingId, String bookingDate, String travelDate, int seatsBooked,
            Customer customer, Vehicle vehicle, Route route) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.travelDate = travelDate;
        this.seatsBooked = seatsBooked;
        this.customer = customer;
        this.vehicle = vehicle;
        this.route = route;
    }

    void display() {
        System.out.println("\n===== Booking Details =====");
        System.out.println("Booking ID   : " + bookingId);
        System.out.println("Booking Date : " + bookingDate);
        System.out.println("Travel Date  : " + travelDate);
        System.out.println("Seats Booked : " + seatsBooked);

        customer.display();
        vehicle.display();
        route.display();
    }
}