// Inheritance
// Van inherits VehicleId, VehicleNumber and Capacity from Vehicle.
public class Van : Vehicle
{
    // Van has its own property: loadCapacity
    private int loadCapacity;

    public Van(int vehicleId, string vehicleNumber, int capacity, int loadCapacity)
        : base(vehicleId, vehicleNumber, capacity)
    {
        this.loadCapacity = loadCapacity;
    }

    // Method overriding
    public override void DisplayVehicleDetails()
    {
        Console.WriteLine("\n----------- Van Details -----------");
        Console.WriteLine($"Vehicle ID : {VehicleId}");
        Console.WriteLine($"Vehicle Number : {VehicleNumber}");
        Console.WriteLine($"Capacity : {Capacity}");
        Console.WriteLine($"Load Capacity : {loadCapacity} kg");
    }
}
