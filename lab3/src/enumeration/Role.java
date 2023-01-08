package enumeration;

public enum Role {
    MOTHER("Мама"),
    DAD("Отец"),
    DOTHER("Дочь"),
    SON("Сын");

    private String tittle;

    Role(String tittle){
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }
}
