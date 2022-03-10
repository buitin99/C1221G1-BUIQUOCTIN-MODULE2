package s12_java_collection_framework.bai_tap.arraylist_linkedlist;

import java.util.Comparator;

public class ProductManagerSort extends Product implements Comparator<Product>  {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getGiaTien() - o2.getGiaTien();
    }
}
