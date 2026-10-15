public class Driver {
    private int driverId;
    private String name;
    private String licenseNumber;
    private String phone;

    Driver(int driverId,String name,String licenseNumber,String phone){
        this.driverId=driverId;
        this.name=name;
        this.licenseNumber=licenseNumber;
        this.phone=phone;
    }

    public void setDriverId(int driverId){
        this.driverId=driverId;
    }
    public int getDriverId(){
        return driverId;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setLicenseNumber(String licenseNumber){
        this.licenseNumber=licenseNumber;
    }
    public String getlicense(){
        return licenseNumber;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }

    public String getPhone(){
        return phone;
    }

    public void view(){
        System.out.println("id:"+driverId);
        System.out.println("name:"+name);
        System.out.println("phone:"+phone);
        System.out.println("License:"+licenseNumber);
    }
}