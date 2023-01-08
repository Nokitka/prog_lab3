package products;

public abstract class Product {

    private String name;
    private int price;
    private int count;

    public Product(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Product)) return false;

        return ((Product) obj).getName().equals(this.name);
    }
}
