public class Main{
    public static void main(String[]args){

        int passengerId=101;
        String passengerName="Rahul";
        String phone="9876543210";
        String email="rahul@gmail.com";

        Passenger p1=new Passenger(passengerId,passengerName,phone,email);

        int routeId=201;
        String source="Panjim";
        String destination="Margao";
        double distance=35.5;

        Route r1=new Route(routeId,source,destination,distance);

        String vehicleNumber="GA01AB1234";
        String brand="Tata";
        String busName="Express";
        String busModel="Starbus";

        Vehicle v1=new Bus(vehicleNumber,brand,busName,busModel);

        int driverId=301;
        String driverName="Amit";
        String license="DL123456";
        String driverPhone="9123456780";

        Driver d1=new Driver(driverId,driverName,license,driverPhone);

        int tripId=401;
        double fare=250.0;

        Trip t1=new Trip(tripId,fare,r1,v1,d1);

        int bookingId=501;
        int seatNumber=12;

        Booking b1=new Booking(bookingId,p1,t1,seatNumber,"Pending");

        b1.view();
    }
}
