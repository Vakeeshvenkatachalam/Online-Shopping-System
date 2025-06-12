import java.util.*;

public class OrderHistory {
    static List<Order> orders = new ArrayList<>();

    public static void addOrder(Order order) {
        orders.add(order);
    }

    public static void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders placed yet.");
            return;
        }

        System.out.println("\n--- Order History ---");
        for (Order order : orders) {
            order.displayOrder();
            System.out.println("---------------");
        }
    }
}