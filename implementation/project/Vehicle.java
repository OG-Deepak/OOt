public abstract class Vehicle {
    private String vehicleNumber;
    private String brand;
    public Vehicle(String vehicleNumber,String brand){
        this.vehicleNumber=vehicleNumber;
        this.brand=brand;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public void setBrand(String brand){
        this.brand=brand;       
    }
    public String getBrand(){
        return brand;
    }
    public abstract void view();
    public abstract void move();
}
