import java.util.Scanner;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 100.0;

    // Default constructor
    public CarRental() {
        this("Unknown", "Standard", 1);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: Rs" + calculateTotalCost());
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for rental details
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter car model: ");
        String model = sc.nextLine();
        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        // Creating a rental object with user input
        CarRental rental = new CarRental(name, model, days);

        // Displaying rental details
        System.out.println("\nRental Details:");
        rental.displayDetails();

    }
}


/*
I/P ->
Enter customer name: Sanya
Enter car model: RangeRover
Enter number of rental days: 4

O/P ->
Rental Details:
Customer Name: Sanya
Car Model: RangeRover
Rental Days: 4
Total Cost: Rs400.0

 */