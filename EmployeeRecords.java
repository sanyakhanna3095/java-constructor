import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Public method to set salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs." + salary);
    }
}

// Subclass demonstrating use of protected and public members
class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        displayDetails();
        System.out.println("Team Name: " + teamName);
    }
}

// Main method to run the program
public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int employeeID = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.print("Enter initial salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter team name: ");
        String teamName = sc.nextLine();

        Manager emp = new Manager(employeeID, department, salary, teamName);
        emp.displayManagerDetails();

        System.out.print("Enter the changed salary: Rs.");
        int new_salary=sc.nextInt();
        emp.setSalary(new_salary);
        emp.displayManagerDetails();
    }
}


/*
I/p ->
Enter employee ID: 123456
Enter department: IT
Enter initial salary: 40000
Enter team name: Team A

O/P ->
Employee ID: 123456
Department: IT
Salary: Rs.40000.0
Team Name: Team A

I/P ->
Enter the changed salary: Rs.50000

O/P ->
Employee ID: 123456
Department: IT
Salary: Rs.50000.0
Team Name: Team A

 */