public class Subject {

    private String subjectCode;
    private String subjectName;
    private int credits;
    private String semester;

    public Subject(String subjectCode, String subjectName,
                   int credits, String semester) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.credits = credits;
        this.semester = semester;
    }

    public void displaySubject() {
        System.out.println("\n--- Subject Details ---");
        System.out.println("Subject Code: " + subjectCode);
        System.out.println("Subject Name: " + subjectName);
        System.out.println("Credits: " + credits);
        System.out.println("Semester: " + semester);
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCredits() {
        return credits;
    }

    public String getSemester() {
        return semester;
    }
}
