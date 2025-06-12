import java.util.List;

public class Order {
    List<CartItem> items;
    double totalAmount;
    String user;

    public Order(String user, List<CartItem> items, double totalAmount) {
        this.user = user;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public void displayOrder() {
        System.out.println("Order for: " + user);
        for (CartItem item : items) {
            item.display();
        }
        System.out.printf("Total: ₹%.2f\n", totalAmount);
    }
}