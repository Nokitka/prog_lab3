package pets;

import People.Character;

abstract class Pets {
    private String breed;
    private Character owner;
    private String name;

    public Pets(String breed, Character owner, String name){
        this.name = name;
        this.owner = owner;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public Character getOwner() {
        return owner;
    }

    public void setOwner(Character owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Pets)) return false;

        if (((Pets) obj).getBreed().equals(this.getBreed())) return true;
        else return false;
    }
}
