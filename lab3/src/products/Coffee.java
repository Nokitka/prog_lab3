package products;

public class Coffee
        extends Product{

    private int milkPersent;
    private int coffeePersent;
    private int temperature;
    private int sugarLvl;

    public Coffee(String name, int price, int count, int milkPersent, int coffeePersent, int temperature, int sugarLvl) {
        super(name, price, count);
        this.coffeePersent = coffeePersent;
        this.milkPersent = milkPersent;
        this.sugarLvl = sugarLvl;
        this.temperature = temperature;
    }

    public void setCoffeePersent(int coffeePersent) {
        this.coffeePersent = coffeePersent;
    }

    public void setMilkPersent(int milkPersent) {
        this.milkPersent = milkPersent;
    }

    public void setSugarLvl(int sugarLvl) {
        this.sugarLvl = sugarLvl;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
