#ifndef BOOKING_H
#define BOOKING_H

#include <string>
using namespace std;

// Encapsulation
class Booking
{
private:
    int bookingId;
    string bookingDate;
    string bookedBy;
    int seatNumber;
    string bookingStatus;

public:
    Booking(int bookingId, string bookingDate, string bookedBy,
            int seatNumber, string bookingStatus);

    // Getter methods
    int getBookingId();
    string getBookingDate();
    string getbookedBy();
    int getSeatNumber();
    string getBookingStatus();

    // Setter method
    void setBookingStatus(string bookingStatus);

    // Displays booking details
    void displayBookingDetails();
};

#endif