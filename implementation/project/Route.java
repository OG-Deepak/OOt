public class Route {
    private int routeId;
    private String source;
    private String destination;
    private double distance;

    Route(int routeId,String source,String destination,double distance){
        this.routeId=routeId;
        this.source=source;
        this.destination=destination;
        this.distance=distance;
    }

    public void setRouteId(int routeId){
        this.routeId=routeId;
    }
    public int getRouteId(){
        return routeId;
    }

    public void setSource(String source){
        this.source=source;
    }
    public String getSource(){
        return source;
    }

    public void setDestination(String destination){
        this.destination=destination;
    }
    public String getDestination(){
        return destination;
    }

    public void setDistance(double distance){
        this.distance=distance;
    }
    public double getDistance(){
        return distance;
    }

    public void view(){
        System.out.println("id:"+routeId);
        System.out.println("source:"+source);
        System.out.println("destination:"+destination);
        System.out.println("distance:"+distance+" km");
    }
}