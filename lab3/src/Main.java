import People.Human;
import People.FairyPerson;
import People.Character;
import clothes.Pokcet;
import enumeration.Location;
import enumeration.Role;
import pets.Dog;
import places.Adventure;
import places.Market;
import products.Coffee;
import products.sweets.Candy;
import products.sweets.Chocolate;
import products.sweets.SugarNuts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //-----------------------------Family------------------------------

        Family family = new Family();

        //-----------------------------Clothes------------------------------

        Pokcet pokcet = new Pokcet();

        //-----------------------------Products-----------------------------

        Candy candy = new Candy("Леденцы", 1, 4);
        SugarNuts sugarNuts = new SugarNuts("Шоколадные орешки", 1, 5);
        Chocolate chocolate = new Chocolate("Шоколадка", 1, 1);
        Coffee coffee = new Coffee("Кофе", 0, 4, 50, 50, 30, 3);

        //-----------------------------People-------------------------------

        FairyPerson fairyPerson = new FairyPerson("Карлсон", Role.SON, 0, Location.ROOF, 30, true);
        Human traider = new Human("Продавец", Role.DAD, 100, Location.MARKET, "Продавец", 1, 40);
        Human mom = new Human("Мама", Role.MOTHER, 100, Location.DINING_ROOM, "Домохозяйка", 3, 35);
        Human dad = new Human("Отец", Role.DAD, 200, Location.DINING_ROOM, "Юрист", 3, 35);
        Human maincharector = new Human("Малыш", Role.SON, 10, Location.MARKET, null, 0, 12);
        Human bro = new Human("Боссе", Role.SON, 0, Location.DINING_ROOM, null, 0, 5);
        Human sis = new Human("Бетан", Role.DOTHER, 0, Location.DINING_ROOM, null, 0, 5);

        //-----------------------------Adventure-------------------------------

        Adventure adventure = new Adventure(maincharector, fairyPerson);

        //-----------------------------Pets------------------------------------

        Dog dog = new Dog("Дворняга", maincharector, "Лайка");

        //-----------------------------Create Family----------------------------

        family.addToFamily(dad, mom);
        family.addToFamily(dad, maincharector);
        family.addToFamily(dad, bro);
        family.addToFamily(dad, sis);
        System.out.println(dad.equals(dad));

        //-----------------------------Print Family----------------------------

        family.printFamily(dad.hashCode());

        // 1ое действие

        System.out.println(maincharector.getName() + " помчался в " + maincharector.getLocation());
        Market market = new Market(traider, maincharector);
        market.buy(maincharector, candy, 4, pokcet);
        market.buy(maincharector, sugarNuts, 5, pokcet);
        market.buy(maincharector, chocolate, 1, pokcet);
        System.out.println(maincharector.think(1) + "зря у него " + maincharector.getMoney() + " рублей");
        System.out.println(maincharector.think(2) + "копил деньги на " + dog.getName() + " и " + maincharector.breeth());
        System.out.println("Но тут же " + maincharector.think(1) + " если он решил стать " + Role.MOTHER.getTittle() + " для " + fairyPerson.getName() + ", то не может себе позволить собаку");

        //2ое действие

        maincharector.setLocation(Location.HOUSE);
        pokcet.isFull();
        System.out.println(maincharector.looking() + " в " + mom.getLocation() + " " + mom.getName() + " " + dad.getName() + " " + sis.getName() + " " + bro.drink(coffee,2));
        System.out.println("У " + maincharector.getName() + " не было времени, чтобы посидеть с ними");
        System.out.println("На мгновение " + maincharector.think(1) + "можно пригласить всех  в " + Location.KIDS_ROOM.getTittle() + " и познакомить их с " + fairyPerson.getName());
        System.out.println("Однако " + maincharector.think(3) + "сегодня этого делать не стоит, потому что " + mom.getName() +" и "+ dad.getName() +" могут помешать ему отправиться с "+fairyPerson.getName()+" на "+Location.ROOF.getTittle());

        //3ье действие

        maincharector.setLocation(Location.ROOF);
        adventure.adventure();

    }
}