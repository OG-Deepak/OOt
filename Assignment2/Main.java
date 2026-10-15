import java.util.Scanner;

/**
 * Main class for the Tourism and Agriculture Inheritance System.
 * Demonstrates five types of inheritance using a menu.
 *
 * @author Deepak
 * @version 1.0
 */
public class Main {

    /**
     * Runs the menu-driven application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====================================");
            System.out.println(" TOURISM AND AGRICULTURE SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multilevel Inheritance");
            System.out.println("3. Hierarchical Inheritance");
            System.out.println("4. Multiple Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Single Inheritance ---");

                    Beach beach = new Beach("Baga Beach", "Goa");
                    beach.displayBeach();
                    break;

                case 2:
                    System.out.println("\n--- Multilevel Inheritance ---");

                    RiceCrop rice = new RiceCrop();
                    rice.displayAgriculture();
                    rice.displayCrop();
                    rice.displayRice();
                    break;

                case 3:
                    System.out.println("\n--- Hierarchical Inheritance ---");

                    TourismBeach tourismBeach = new TourismBeach();
                    tourismBeach.displayTourism();
                    tourismBeach.displayBeachTourism();

                    System.out.println();

                    HillStation hill = new HillStation();
                    hill.displayTourism();
                    hill.displayHillStation();
                    break;

                case 4:
                    System.out.println("\n--- Multiple Inheritance ---");

                    EcoTourismFarm farm = new EcoTourismFarm();
                    farm.displayServices();
                    break;

                case 5:
                    System.out.println("\n--- Hybrid Inheritance ---");

                    EcoResort resort = new EcoResort();
                    resort.displayEcoResort();
                    break;

                case 6:
                    System.out.println("\nExiting the system. Goodbye!");
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please enter a number from 1 to 6."
                    );
            }

        } while (choice != 6);

        sc.close();
    }
}
