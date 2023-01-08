package People;

import enumeration.Location;
import enumeration.Role;

public class FairyPerson
        extends Character {

    private boolean canFly;

    public FairyPerson(String name, Role role, int money, Location location, int age, boolean canFly) {
        super(name, role, money, location, age);
        this.canFly = canFly;
    }

    public boolean getCanFly(){
        return canFly;
    }
}
