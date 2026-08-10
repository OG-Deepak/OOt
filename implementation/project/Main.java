import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //passenger

        System.out.print("passenger id: ");
        int passengerId=sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String passengerName=sc.nextLine();
        System.out.print("Phone: ");
        String phone=sc.nextLine();
        System.out.print("Email: ");
        String email=sc.nextLine();
        Passenger p1=new Passenger(passengerId,passengerName,phone,email);

        //route

        System.out.print("Route id: ");
        int routeId=sc.nextInt();
        sc.nextLine();
        System.out.print("Source: ");
        String source=sc.nextLine();
        System.out.print("Destination: ");
        String destination=sc.nextLine();
        System.out.print("Distance: ");
        double distance=sc.nextDouble();
        sc.nextLine();
        Route r1=new Route(routeId,source,destination,distance);

        //Vehicle

        System.out.print("Vehicle number: ");
        String vehicleNumber=sc.nextLine();
        System.out.print("Brand: ");
        String brand=sc.nextLine();
        System.out.print("Bus name: ");
        String busName=sc.nextLine();
        System.out.print("Bus model: ");
        String busModel=sc.nextLine();
        Vehicle v1=new Bus(vehicleNumber,brand,busName,busModel);
        //driver

        System.out.print("Driver id: ");
        int driverId=sc.nextInt();
        sc.nextLine();
        System.out.print("Driver name: ");
        String driverName=sc.nextLine();
        System.out.print("License: ");
        String license=sc.nextLine();
        System.out.print("Driver phone: ");
        String driverPhone=sc.nextLine();
        Driver d1=new Driver(driverId,driverName,license,driverPhone);

        //trip

        System.out.print("Trip id: ");
        int tripId=sc.nextInt();
        System.out.print("Fare: ");
        double fare=sc.nextDouble();

        Trip t1=new Trip(tripId,fare,r1,v1,d1);

        System.out.print("Booking id: ");
        int bookingId=sc.nextInt();
        System.out.print("Seat number: ");
        int seatNumber=sc.nextInt();

        Booking b1=new Booking(bookingId,p1,t1,seatNumber,"Pending");

        b1.view();
    }
}