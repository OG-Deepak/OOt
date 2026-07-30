import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner object
        Scanner myObj = new Scanner(System.in);
        //Customer details
        System.out.println("Enter ur ID");
        int userID = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Enter ur name");
        String userName = myObj.nextLine();

        System.out.println("Enter ur phone");
        int userPHONE = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Enter ur Email");
        String userEmail = myObj.nextLine();
        Customer obj1 = new Customer();
        obj1.register(userID,userName,userPHONE,userEmail);
         Vehicle vehicle = new Vehicle(101, "GA07AB1234", "Bus", 50, "Available");

        Driver driver = new Driver(201, "Ramesh", "9876543210", "DL123456", 8);

        Route route = new Route(301, "Goa", "Pune", 450);

        Customer customer;
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

        obj1.view();
    }
}