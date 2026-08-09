public class Passenger {
    private int id;
    private String name;
    private String phone;
    private String email;

    public Passenger(int id,String name,String phone,String email){
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.email=email;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(){
        return phone;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void view (){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("phone:"+phone);
        System.out.println("email:"+email);
    }
}
