package places;

import People.FairyPerson;
import People.Character;
import People.Human;

public class Adventure {
    private Human playerOne;
    private FairyPerson playerTwo;

    public Adventure(Human playerOne, FairyPerson playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public FairyPerson getPlayerTwo() {
        return playerTwo;
    }

    public Human getPlayerOne() {
        return playerOne;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Character)) return false;

        if (((Character) obj).getLocation().equals(playerTwo.getLocation())) return true;
        else return false;
    }
    public void adventure(){
        System.out.println("Приключение начинается на " + playerOne.getLocation());
        System.out.println(playerOne.getName() + " летит на " + playerTwo.getName());
    }
}
