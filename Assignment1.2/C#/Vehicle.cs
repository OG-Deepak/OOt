// Abstract Parent Class
public abstract class Vehicle
{
    public int VehicleId { get; set; }
    public string VehicleNumber { get; set; }
    public int Capacity { get; set; }

    // Constructor
    protected Vehicle(int vehicleId, string vehicleNumber, int capacity)
    {
        VehicleId = vehicleId;
        VehicleNumber = vehicleNumber;
        Capacity = capacity;
    }

    // Abstract method: every child class must override it
    public abstract void DisplayVehicleDetails();
}
