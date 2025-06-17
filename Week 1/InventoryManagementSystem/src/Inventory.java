import java.util.HashMap;

public class Inventory {
    private HashMap<Integer,Product> products = new HashMap<>();

    public void addProduct(Product p)
    {
        products.put(p.getProductId(),p);
    }

    public void updateProduct(int id,String name,int price,int quantity)
    {
        Product product = products.get(id);
        if(product!=null)
        {
            product.setProductName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
        }else{
            System.out.println("No Item/Product Found !");
        }
    }

    public void deleteProduct(int id)
    {
        if(products.containsKey(id))
        {
            products.remove(id);
        }else {
            System.out.println("No Item/Product Found !");
        }
    }

    public void displayAllProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}
