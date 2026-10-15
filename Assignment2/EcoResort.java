/**
 * Represents an eco-resort that provides tourism and agriculture activities.
 *
 * @author Deepak
 * @version 1.0
 */
public class EcoResort extends Farm
        implements TourismActivity, AgricultureActivity {

    /**
     * Displays the tourism service.
     */
    @Override
    public void provideTourismService() {
        System.out.println("Tourism Service: Guided nature tours");
    }

    /**
     * Displays the agriculture service.
     */
    @Override
    public void provideAgricultureService() {
        System.out.println("Agriculture Service: Organic farming experience");
    }

    /**
     * Displays the tourism activity.
     */
    @Override
    public void displayTourismActivity() {
        System.out.println("Tourism Activity: Bird watching");
    }

    /**
     * Displays the agricultural activity.
     */
    @Override
    public void displayAgricultureActivity() {
        System.out.println("Agriculture Activity: Planting crops");
    }

    /**
     * Displays all eco-resort details.
     */
    public void displayEcoResort() {
        System.out.println("\n--- Eco-Resort Details ---");
        displayFarm();

        displayTourismActivity();
        provideTourismService();

        displayAgricultureActivity();
        provideAgricultureService();
    }
}
