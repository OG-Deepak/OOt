public class Booking{
    private int bookingId;
    private Passenger passenger;
    private Trip trip;
    private int seatNumber;
    private String status;

    public Booking(int bookingId,
        Passenger passenger, 
        Trip trip,
        int seatNumber,
        String status)
        {
            this.bookingId=bookingId;
            this.passenger=passenger;
            this.trip=trip;
            this.seatNumber=seatNumber;
            this.status=status;
    }   

    public void setBookingId(int bookingId) {
    this.bookingId = bookingId;
}

public int getBookingId() {
    return bookingId;
}

public void setPassenger(Passenger passenger) {
    this.passenger = passenger;
}

public Passenger getPassenger() {
    return passenger;
}

public void setTrip(Trip trip) {
    this.trip = trip;
}

public Trip getTrip() {
    return trip;
}

public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
}

public int getSeatNumber() {
    return seatNumber;
}

public void setStatus(String status) {
    this.status = status;
}

public String getStatus() {
    return status;
}

public void confirm (){
    status="confirmed";
}

public void cancel (){
    status="cancelled";
}

    public void view(){
        System.out.println("booking Id: "+bookingId);
        System.out.println("seat Number: "+seatNumber);
        System.out.println("Status :"+status);
        passenger.view();
        trip.view();
    }
}
