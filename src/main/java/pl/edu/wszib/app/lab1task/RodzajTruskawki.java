package pl.edu.wszib.app.lab1task;

public enum RodzajTruskawki {

    ANANASOWA("Biale owoce"),
    HONEOYE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanow słodyczy"),
    CHRISTINE("Zaowocuje szybko i obficie"),
    ;
    private final String cecha;
    RodzajTruskawki(final String cecha) {
        this.cecha = cecha;
    }

    public String getCecha() {
        return cecha;
    }
}
