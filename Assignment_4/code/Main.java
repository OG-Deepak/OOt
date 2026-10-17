import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        List<Staff> staffMembers = new ArrayList<>();
        Queue<String> activityQueue = new LinkedList<>();
        Set<String> activityTypes = new LinkedHashSet<>();
        Map<String, Course> courses = new LinkedHashMap<>();

        System.out.println("==================");
        System.out.println(" MANAGEMENT SYSTEM");
        System.out.println("==================");

        Student s1 = new Student(
                "001", "Deepak Devan", "deepak@gmail.com",
                "MCA", 2026, 85.5);

        Student s2 = new Student(
                "002", "raj sharma", "raj@gmail.com",
                "MCA", 2025, 90.0);

        Student s3 = new Student(
                "003", "albert one", "ablert@gmail.com",
                "MCA", 2024, 78.5);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        staffMembers.add(new Staff(
                "SF001", "Anita Sharma", "anita@example.com",
                "Assistant Professor", "Computer Science",
                Staff.StaffType.TEACHING));

        staffMembers.add(new Staff(
                "SF002", "Rajesh Naik", "rajesh@example.com",
                "Technical Assistant", "Computer Laboratory",
                Staff.StaffType.NON_TEACHING));

        AcademicActivity[] academicActivities = {
                new AcademicActivity(
                        "Intra-Semester Assessment",
                        "2025-2026",
                        "Internal academic assessment",
                        AcademicActivity.ActivityType.ISA),

                new AcademicActivity(
                        "Midpoint Examination",
                        "2025-2026",
                        "Mid-semester examination",
                        AcademicActivity.ActivityType.MIDPOINT),

                new AcademicActivity(
                        "Semester-End Assessment",
                        "2025-2026",
                        "End-semester assessment",
                        AcademicActivity.ActivityType.SEA),

                new AcademicActivity(
                        "Technical Workshop",
                        "2024-2025",
                        "Sample technical workshop",
                        AcademicActivity.ActivityType.WORKSHOP),

                new AcademicActivity(
                        "Study Tour",
                        "2023-2024",
                        "Sample educational visit",
                        AcademicActivity.ActivityType.STUDY_TOUR),

                new AcademicActivity(
                        "Internship and Placement",
                        "2025-2026",
                        "Sample career development activity",
                        AcademicActivity.ActivityType.PLACEMENT)
        };

        NonAcademicActivity[] nonAcademicActivities = {
                new NonAcademicActivity(
                        "InfoFest", "2025-2026",
                        "Sample technical festival",
                        NonAcademicActivity.EventType.INFOFEST),

                new NonAcademicActivity(
                        "Plateaunia", "2024-2025",
                        "Sample cultural event",
                        NonAcademicActivity.EventType.PLATEAUNIA),

                new NonAcademicActivity(
                        "Play-on", "2023-2024",
                        "Sample student event",
                        NonAcademicActivity.EventType.PLAY_ON),

                new NonAcademicActivity(
                        "Sports Competition", "2025-2026",
                        "Sample sports event",
                        NonAcademicActivity.EventType.SPORTS)
        };

        Course mca = new Course(
                "MCA", "Master of Computer Applications",
                2, "Computer Science and Technology");

        courses.put(mca.getCourseCode(), mca);

        Subject subject1 = new Subject(
                "CSA5201", "Mathematics for Computer Applications",
                4, "Semester I");

        Subject subject2 = new Subject(
                "OOP", "Object-Oriented Programming",
                4, "Semester I");

        MemberRegistry<Student> registry = new MemberRegistry<>();

        for (Student student : students) {
            registry.addMember(student);
        }

        int choice;

        do {
            System.out.println("\n============== MAIN MENU ==============");
            System.out.println("1. Display Students");
            System.out.println("2. Display Teaching and Non-Teaching Staff");
            System.out.println("3. Display Academic Activities");
            System.out.println("4. Display Non-Academic Activities");
            System.out.println("5. Display Programs and Subjects");
            System.out.println("6. Demonstrate Object Referencing");
            System.out.println("7. Demonstrate Static Counter");
            System.out.println("8. Demonstrate Interfaces and Polymorphism");
            System.out.println("9. Demonstrate Collections and Generics");
            System.out.println("10. Demonstrate Access Modifiers");
            System.out.println("11. Demonstrate Exception Handling");
            System.out.println("12. Demonstrate Reflection");
            System.out.println("13. Demonstrate File Persistence and I/O");
            System.out.println("14. Demonstrate Shallow and Deep Cloning");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
                choice = -1;
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.println("\n--- STUDENTS ---");
                    for (Student student : students) {
                        student.displayDetails();
                    }
                    break;

                case 2:
                    System.out.println("\n--- STAFF MEMBERS ---");
                    for (Staff staff : staffMembers) {
                        staff.displayDetails();
                    }
                    break;

                case 3:
                    System.out.println("\n--- ACADEMIC ACTIVITIES ---");
                    for (AcademicActivity activity : academicActivities) {
                        activity.displayActivity();
                    }
                    break;

                case 4:
                    System.out.println("\n--- NON-ACADEMIC ACTIVITIES ---");
                    for (NonAcademicActivity activity : nonAcademicActivities) {
                        activity.displayActivity();
                    }
                    break;

                case 5:
                    System.out.println("\n--- PROGRAMS / COURSES ---");
                    for (Course course : courses.values()) {
                        course.displayCourse();
                    }

                    System.out.println("\n--- SUBJECTS ---");
                    subject1.displaySubject();
                    subject2.displaySubject();
                    break;

                case 6:
                    System.out.println("\n--- OBJECT REFERENCING ---");

                    Student referenceA = s1;
                    Student referenceB = referenceA;

                    System.out.println("Before modification:");
                    System.out.println("Reference A: " + referenceA.getName());
                    System.out.println("Reference B: " + referenceB.getName());

                    referenceA.setMarks(95.0);

                    System.out.println("After modifying through Reference A:");
                    System.out.println("Reference A marks: " + referenceA.getMarks());
                    System.out.println("Reference B marks: " + referenceB.getMarks());
                    System.out.println("Both references point to the same object.");
                    break;

                case 7:
                    System.out.println("\n--- STATIC COUNTER ---");
                    Member.displayMemberCount();
                    break;

                case 8:
                    System.out.println("\n--- INTERFACES AND POLYMORPHISM ---");

                    Reportable studentReport = s1;
                    Reportable staffReport = staffMembers.get(0);

                    sendReport(studentReport);
                    sendReport(staffReport);

                    System.out.println("\nMethod overloading:");
                    s1.displayDetails();
                    s1.displayDetails("Detailed Student Report");

                    System.out.println("\nMultiple interfaces:");
                    staffMembers.get(0).run();
                    System.out.println(
                            "Staff comparison result: "
                            + staffMembers.get(0).compareTo(staffMembers.get(1)));
                    break;

                case 9:
                    System.out.println("\n--- COLLECTIONS AND GENERICS ---");

                    System.out.println("Generic Student Registry:");
                    registry.displayMembers();

                    System.out.println("\nList size: " + students.size());

                    activityQueue.clear();
                    activityQueue.offer("ISA");
                    activityQueue.offer("Midpoint");
                    activityQueue.offer("SEA");

                    System.out.println("Queue: " + activityQueue);
                    System.out.println("Queue removal: " + activityQueue.poll());

                    activityTypes.add("Technical");
                    activityTypes.add("Cultural");
                    activityTypes.add("Technical");

                    System.out.println("Set (unique types): " + activityTypes);

                    System.out.println("Map (courses): " + courses.keySet());
                    break;

                case 10:
                    System.out.println("\n--- ACCESS MODIFIERS ---");
                    AccessDemo accessDemo = new AccessDemo();
                    System.out.println(accessDemo.publicMessage);
                    System.out.println(accessDemo.protectedMessage);
                    accessDemo.displayPrivateMessage();
                    System.out.println(
                            "Private fields cannot be accessed directly from Main.");
                    break;

                case 11:
                    System.out.println("\n--- EXCEPTION HANDLING ---");

                    try {
                        System.out.print("Enter student marks (0-100): ");
                        double marks = Double.parseDouble(sc.nextLine().trim());

                        if (marks < 0 || marks > 100) {
                            throw new InvalidRecordException(
                                    "Marks must be between 0 and 100.");
                        }

                        System.out.println("Valid marks: " + marks);

                    } catch (NumberFormatException e) {
                        System.out.println("Error: Please enter a valid number.");

                    } catch (InvalidRecordException e) {
                        System.out.println("Custom Exception: " + e.getMessage());

                    } finally {
                        System.out.println("Validation completed.");
                    }
                    break;

                case 12:
                    System.out.println("\n--- REFLECTION ---");

                    Class<?> studentClass = Student.class;

                    System.out.println("Class name: " + studentClass.getName());
                    System.out.println("Declared fields:");

                    for (Field field : studentClass.getDeclaredFields()) {
                        System.out.println("- " + field.getName());
                    }

                    System.out.println("Declared methods:");

                    for (Method method : studentClass.getDeclaredMethods()) {
                        System.out.println("- " + method.getName());
                    }
                    break;

                case 13:
                    System.out.println("\n--- FILE PERSISTENCE AND I/O ---");

                    String filename = "../data/dcst_data.txt";

                    List<String> records = new ArrayList<>();

                    for (Student student : students) {
                        records.add(
                                student.getMemberId() + ","
                                + student.getName() + ","
                                + student.getProgram() + ","
                                + student.getAcademicYear());
                    }

                    try {
                        DataManager.saveData(filename, records);
                        System.out.println("Records saved to " + filename);

                        List<String> loadedRecords =
                                DataManager.loadData(filename);

                        System.out.println("\nRecords loaded from file:");

                        for (String record : loadedRecords) {
                            System.out.println(record);
                        }

                    } catch (IOException e) {
                        System.out.println("File error: " + e.getMessage());
                    } finally {
                        System.out.println("Persistence operation completed.");
                    }
                    break;

                case 14:
                    System.out.println("\n--- SHALLOW AND DEEP CLONING ---");

                    Student original = new Student(
                            "ST100", "Clone Example", "clone@example.com",
                            "MCA", 2026, 80.0);

                    StringBuilder originalNotes =
                            new StringBuilder("Original notes");

                    StringBuilder shallowNotes = originalNotes;
                    StringBuilder deepNotes =
                            new StringBuilder(originalNotes.toString());

                    shallowNotes.append(" - Modified");

                    System.out.println("Original notes: " + originalNotes);
                    System.out.println("Shallow copy: " + shallowNotes);
                    System.out.println("Deep copy: " + deepNotes);
                    System.out.println(
                            "Shallow copy shares the same mutable object.");
                    System.out.println(
                            "Deep copy uses a separate mutable object.");
                    System.out.println(
                            "Note: this demonstrates shallow and deep copying "
                            + "of a mutable field, not cloning the Student class.");
                    break;

                case 0:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    public static void sendReport(Reportable reportable) {
        reportable.generateReport();
    }
}
