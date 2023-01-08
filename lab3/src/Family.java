import People.Character;
import enumeration.Role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Family {
    private Map<Integer, ArrayList<Character>> family = new HashMap<>();

    public Map<Integer, ArrayList<Character>> getFamily() {
        return family;
    }

    public void printFamily(int key){
        if (key == 0) {
            for (Map.Entry<Integer, ArrayList<Character>> entry : family.entrySet()) {
                System.out.println(entry.getKey() + " { ");
                int i = 0;
                for (Character value : entry.getValue()) {
                    i++;
                    System.out.println("    " + value.getName() + ";");
                    if (i == entry.getValue().size()) System.out.println("}");
                }
            }
        }
        else {
            for (Map.Entry<Integer, ArrayList<Character>> entry : family.entrySet()) {
                if (key == entry.getKey()) {
                    System.out.println(entry.getKey() + " { ");
                    for (Character value : entry.getValue()) {
                        System.out.println("    " + value.getName() + ";");
                    }
                    System.out.println("}");
                }
            }
        }
    }

    public void addToFamily(Character adder, Character whoAdd){
        ArrayList<Character> tmp = new ArrayList<>();
        if (adder.getAge() >= 18){
            if (adder.getRole().equals("Сын")){
                whoAdd.setFamilyIndex(adder.hashCode());
                adder.setRole(Role.DAD);
                if (family.get(adder.hashCode()) == null){
                    adder.setFamilyIndex(adder.hashCode());
                    tmp.add(adder);
                    family.put(adder.hashCode(), tmp);
                }
                family.get(adder.hashCode()).add(whoAdd);
            }
            else if (adder.getRole().equals("Отец")){
                whoAdd.setFamilyIndex(adder.hashCode());
                if (family.get(adder.hashCode()) == null){
                    adder.setFamilyIndex(adder.hashCode());
                    tmp.add(adder);
                    family.put(adder.hashCode(), tmp);
                }
                family.get(adder.hashCode()).add(whoAdd);
            }
        }
    }
}
