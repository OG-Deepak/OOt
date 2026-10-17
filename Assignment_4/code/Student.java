public class Student extends Member {

    private String program;
    private int academicYear;
    private double marks;

    public Student(String memberId, String name, String email,
                   String program, int academicYear, double marks) {

        super(memberId, name, email);

        this.program = program;
        this.academicYear = academicYear;
        this.marks = marks;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Program: " + program);
        System.out.println("Academic Year: " + academicYear);
        System.out.println("Marks: " + marks);
    }

    @Override
    public void generateReport() {
        System.out.println("\n--- Student Report ---");
        displayDetails();
    }

    public String getProgram() {
        return program;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void displayDetails(String reportType) {
        System.out.println("\nReport Type: " + reportType);
        displayDetails();
    }
}
