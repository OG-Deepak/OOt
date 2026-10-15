// Inheritance
// Bus inherits VehicleId, VehicleNumber and Capacity from Vehicle.
public class Bus : Vehicle
{
    // Bus has its own property: charging port
    private bool chargingPort;

    public Bus(int vehicleId, string vehicleNumber, int capacity, bool chargingPort)
        : base(vehicleId, vehicleNumber, capacity)
    {
        this.chargingPort = chargingPort;
    }

    // Method overriding
    public override void DisplayVehicleDetails()
    {
        Console.WriteLine("\n----------- Bus Details -----------");
        Console.WriteLine($"Vehicle ID : {VehicleId}");
        Console.WriteLine($"Vehicle Number : {VehicleNumber}");
        Console.WriteLine($"Capacity : {Capacity}");
        Console.WriteLine($"Charging Port : {chargingPort}");
    }
}
