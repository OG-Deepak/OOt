import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;
    String color;
    double price;

    // Method to display car details
    void displayDetails() {
        System.out.println("\n----- Car Details -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Color : " + color);
        System.out.println("Price : $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car car = new Car();

        System.out.print("Enter Car Brand: ");
        car.brand = sc.nextLine();

        System.out.print("Enter Car Model: ");
        car.model = sc.nextLine();

        System.out.print("Enter Manufacturing Year: ");
        car.year = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter Car Color: ");
        car.color = sc.nextLine();

        System.out.print("Enter Car Price: ");
        car.price = sc.nextDouble();

        car.displayDetails();
//comment 
        sc.close();
    }
}
