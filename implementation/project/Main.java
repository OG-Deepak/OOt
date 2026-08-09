public class Main{
    public static void main (String[]args){
        Route r1 = new Route(1,"Panjim","Mapusa",2.5);
        Vehicle v1 = new Bus ("12","BMW","BMW M1","veryfast-model");
        Driver d1 = new Driver(007,"James Bond","007","007");
        Trip t1 = new Trip(12,7.5,r1,v1,d1);
        Passenger p1 = new Passenger(100,"Albert","1245789","albert@gmail.com");
        Booking b1 = new Booking (107,p1,t1,2323,"Pending");
        b1.confirm();
        b1.view();
    }
}