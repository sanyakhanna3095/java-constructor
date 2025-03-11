import java.util.Scanner;

public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle Details:");
        defaultCircle.displayDetails();

        // Taking user input for custom circle
        System.out.print("\nEnter the radius of the circle: ");
        double userRadius = sc.nextDouble();

        // Using parameterized constructor with user input
        Circle userCircle = new Circle(userRadius);
        System.out.println("\nUser Circle Details:");
        userCircle.displayDetails();

    }
}


/*
Default Circle Details:
Radius: 1.0

Enter the radius of the circle:
2

User Circle Details:
Radius: 2.0

 */