public abstract class Member implements Reportable {

    protected String memberId;
    protected String name;
    protected String email;

    private static int memberCount = 0;

    public Member(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        memberCount++;
    }

    public abstract void displayDetails();

    public static void displayMemberCount() {
        System.out.println("Total Members Created: " + memberCount);
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void generateReport() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
