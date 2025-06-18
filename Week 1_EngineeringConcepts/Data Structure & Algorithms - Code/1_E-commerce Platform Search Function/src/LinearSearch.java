public class LinearSearch {
    public static Product l_search(Product[] products, String name) {
        for (Product p : products) {
            if (p != null && p.ProductName != null && p.ProductName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
}
