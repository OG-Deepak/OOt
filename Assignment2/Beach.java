/**
 * Represents a beach tourist destination.
 *
 * @author Deepak
 * @version 1.0
 */
public class Beach extends TouristPlace {

    /**
     * Creates a beach with its name and location.
     *
     * @param name the name of the beach
     * @param location the location of the beach
     */
    public Beach(String name, String location) {
        super(name, location);
    }

    /**
     * Displays beach details.
     */
    public void displayBeach() {
        displayPlace();
        System.out.println("Type: Beach");
    }
}
