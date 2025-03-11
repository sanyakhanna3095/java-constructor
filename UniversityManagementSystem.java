import java.util.Scanner;
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to update CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0 and 10.");
        }
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

// Subclass
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Display postgraduate student
    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA() + ", Specialization: " + specialization);
    }
}

// Driver class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double CGPA = sc.nextDouble();
        sc.nextLine(); // Consume newline

        System.out.print("Enter research topic: ");
        String researchTopic = sc.nextLine();

        Student s1 = new Student(rollNumber, name, CGPA);
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Sehaj", 9.2, "Data Science");

        s1.displayDetails();
        pg1.displayPostgraduateDetails();

        // Modifying CGPA
        s1.setCGPA(9.0);
        pg1.setCGPA(9.5);

        System.out.println("After updating CGPA:");
        s1.displayDetails();
        pg1.displayPostgraduateDetails();
    }
}


/*
I/P ->
Enter roll number: 2110991266
Enter name: Sanya
Enter CGPA: 9.6
Enter research topic: AI

O/P ->
Roll Number: 2110991266, Name: Sanya, CGPA: 9.6
Roll Number: 201, Name: Sehaj, CGPA: 9.2, Specialization: Data Science
After updating CGPA:
Roll Number: 2110991266, Name: Sanya, CGPA: 9.0
Roll Number: 201, Name: Sehaj, CGPA: 9.5, Specialization: Data Science

 */