import java.util.Scanner;

class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs." + price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}


public class ProductInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[numberOfProducts];

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            products[i] = new Product(name, price);
        }

        for (int i = 0; i < numberOfProducts; i++) {
            products[i].displayProductDetails();
        }

        Product.displayTotalProducts();

    }
}


/*
I/P ->
Enter the number of products: 3
Enter product name: Register
Enter product price: 50
Enter product name: Pens
Enter product price: 30
Enter product name: Erasers
Enter product price: 5

O/P ->
Product Name: Register
Price: Rs.50.0
Product Name: Pens
Price: Rs.30.0
Product Name: Erasers
Price: Rs.5.0
Total Products: 3
 */