#include <iostream>
#include "Booking.h"

using namespace std;

Booking::Booking(int bookingId, string bookingDate, string bookedBy,
                 int seatNumber, string bookingStatus)
{
    this->bookingId = bookingId;
    this->bookingDate = bookingDate;
    this->bookedBy = bookedBy;
    this->seatNumber = seatNumber;
    this->bookingStatus = bookingStatus;
}

// Getter methods
int Booking::getBookingId()
{
    return bookingId;
}

string Booking::getBookingDate()
{
    return bookingDate;
}

string Booking::getbookedBy()
{
    return bookedBy;
}

int Booking::getSeatNumber()
{
    return seatNumber;
}

string Booking::getBookingStatus()
{
    return bookingStatus;
}

// Setter method
void Booking::setBookingStatus(string bookingStatus)
{
    this->bookingStatus = bookingStatus;
}

// Displays booking details
void Booking::displayBookingDetails()
{
    cout << "\n----------- Booking Details -----------" << endl;
    cout << "Booking ID : " << getBookingId() << endl;
    cout << "Booking Date : " << getBookingDate() << endl;
    cout << "Booked By : " << getbookedBy() << endl;
    cout << "Seat Number : " << getSeatNumber() << endl;
    cout << "Booking Status : " << getBookingStatus() << endl;
}