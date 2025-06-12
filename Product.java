public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.printf("ID: %d | Name: %s | Price: ₹%.2f\n", id, name, price);
    }
}