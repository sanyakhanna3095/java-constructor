import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Create a person object with user input
        Person original = new Person(name, age);
        System.out.println("\nOriginal Person Details:");
        original.displayDetails();

        // Clone the original person using the copy constructor
        Person clone = new Person(original);
        System.out.println("\nCloned Person Details:");
        clone.displayDetails();

    }
}


/*
I/p ->
Enter name: sanya
Enter age: 21

O/P ->
Original Person Details:
Name: sanya
Age: 21

Cloned Person Details:
Name: sanya
Age: 21

 */