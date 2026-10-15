/*
 * Author : Deepak Devan
 * Roll No : 2616
 * Description : Transportation Management System that stores and displays information
 * about users, vehicles, drivers, routes, and bookings using OOP concepts such as
 * classes, objects, encapsulation, inheritance, abstraction, polymorphism,
 * constructors, and object referencing.
 */

class Program
{
    static void Main()
    {
        // Creating Objects
        User user = new User(101, "Deepak", "DK@gmail.com", "9999999999", "23456");

        Admin admin = new Admin(201, "admin", "admin123");

        Driver driver = new Driver(301, "albert", "8888888888", "GA08l5120", 5, "Available");

        Route route = new Route(301, "Panaji", "Mapusa", 35, "45 Minutes");

        Booking booking = new Booking(901, "04-03-2021", "Deepak", 15, "Confirmed");

        // Vehicle reference (polymorphism: parent reference, child object)
        Vehicle vehicle = new Bus(601, "KL07AB876", 50, true);

        // Display details
        admin.DisplayAdminDetails();
        user.DisplayUserDetails();
        driver.DisplayDriverDetails();
        route.DisplayRouteDetails();
        vehicle.DisplayVehicleDetails();
        booking.DisplayBookingDetails();
    }
}
