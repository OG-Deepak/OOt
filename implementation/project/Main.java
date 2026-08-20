import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        // passenger
        int passengerId = 101;
        String passengerName = "Deepak";
        String phone = "9876543210";
        String email = "deepak@gmail.com";

        Passenger p1 = new Passenger(
            passengerId, passengerName, phone, email
        );

        // route
        int routeId = 201;
        String source = "Pune";
        String destination = "Goa";
        double distance = 450.5;

        Route r1 = new Route(
            routeId, source, destination, distance
        );

        // Vehicle
        String vehicleNumber = "MH12AB1234";
        String brand = "Volvo";
        String busName = "Volvo Express";
        String busModel = "B9R";

        Vehicle v1 = new Bus(
            vehicleNumber, brand, busName, busModel
        );

        // driver
        int driverId = 301;
        String driverName = "Rahul Sharma";
        String license = "MH123456789";
        String driverPhone = "9123456780";

        Driver d1 = new Driver(
            driverId, driverName, license, driverPhone
        );

        // trip
        int tripId = 401;
        double fare = 850.0;

        Trip t1 = new Trip(
            tripId, fare, r1, v1, d1
        );

        // booking
        int bookingId = 501;
        int seatNumber = 15;

        Booking b1 = new Booking(
            bookingId, p1, t1, seatNumber, "Pending"
        );

        b1.view();
    }
}
