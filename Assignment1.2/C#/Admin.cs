public class Admin
{
    private int adminId;
    private string adminName;
    private string password;

    public Admin(int adminId, string adminName, string password)
    {
        this.adminId = adminId;
        this.adminName = adminName;
        this.password = password;
    }

    public void DisplayAdminDetails()
    {
        Console.WriteLine("\n----------- Admin Details -----------");
        Console.WriteLine($"Admin ID : {adminId}");
        Console.WriteLine($"Admin Name : {adminName}");
    }
}
