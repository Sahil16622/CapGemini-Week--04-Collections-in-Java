package dynamiconlinemarketplace;
import java.util.ArrayList;
import java.util.List;


class ProductCatalog {
    public List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }
}

