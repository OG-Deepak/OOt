/**
 * Represents a farm that provides tourism and agriculture services.
 *
 * @author Deepak
 * @version 1.0
 */
public class EcoTourismFarm implements TourismServices, AgricultureServices {

    /**
     * Provides tourism services to visitors.
     */
    @Override
    public void provideTourismService() {
        System.out.println("Tourism Service: Guided farm tours");
    }

    /**
     * Provides agricultural services to visitors.
     */
    @Override
    public void provideAgricultureService() {
        System.out.println("Agriculture Service: Crop cultivation experience");
    }

    /**
     * Displays all eco-tourism farm services.
     */
    public void displayServices() {
        System.out.println("Eco-Tourism Farm Services");
        provideTourismService();
        provideAgricultureService();
    }
}
