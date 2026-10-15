// Inheritance
// MiniBus inherits VehicleId, VehicleNumber and Capacity from Vehicle.
public class MiniBus : Vehicle
{
    // MiniBus has its own property: AC
    private bool ac;

    public MiniBus(int vehicleId, string vehicleNumber, int capacity, bool ac)
        : base(vehicleId, vehicleNumber, capacity)
    {
        this.ac = ac;
    }

    // Method overriding
    public override void DisplayVehicleDetails()
    {
        Console.WriteLine("\n----------- MiniBus Details -----------");
        Console.WriteLine($"Vehicle ID : {VehicleId}");
        Console.WriteLine($"Vehicle Number : {VehicleNumber}");
        Console.WriteLine($"Capacity : {Capacity}");
        Console.WriteLine($"AC Available : {ac}");
    }
}
