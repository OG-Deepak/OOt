# Encapsulation

class Booking:

    # Constructor
    def __init__(self, bookingId, bookingDate, bookedBy, seatNumber, bookingStatus):
        self.__bookingId = bookingId
        self.__bookingDate = bookingDate
        self.__bookedBy = bookedBy
        self.__seatNumber = seatNumber
        self.__bookingStatus = bookingStatus

    # Getter methods
    def getBookingId(self):
        return self.__bookingId

    def getBookingDate(self):
        return self.__bookingDate

    def getbookedBy(self):
        return self.__bookedBy

    def getSeatNumber(self):
        return self.__seatNumber

    def getBookingStatus(self):
        return self.__bookingStatus

    # Setter method
    def setBookingStatus(self, bookingStatus):
        self.__bookingStatus = bookingStatus

    # Displays booking details
    def displayBookingDetails(self):
        print("\n----------- Booking Details -----------")
        print("Booking ID :", self.getBookingId())
        print("Booking Date :", self.getBookingDate())
        print("Booked By :", self.getbookedBy())
        print("Seat Number :", self.getSeatNumber())
        print("Booking Status :", self.getBookingStatus())