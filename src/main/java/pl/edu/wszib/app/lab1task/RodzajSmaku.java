package pl.edu.wszib.app.lab1task;

public enum RodzajSmaku {
    TRUSKAWKOWY("Truskawkowy", 4),
    BANANOWY("Bananowy", 3),
    SZPINAKOWY("Szpinakowy", 2),
    CIASTECZKOWY("Ciasteczkowy", 5),
    JABLKOWY("Jablkowy", 1),
    ;

    private final int poziomSlodkosci;
    private final String opis;

    RodzajSmaku(final String opis, final int poziomSlodkosci) {
        this.opis = opis;
        this.poziomSlodkosci = poziomSlodkosci;

    }

    public int getPoziomSlodkosci() {
        return poziomSlodkosci;
    }
}
