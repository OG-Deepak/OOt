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