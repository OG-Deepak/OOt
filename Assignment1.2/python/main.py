"""
Author : Jagruti Gadekar
Roll No : 2621
Description : Transportation Management System that stores and displays information
about users, vehicles, drivers, routes, and bookings using OOP concepts such as
classes, objects, encapsulation, inheritance, abstraction, polymorphism,
constructors, and object referencing.
"""

from User import User
from Admin import Admin
from Driver import Driver
from Route import Route
from Booking import Booking
from Bus import Bus


def main():

    # Creating Objects
    user = User(
        1,
        "Jagruti",
        "jagruti@gmail.com",
        "9876543210",
        "12345"
    )

    admin = Admin(
        101,
        "Admin",
        "admin123"
    )

    driver = Driver(
        201,
        "Rahul",
        "9876501234",
        "GA12345678",
        5,
        "Available"
    )

    route = Route(
        301,
        "Panaji",
        "Margao",
        35,
        "45 Minutes"
    )

    booking = Booking(
        401,
        "02-08-2026",
        "Jagruti",
        15,
        "Confirmed"
    )

    # Vehicle reference
    vehicle = Bus(
        501,
        "GA07AB1234",
        50,
        True
    )

    # Display details
    admin.displayAdminDetails()
    user.displayUserDetails()
    driver.displayDriverDetails()
    route.displayRouteDetails()
    vehicle.displayVehicleDetails()
    booking.displayBookingDetails()


if __name__ == "__main__":
    main()