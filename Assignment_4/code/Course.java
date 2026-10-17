public class Course {

    private String courseCode;
    private String courseName;
    private int durationYears;
    private String department;

    public Course(String courseCode, String courseName,
                  int durationYears, String department) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.durationYears = durationYears;
        this.department = department;
    }

    public void displayCourse() {
        System.out.println("\n--- Course Details ---");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + durationYears + " years");
        System.out.println("Department: " + department);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDurationYears() {
        return durationYears;
    }

    public String getDepartment() {
        return department;
    }
}
