public class Main{
    public static void main(String[]args){
        Student s1 = new Student("albert", 12, "MCA", 2026, 65.7);
        System.out.println("Student1:");
        s1.display();
        Student s2 = s1;
        System.out.println(" ");
        System.out.println("Student2(using referencing):");
        s2.display();
        s2.name="vijay";
        System.out.println(" ");
        System.out.println("after changing name in student 2:");
        System.out.println("Student1:");
        s1.display();
        System.out.println(" ");
        System.out.println("Student2:");
        s2.display();

    }
}
