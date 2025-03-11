import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + String.format("%.2f", price));
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book Details:");
        defaultBook.displayDetails();

        // Taking user input for book details
        System.out.println("\nEnter book title: ");
        String title = sc.nextLine();
        System.out.println("Enter book author: ");
        String author = sc.nextLine();
        System.out.println("Enter book price: ");
        double price = sc.nextDouble();

        // Using parameterized constructor with user input
        Book userBook = new Book(title, author, price);
        System.out.println("\nUser Book Details:");
        userBook.displayDetails();

    }
}


/*
Default Constructor
O/P ->
Default Book Details:
Title: Unknown Title
Author: Unknown Author
Price: Rs.0.00

Parameterised Constructor
I/P ->
Enter book title:
Harry Potter
Enter book author:
JK Rowling
Enter book price:
260

O/P ->
User Book Details:
Title: Harry Potter
Author: JK Rowling
Price: Rs.260.00

 */