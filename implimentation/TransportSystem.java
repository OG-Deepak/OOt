import java.util.Scanner;

class Customer {
    int customerId;
    String name;
    String phone;
    String email;
    String address;

    Customer(int customerId, String name, String phone, String email, String address) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    void display() {
        System.out.println("\n----- Customer Details -----");
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + name);
        System.out.println("Phone       : " + phone);
        System.out.println("Email       : " + email);
        System.out.println("Address     : " + address);
    }
}

class Vehicle {
    int vehicleId;
    String vehicleNumber;
    String vehicleType;
    int capacity;
    String status;

    Vehicle(int vehicleId, String vehicleNumber, String vehicleType, int capacity, String status) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.status = status;
    }

    void display() {
        System.out.println("\n----- Vehicle Details -----");
        System.out.println("Vehicle ID     : " + vehicleId);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Capacity       : " + capacity);
        System.out.println("Status         : " + status);
    }
}

class Driver {
    int driverId;
    String name;
    String phone;
    String licenseNumber;
    int experience;

    Driver(int driverId, String name, String phone, String licenseNumber, int experience) {
        this.driverId = driverId;
        this.name = name;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
        this.experience = experience;
    }

    void display() {
        System.out.println("\n----- Driver Details -----");
        System.out.println("Driver ID      : " + driverId);
        System.out.println("Name           : " + name);
        System.out.println("Phone          : " + phone);
        System.out.println("License Number : " + licenseNumber);
        System.out.println("Experience     : " + experience + " years");
    }
}

class Route {
    int routeId;
    String source;
    String destination;
    double distance;

    Route(int routeId, String source, String destination, double distance) {
        this.routeId = routeId;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    void display() {
        System.out.println("\n----- Route Details -----");
        System.out.println("Route ID    : " + routeId);
        System.out.println("Source      : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Distance    : " + distance + " km");
    }
}

class Booking {
    int bookingId;
    String bookingDate;
    String travelDate;
    int seatsBooked;

    Customer customer;
    Vehicle vehicle;
    Route route;

    Booking(int bookingId, String bookingDate, String travelDate, int seatsBooked,
            Customer customer, Vehicle vehicle, Route route) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.travelDate = travelDate;
        this.seatsBooked = seatsBooked;
        this.customer = customer;
        this.vehicle = vehicle;
        this.route = route;
    }

    void display() {
        System.out.println("\n===== Booking Details =====");
        System.out.println("Booking ID   : " + bookingId);
        System.out.println("Booking Date : " + bookingDate);
        System.out.println("Travel Date  : " + travelDate);
        System.out.println("Seats Booked : " + seatsBooked);

        customer.display();
        vehicle.display();
        route.display();
    }
}

class Payment {
    int paymentId;
    double amount;
    String method;
    String status;

    Booking booking;

    Payment(int paymentId, double amount, String method, String status, Booking booking) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.method = method;
        this.status = status;
        this.booking = booking;
    }

    void display() {
        System.out.println("\n===== Payment Details =====");
        System.out.println("Payment ID : " + paymentId);
        System.out.println("Amount     : ₹" + amount);
        System.out.println("Method     : " + method);
        System.out.println("Status     : " + status);
    }
}

public class TransportSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Details");

        System.out.print("Customer ID: ");
        int cid = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String cname = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        Customer customer = new Customer(cid, cname, phone, email, address);

        Vehicle vehicle = new Vehicle(101, "GA07AB1234", "Bus", 50, "Available");

        Driver driver = new Driver(201, "Ramesh", "9876543210", "DL123456", 8);

        Route route = new Route(301, "Goa", "Pune", 450);

        Booking booking = new Booking(
                401,
                "28-07-2026",
                "30-07-2026",
                2,
                customer,
                vehicle,
                route);

        Payment payment = new Payment(
                501,
                1200,
                "UPI",
                "Paid",
                booking);

        System.out.println("\n===============================");
        System.out.println("TRANSPORT MANAGEMENT SYSTEM");
        System.out.println("===============================");

        booking.display();
        driver.display();
        payment.display();

        sc.close();
    }
}