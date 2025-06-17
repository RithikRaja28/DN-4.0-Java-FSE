//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventory i = new Inventory();

        Product p1 = new Product(1, "Keyboard", 9, 5000);
        Product p2 = new Product(2, "Mouse", 499,5000);

        i.addProduct(p2);
        i.addProduct(p1);

        i.displayAllProducts();
    }
}