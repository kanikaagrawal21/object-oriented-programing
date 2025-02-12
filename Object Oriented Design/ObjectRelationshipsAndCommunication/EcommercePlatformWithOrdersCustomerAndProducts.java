package ObjectRelationshipsAndCommunication;

import java.util.*;

class Customers {
    private String name;
    private List<Order> orders;

    public Customers(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order with ID: " + order.getOrderId());
    }

    public String getName() {
        return name;
    }
}

class Order {
    private static int idCounter = 1;
    private int orderId;
    private List<Product> products;

    public Order() {
        this.orderId = idCounter++;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println(" - Product: " + product.getName() + " ($" + product.getPrice() + ")");
        }
    }

    public int getOrderId() {
        return orderId;
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


public class EcommercePlatformWithOrdersCustomerAndProducts {
    public static void main(String[] args) {
        Customers customer = new Customers("John Doe");

        Order order1 = new Order();
        order1.addProduct(new Product("Laptop", 999.99));
        order1.addProduct(new Product("Mouse", 49.99));

        customer.placeOrder(order1);

        order1.showOrderDetails();
    }
}

