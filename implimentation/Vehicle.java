class Vehicle {
    int vehicleId;
    String vehicleNumber;
    String vehicleType;
    int capacity;
    String status;

    Vehicle(int vehicleId, String vehicleNumber, String vehicleType, int capacity, String status) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.status = status;
    }

    void display() {
        System.out.println("\n----- Vehicle Details -----");
        System.out.println("Vehicle ID     : " + vehicleId);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Capacity       : " + capacity);
        System.out.println("Status         : " + status);
    }
}