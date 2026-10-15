public class Driver
{
    private int driverId;
    private string driverName;
    private string phoneNumber;
    private string licenseNumber;
    private int experience;
    private string availabilityStatus;

    public Driver(
        int driverId,
        string driverName,
        string phoneNumber,
        string licenseNumber,
        int experience,
        string availabilityStatus)
    {
        this.driverId = driverId;
        this.driverName = driverName;
        this.phoneNumber = phoneNumber;
        this.licenseNumber = licenseNumber;
        this.experience = experience;
        this.availabilityStatus = availabilityStatus;
    }

    public void DisplayDriverDetails()
    {
        Console.WriteLine("\n----------- Driver Details -----------");
        Console.WriteLine($"Driver ID : {driverId}");
        Console.WriteLine($"Driver Name : {driverName}");
        Console.WriteLine($"Phone Number : {phoneNumber}");
        Console.WriteLine($"License Number : {licenseNumber}");
        Console.WriteLine($"Experience : {experience} Years");
        Console.WriteLine($"Availability : {availabilityStatus}");
    }
}
