import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        this.products = new HashMap<>();
        this.productsStock = new HashMap<>();
    }


    public void addProduct(String product, int price, int stock){
        this.products.put(product, price);
        this.productsStock.put(product, stock);
    }

    public int price(String product){
        if(this.products.containsKey(product)){
            return this.products.get(product);
        }
        return -99;
    }

    public int stock(String product){
        if(this.productsStock.containsKey(product)){
            return this.productsStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (!this.productsStock.containsKey(product)) {
            return false;
        }

        int currentStock = this.productsStock.get(product);
        if (currentStock > 0) {
            this.productsStock.put(product, currentStock - 1);
            return true;
        }

        return false;
    }

    public Set<String> products(){
        return products.keySet();
    }
}
