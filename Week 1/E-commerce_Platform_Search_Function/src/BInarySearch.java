public class BInarySearch {
    public static Product b_search(Product[] products,String name)
    {
        int left =0;
        int right = products.length-1;

        while(left<=right)
        {
            int mid = left + (right-left) /2;
            int cmp = products[mid].ProductName.compareToIgnoreCase(name);

            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }
}
