package clothes;

import products.Product;

import java.util.ArrayList;
import java.util.List;

public class Pokcet {
    final int VOLUME = 10;
    private List<Product> arr = new ArrayList<>(VOLUME);

    public  boolean isFull(){
        if (arr.size() == VOLUME){
            System.out.println("Карманы полностью набиты");
            return true;
        }
        else{
            System.out.println("В карманах еще есть место");
            return false;
        }
    }

    public Product getArr(){
        return arr.get((int)(Math.random() * arr.size()));
    }

    public void setArr(Product product){
        arr.add(product);
    }
}
