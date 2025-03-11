import java.util.Scanner;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to set balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
        else {
            System.out.println("Invalid balance. Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + balance);
    }
}

// Subclass demonstrating use of protected and public members
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main method to run the program
public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter interest rate: ");
        double interestRate = sc.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolder, balance, interestRate);
        savingsAccount.displaySavingsDetails();

    }
}


/*
I/P ->
Enter account number: 123456
Enter account holder name: Sanya
Enter initial balance: 2000
Enter interest rate: 2

O/P ->
Account Number: 123456
Account Holder: Sanya
Balance: Rs.2000.0
Interest Rate: 2.0%
 */