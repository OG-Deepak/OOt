public class Trip {
    private int tripId;
    private double fare;
    private Route route ;
    private Vehicle vehicle;
    private Driver driver;

    public Trip(int tripId,double fare,Route route,Vehicle vehicle,Driver driver){
        this.tripId=tripId;
        this.fare=fare;
        this.route=route;
        this.vehicle=vehicle;
        this.driver=driver;
    }
    public void setTripId(int tripId){
        this.tripId=tripId;
    }
    public int getTripId(){
        return tripId;
    }
    public void setFare(double fare){
        this.fare=fare;
    }
    public double getFare(){
        return fare;
    }

    public void view(){
        System.out.println("Trip-ID: "+tripId);
        System.out.println("fare: "+fare);
        route.view();
        driver.view();
        vehicle.view();

    }
}
