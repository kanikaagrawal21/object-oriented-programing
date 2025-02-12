package MultilevelInheritance;

class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "2024-02-20");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2024-02-19", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2024-02-18", "TRK67890", "2024-02-22");

        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
