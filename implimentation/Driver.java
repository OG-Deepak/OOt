
class Driver {
    int driverId;
    String name;
    String phone;
    String licenseNumber;
    int experience;

    Driver(int driverId, String name, String phone, String licenseNumber, int experience) {
        this.driverId = driverId;
        this.name = name;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
        this.experience = experience;
    }

    void display() {
        System.out.println("\n----- Driver Details -----");
        System.out.println("Driver ID      : " + driverId);
        System.out.println("Name           : " + name);
        System.out.println("Phone          : " + phone);
        System.out.println("License Number : " + licenseNumber);
        System.out.println("Experience     : " + experience + " years");
    }
}