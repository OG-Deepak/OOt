public class AcademicActivity {

    public enum ActivityType {
        ISA,
        MIDPOINT,
        SEA,
        WORKSHOP,
        STUDY_TOUR,
        INTERNSHIP,
        PLACEMENT,
        SEMINAR,
        HACKATHON,
        PROJECT
    }

    private String activityName;
    private String academicYear;
    private String description;
    private ActivityType activityType;

    public AcademicActivity(String activityName,
                            String academicYear,
                            String description,
                            ActivityType activityType) {

        this.activityName = activityName;
        this.academicYear = academicYear;
        this.description = description;
        this.activityType = activityType;
    }

    public void displayActivity() {
        System.out.println("\n--- Academic Activity ---");
        System.out.println("Name: " + activityName);
        System.out.println("Academic Year: " + academicYear);
        System.out.println("Type: " + activityType);
        System.out.println("Description: " + description);
    }

    public String getActivityName() {
        return activityName;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public String getDescription() {
        return description;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
