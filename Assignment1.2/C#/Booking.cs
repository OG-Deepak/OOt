// Encapsulation
public class Booking
{
    private int bookingId;
    private string bookingDate;
    private string bookedBy;
    private int seatNumber;
    private string bookingStatus;

    // Constructor
    public Booking(int bookingId, string bookingDate, string bookedBy, int seatNumber, string bookingStatus)
    {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookedBy = bookedBy;
        this.seatNumber = seatNumber;
        this.bookingStatus = bookingStatus;
    }

    // Getter methods
    public int GetBookingId() => bookingId;
    public string GetBookingDate() => bookingDate;
    public string GetBookedBy() => bookedBy;
    public int GetSeatNumber() => seatNumber;
    public string GetBookingStatus() => bookingStatus;

    // Setter method
    public void SetBookingStatus(string bookingStatus)
    {
        this.bookingStatus = bookingStatus;
    }

    // Displays booking details
    public void DisplayBookingDetails()
    {
        Console.WriteLine("\n----------- Booking Details -----------");
        Console.WriteLine($"Booking ID : {GetBookingId()}");
        Console.WriteLine($"Booking Date : {GetBookingDate()}");
        Console.WriteLine($"Booked By : {GetBookedBy()}");
        Console.WriteLine($"Seat Number : {GetSeatNumber()}");
        Console.WriteLine($"Booking Status : {GetBookingStatus()}");
    }
}
