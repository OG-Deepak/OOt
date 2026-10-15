/*
Author : Deepak Devan
Roll No : 2616
Description : Transportation Management System that stores and displays information
about users, vehicles, drivers, routes, and bookings using OOP concepts such as
classes, objects, encapsulation, inheritance, abstraction, polymorphism,
constructors, and object referencing.
*/

#include "User.h"
#include "Admin.h"
#include "Driver.h"
#include "Route.h"
#include "Booking.h"
#include "Vehicle.h"
#include "Bus.h"

using namespace std;

int main()
{
    // Creating Objects
    User user(1, "Deepak", "Deepak123@gmail.com", "9876543210", "12345");

    Admin admin(101, "Admin", "admin123");

    Driver driver(
        201,
        "Rahul",
        "9876501234",
        "GA12345678",
        5,
        "Available"
    );

    Route route(
        301,
        "Panaji",
        "Margao",
        35,
        "45 Minutes"
    );

    Booking booking(
        401,
        "02-08-2026",
        "Deepak",
        15,
        "Confirmed"
    );

    // Polymorphism
    Vehicle* vehicle;
    vehicle = new Bus(501, "GA07AB2345", 50, true);

    // Display details
    admin.displayAdminDetails();
    user.displayUserDetails();
    driver.displayDriverDetails();
    route.displayRouteDetails();
    vehicle->displayVehicleDetails();
    booking.displayBookingDetails();

    delete vehicle;

    return 0;
}
