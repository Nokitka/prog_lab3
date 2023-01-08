package enumeration;

public enum Location {
    LIVING_ROOM("Гостинная"),
    KIDS_ROOM("Детская"),
    DINING_ROOM("Столовая"),
    ROOF("Крыша"),
    MARKET("Лавка"),
    STREET("Улица"),
    HOUSE("Дом");

    private String tittle;

    Location(String tittle){
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }
}
