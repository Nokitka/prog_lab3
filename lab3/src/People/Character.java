package People;

import enumeration.Location;
import enumeration.Role;
import interfaces.Actions;
import products.Coffee;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Map;

public abstract class Character
        implements Actions {

    private int familyIndex = 0;
    private String name;
    private Role role;
    private int money;
    private int age;
    private Location location;

    public Character(String name, Role role, int money, Location location, int age) {
        this.name = name;
        this.money = money;
        this.location = location;
        this.role = role;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String drink(Coffee coffee, int variant) {
        return switch (variant) {
            case 1 -> name + " пьет " + coffee.getName();
            case 2 -> name + " пьют " + coffee.getName();
            default -> " Oooops ";
        };
    }

    public int getFamilyIndex() {
        return familyIndex;
    }

    public void setFamilyIndex(int familyIndex) {
        this.familyIndex = familyIndex;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role.getTittle();
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getLocation() {
        return location.getTittle();
    }

    public void setLocation(Location location) {
        System.out.println(name + " сменил локацию " + this.location.getTittle() + " на " + location.getTittle());
        this.location = location;
    }

    public void isDressed() {
        System.out.println("В штанах");
    }

    public String drink(Coffee coffee) {
        return "пьет кофе в" + location;
    }

    @Override
    public String talk() {
        return name + " говорит ";
    }
    @Override
    public String think(int variant) {
        return switch (variant) {
            case 1 -> name + " думает, что ";
            case 2 -> name + " вспомнил, что ";
            case 3 -> name + " решил, что ";
            default -> name + " не думает ";
        };
    }

    @Override
    public String looking() {
        return name + " видит, что";
    }

    @Override
    public String breeth() {
        return name + " вздохнул ";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Character)) return false;

        if (!((Character) obj).role.getTittle().equals(this.role.getTittle())) return false;

        if (((Character) obj).getFamilyIndex() != this.familyIndex) return false;

        return this.familyIndex != 0;
        /*
        @FunctionalInterface
        interface Animal{
            boolean method(Animal obj);
        }

        Animal an = animal -> animal.getSound().equals("mu-mu");
        */
    }
}
