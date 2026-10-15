public class Bus extends Vehicle {
    private String busModel;
    private String busName;
    public Bus(String vehicleNumber,String brand,String busName ,String busModel)
    {
        super(vehicleNumber,brand);
        this.busName=busName;
        this.busModel=busModel;
    }
    public void view(){
        System.out.println("busName:"+busName);
        System.out.println("model:"+busModel);
        System.out.println("brand:"+getBrand());
        System.out.println("number:"+getVehicleNumber());
    }
    @Override
    public void move(){
        System.out.println("bus is moving");
    }
}
