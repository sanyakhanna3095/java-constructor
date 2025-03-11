import java.util.Scanner;

class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: Rs." + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int n = sc.nextInt();
        sc.nextLine();

        Course[] courses = new Course[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter course name: ");
            String name = sc.nextLine();

            System.out.print("Enter course duration (weeks): ");
            int duration = sc.nextInt();

            System.out.print("Enter course fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();

            courses[i] = new Course(name, duration, fee);
        }

        System.out.print("Enter new institute name: ");
        String newInstituteName = sc.nextLine();
        Course.updateInstituteName(newInstituteName);

        for (int i = 0; i < n; i++) {
            courses[i].displayCourseDetails();
        }

    }
}


/*
I/P ->
Enter the number of courses: 3
Enter course name: CSE
Enter course duration (weeks): 45
Enter course fee: 50000
Enter course name: BBA
Enter course duration (weeks): 38
Enter course fee: 40000
Enter course name: LLB
Enter course duration (weeks): 65
Enter course fee: 55000
Enter new institute name: ABC College

O/P ->
Course Name: CSE
Duration: 45 weeks
Fee: Rs.50000.0
Institute: ABC College
Course Name: BBA
Duration: 38 weeks
Fee: Rs.40000.0
Institute: ABC College
Course Name: LLB
Duration: 65 weeks
Fee: Rs.55000.0
Institute: ABC College

 */