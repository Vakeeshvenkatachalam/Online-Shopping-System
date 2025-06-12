public class CartItem {
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotal() {
        return product.price * quantity;
    }

    public void display() {
        System.out.printf("%s x %d = ₹%.2f\n", product.name, quantity, getTotal());
    }
}