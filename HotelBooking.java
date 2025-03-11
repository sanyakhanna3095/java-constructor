import java.util.Scanner;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this("Unknown", "Basic", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking Details:");
        defaultBooking.displayDetails();

        // Taking user input for custom booking
        System.out.print("\nEnter guest name: ");
        String guestName = sc.nextLine();
        System.out.print("Enter room type: ");
        String roomType = sc.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        // Using parameterized constructor with user input
        HotelBooking userBooking = new HotelBooking(guestName, roomType, nights);
        System.out.println("\nUser Booking Details:");
        userBooking.displayDetails();

        // Cloning the user booking using the copy constructor
        HotelBooking clonedBooking = new HotelBooking(userBooking);
        System.out.println("\nCloned Booking Details:");
        clonedBooking.displayDetails();

    }
}


/*
Default Booking Details:
Guest Name: Unknown
Room Type: Basic
Nights: 1

Enter guest name: Sanya
Enter room type: Delux
Enter number of nights: 3

User Booking Details:
Guest Name: Sanya
Room Type: Delux
Nights: 3

Cloned Booking Details:
Guest Name: Sanya
Room Type: Delux
Nights: 3

 */