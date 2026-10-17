public class Staff extends Member implements Runnable, Comparable<Staff> {

    public enum StaffType {
        TEACHING,
        NON_TEACHING
    }

    private String designation;
    private String department;
    private StaffType staffType;

    public Staff(String memberId, String name, String email,
                 String designation, String department,
                 StaffType staffType) {

        super(memberId, name, email);

        this.designation = designation;
        this.department = department;
        this.staffType = staffType;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Staff Details ---");
        System.out.println("Staff ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Staff Type: " + staffType);
    }

    @Override
    public void generateReport() {
        System.out.println("\n--- Staff Report ---");
        displayDetails();
    }

    @Override
    public void run() {
        System.out.println(name + " is performing staff duties.");
    }

    @Override
    public int compareTo(Staff other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public StaffType getStaffType() {
        return staffType;
    }
}

