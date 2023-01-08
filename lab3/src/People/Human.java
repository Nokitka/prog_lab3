package People;

import enumeration.Location;
import enumeration.Role;

public class Human
        extends Character {

    private String profession;
    private int childCount;
    private int age;

    public Human(String name, Role role, int money, Location location, String profession, int childCount, int age) {
        super(name, role, money, location, age);
        this.profession = profession;
        this.childCount = childCount;
    }

    public String getProfession() {
        return profession;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
