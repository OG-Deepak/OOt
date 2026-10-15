// Inheritance
// Car inherits VehicleId, VehicleNumber and Capacity from Vehicle.
public class Car : Vehicle
{
    // Car has its own property: automatic
    private bool automatic;

    public Car(int vehicleId, string vehicleNumber, int capacity, bool automatic)
        : base(vehicleId, vehicleNumber, capacity)
    {
        this.automatic = automatic;
    }

    // Method overriding
    public override void DisplayVehicleDetails()
    {
        Console.WriteLine("\n----------- Car Details -----------");
        Console.WriteLine($"Vehicle ID : {VehicleId}");
        Console.WriteLine($"Vehicle Number : {VehicleNumber}");
        Console.WriteLine($"Capacity : {Capacity}");
        Console.WriteLine($"Automatic : {automatic}");
    }
}
