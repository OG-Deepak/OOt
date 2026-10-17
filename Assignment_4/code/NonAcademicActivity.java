public class NonAcademicActivity {

    public enum EventType {
        INFOFEST,
        PLATEAUNIA,
        PLAY_ON,
        CULTURAL_FEST,
        SPORTS,
        QUIZ,
        DEBATE,
        CLUB_ACTIVITY,
        COMMUNITY_SERVICE,
        OTHER
    }

    private String eventName;
    private String academicYear;
    private String description;
    private EventType eventType;

    public NonAcademicActivity(String eventName,
                               String academicYear,
                               String description,
                               EventType eventType) {

        this.eventName = eventName;
        this.academicYear = academicYear;
        this.description = description;
        this.eventType = eventType;
    }

    public void displayActivity() {
        System.out.println("\n--- Non-Academic Activity ---");
        System.out.println("Event Name: " + eventName);
        System.out.println("Academic Year: " + academicYear);
        System.out.println("Event Type: " + eventType);
        System.out.println("Description: " + description);
    }

    public String getEventName() {
        return eventName;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public String getDescription() {
        return description;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
