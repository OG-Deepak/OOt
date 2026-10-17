public class AccessDemo {
    public String publicMessage = "Public: accessible everywhere";
    private String privateMessage = "Private: accessible only inside this class";
    protected String protectedMessage = "Protected: accessible within package and subclasses";

    public void displayInsideClass() {
        System.out.println("\n--- Access Inside Class ---");
        System.out.println(publicMessage);
        System.out.println(privateMessage);
        System.out.println(protectedMessage);
    }

    public void displayPrivateMessage() {
        System.out.println(privateMessage);
    }

    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();

        System.out.println("--- Access Modifiers Demonstration ---");

        System.out.println("\nAccessing through object outside the class:");
        System.out.println(demo.publicMessage);
        System.out.println(demo.protectedMessage);

        demo.displayPrivateMessage();

        demo.displayInsideClass();

        // System.out.println(demo.privateMessage);
        // Direct access to private is not allowed outside the class.
    }
}
