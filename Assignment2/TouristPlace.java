/**
 * Represents a tourist destination.
 *
 * @author Deepak
 * @version 1.0
 */
public class TouristPlace {

    String name;
    String location;

    /**
     * Creates a tourist place.
     *
     * @param name the name of the tourist place
     * @param location the location of the tourist place
     */
    public TouristPlace(String name, String location) {
        this.name = name;
        this.location = location;
    }

    /**
     * Displays tourist place details.
     */
    public void displayPlace() {
        System.out.println("Place: " + name);
        System.out.println("Location: " + location);
    }
}
