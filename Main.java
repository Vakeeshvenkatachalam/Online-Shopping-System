import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Store store = new Store();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Online Shopping System ---");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> store.displayProducts();
                case 2 -> store.addToCart();
                case 3 -> store.viewCart();
                case 4 -> store.checkout();
                case 5 -> System.out.println("Thank you for shopping!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}