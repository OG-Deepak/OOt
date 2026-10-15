// Inheritance
// Taxi inherits VehicleId, VehicleNumber and Capacity from Vehicle.
public class Taxi : Vehicle
{
    // Taxi has its own property: driverName
    private string driverName;

    public Taxi(int vehicleId, string vehicleNumber, int capacity, string driverName)
        : base(vehicleId, vehicleNumber, capacity)
    {
        this.driverName = driverName;
    }

    // Method overriding
    public override void DisplayVehicleDetails()
    {
        Console.WriteLine("\n----------- Taxi Details -----------");
        Console.WriteLine($"Vehicle ID : {VehicleId}");
        Console.WriteLine($"Vehicle Number : {VehicleNumber}");
        Console.WriteLine($"Capacity : {Capacity}");
        Console.WriteLine($"Driver Name : {driverName}");
    }
}
