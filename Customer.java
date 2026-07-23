public class Customer {
    int customer_id;
    String name;
    int phone;
    String email;
    void register( int customer_id,String name,int phone,String email){
        this.customer_id=customer_id;
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
    void view(){
        System.out.println("customer:"+customer_id);
        System.out.println("name:"+name);
        System.out.println("phone:"+phone);
        System.out.println("email:"+email);
    }
        void update( int customer_id,String name,int phone,String email){
        this.customer_id=customer_id;
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
}