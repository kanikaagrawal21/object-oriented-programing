package StaticsInstanceFinalKeywords;

// Product class
class Product {
    // Static variable shared by all products
    static double discount = 10.0;  // Default discount in percentage

    // Final variable for product ID (cannot be changed after assignment)
    final int productID;
    String productName;
    double price;
    int quantity;

    // Constructor using 'this' to initialize instance variables
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;  // 'this' differentiates instance variable from parameter
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate final price after discount
    double calculateFinalPrice() {
        return price * quantity * (1 - discount / 100);
    }

    // Method to display product details
    void displayProduct() {
        if (this instanceof Product) {  // Check if object is an instance of Product class
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Final Price after " + discount + "% discount: $" + calculateFinalPrice());
            System.out.println();
        }
    }

    // Static method to update discount percentage
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

// Main class
public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Creating product objects
        Product prod1 = new Product(101, "Laptop", 800.0, 2);
        Product prod2 = new Product(102, "Smartphone", 500.0, 3);

        // Display product details before discount update
        System.out.println("Before Discount Update:");
        prod1.displayProduct();
        prod2.displayProduct();

        // Updating discount using static method
        Product.updateDiscount(15.0);

        // Display product details after discount update
        System.out.println("After Discount Update:");
        prod1.displayProduct();
        prod2.displayProduct();
    }
}
