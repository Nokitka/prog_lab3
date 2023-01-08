package products.sweets;

import interfaces.Sweets;
import products.Product;

public class Chocolate
        extends Product
        implements Sweets{

    public Chocolate(String name, int price, int count) {
        super(name, price, count);
    }

    @Override
    public boolean isSugar() {
        return true;
    }

    @Override
    public boolean isSucking() {
        return false;
    }
}
