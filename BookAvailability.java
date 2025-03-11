import java.util.Scanner;

public class BookAvailability {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized constructor
    public BookAvailability(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("Successfully borrowed '" + title + "'.");
            isAvailable = false;
        }
        else {
            System.out.println("Sorry, '" + title + "' is currently not available.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for book details
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        // Creating a book object
        BookAvailability book = new BookAvailability(title, author, price, true);

        // Displaying book details
        System.out.println("\nBook Details:");
        book.displayDetails();

        // Borrowing the book
        System.out.println("\nAttempting to borrow the book...");
        book.borrowBook();

        // Trying to borrow again to show availability change
        System.out.println("\nAttempting to borrow the book again...");
        book.borrowBook();

    }
}


/*
I/P ->
Enter book title: Harry Potter
Enter author: JK Rowling
Enter price: 250

O/P ->
Book Details:
Title: Harry Potter
Author: JK Rowling
Price: $250.0
Available: Yes

Attempting to borrow the book...
Successfully borrowed 'Harry Potter'.

Attempting to borrow the book again...
Sorry, 'Harry Potter' is currently not available.

 */