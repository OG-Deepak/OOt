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
        101,
        "Deepak",
        "DK@gmail.com",
        "9999999999",
        "23456"
    )

    admin = Admin(
        201,
        "admin",
        "admin123"
    )

    driver = Driver(
        301,
        "albert",
        "8888888888",
        "GA08l5120",
        5,
        "Available"
    )

    route = Route(
        301,
        "Panaji",
        "Mapusa",
        35,
        "45 Minutes"
    )

    booking = Booking(
        901,
        "04-03-2021",
        "Deepak",
        15,
        "Confirmed"
    )

    # Vehicle reference
    vehicle = Bus(
        601,
        "KL07AB876",
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
