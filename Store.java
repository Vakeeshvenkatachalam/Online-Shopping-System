import java.util.*;

public class Store {
    List<Product> products = new ArrayList<>();
    List<CartItem> cart = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Store() {
        products.add(new Product(1, "Laptop", 55000));
        products.add(new Product(2, "Smartphone", 20000));
        products.add(new Product(3, "Headphones", 1500));
        products.add(new Product(4, "Keyboard", 700));
    }

    public void displayProducts() {
        System.out.println("\n--- Product List ---");
        for (Product p : products) {
            p.display();
        }
    }

    public void addToCart() {
        System.out.print("Enter Product ID to add to cart: ");
        int id = sc.nextInt();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        for (Product p : products) {
            if (p.id == id) {
                cart.add(new CartItem(p, qty));
                System.out.println("Product added to cart!");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void viewCart() {
        System.out.println("\n--- Cart Items ---");
        double total = 0;
        for (CartItem item : cart) {
            item.display();
            total += item.getTotal();
        }
        System.out.printf("Total Amount: ₹%.2f\n", total);
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty!");
            return;
        }
        viewCart();
        System.out.println("Proceeding to checkout... Payment successful!");
        cart.clear();
    }
}