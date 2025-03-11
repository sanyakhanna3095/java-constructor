import java.util.Scanner;

class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000.0; // Fixed registration fee for all vehicles

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs." + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter the number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter owner name: ");
            String owner = sc.nextLine();

            System.out.print("Enter vehicle type (Car/Bike/Truck): ");
            String type = sc.nextLine();

            vehicles[i] = new Vehicle(owner, type);
        }

        System.out.print("Enter new registration fee: ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        for (int i = 0; i < n; i++) {
            vehicles[i].displayVehicleDetails();
        }

    }
}



/*
I/P ->
Enter the number of vehicles: 2
Enter owner name: Sanya
Enter vehicle type (Car/Bike/Truck): Car
Enter owner name: Mike
Enter vehicle type (Car/Bike/Truck): Truck
Enter new registration fee: 7000

O/P ->
Owner Name: Sanya
Vehicle Type: Car
Registration Fee: Rs.7000.0
Owner Name: Mike
Vehicle Type: Truck
Registration Fee: Rs.7000.0

 */
