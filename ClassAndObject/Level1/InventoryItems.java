package ClassAndObjectLevelOne;

import java.util.Scanner;

class  Item{
    private String itemCode;
    private String itemName;
    private double price;
    public void displayItemDetails() {
        System.out.println("\nItem Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public String getItemCode() {
        return itemCode;
    }

}


public class InventoryItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        String itemCode = scanner.nextLine();

        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();

        Item item = new Item();

        item.displayItemDetails();

        System.out.print("\nEnter Quantity to Purchase: ");
        int quantity = scanner.nextInt();

        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: $" + totalCost);

    }
}
