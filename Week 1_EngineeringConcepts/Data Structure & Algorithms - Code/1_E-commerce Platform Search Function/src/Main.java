import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product[] products ={
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shirt", "Apparel"),
                new Product(103, "Camera", "Electronics"),
                new Product(104, "Shoes", "Footwear")
        };

        System.out.println("Linear Search: ");
        Product result1 = LinearSearch.l_search(products, "Camera");
        System.out.println(result1 != null ? "Found" : "Product not found");

        //sorting for binary search
        Arrays.sort(products, Comparator.comparing(
                p -> p.ProductName == null ? "" : p.ProductName.toLowerCase()
        ));


        System.out.println("\nBinary Search: ");
        Product result2 = BInarySearch.b_search(products, "Joggers");
        System.out.println(result2 != null ? "Found" : "Product not found");
    }
}