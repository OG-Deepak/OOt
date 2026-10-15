public class Route
{
    private int routeId;
    private string source;
    private string destination;
    private int distance;
    private string estimatedTime;

    public Route(int routeId, string source, string destination, int distance, string estimatedTime)
    {
        this.routeId = routeId;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.estimatedTime = estimatedTime;
    }

    // Displays route ID, source, destination, distance and estimated time
    public void DisplayRouteDetails()
    {
        Console.WriteLine("\n----------- Route Details -----------");
        Console.WriteLine($"Route ID : {routeId}");
        Console.WriteLine($"Source : {source}");
        Console.WriteLine($"Destination : {destination}");
        Console.WriteLine($"Distance : {distance} km");
        Console.WriteLine($"Estimated Time : {estimatedTime}");
    }
}
