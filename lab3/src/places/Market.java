package places;

import People.Human;
import People.Character;
import clothes.Pokcet;
import products.Product;

public class Market {
    private Human worker;
    private Character buyer;

    public Market(Human worker, Character buyer){
        this.worker = worker;
        this.buyer = buyer;
    }

    public Human getWorker() {
        return worker;
    }

    public Character getBuyer(){
        return buyer;
    }

    public void setBuyer(Character buyer){
        this.buyer = buyer;
    }

    @Override
    public int hashCode() {
        return 1000 * worker.hashCode();
    }

    @Override
    public String toString(){
        return "" + buyer.getMoney();
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Character)) return false;

        if (((Character) obj).getMoney() >= worker.getMoney()) return true;
        else return false;
    }

    public void buy(Character buyer, Product product, int count, Pokcet pocket){
        System.out.println(buyer.getName() + " покупает у " + worker.getName() + " " + product.toString() + " " + count + " шт.");
        buyer.setMoney(buyer.getMoney() - product.getPrice() * count);
        product.setCount(product.getCount() - count);
        if(buyer.getMoney() == 0) System.out.println("У " + buyer.getName() + " ни осталось ни гроша");
        else System.out.println("У " + buyer.getName() + " осталось " + buyer.getMoney() + " рублей");
        for (int i = 0; i < count; i++){
            pocket.setArr(product);
        }
    }
}
