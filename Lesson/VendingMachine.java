package Lesson;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List <Product> products;

    public VendingMachine() {
        this.products = new ArrayList<Product>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductByName(String nameProduct) {
        for (Product product : products) {
            if (product.getName().contains(nameProduct)) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByPrice(int price) {
        for (Product product : products) {
            if (product.getPrice() == price) {
                return product;
            }
        }
        return null;
    }
    
}
