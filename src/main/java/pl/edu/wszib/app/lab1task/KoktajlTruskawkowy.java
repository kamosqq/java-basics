package pl.edu.wszib.app.lab1task;

public class KoktajlTruskawkowy extends KoktajlSmakowy {

    private final RodzajTruskawki rodzajTruskawki;
    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki
    ) {
        super(kcal, RodzajSmaku.TRUSKAWKOWY);
        this.rodzajTruskawki = rodzajTruskawki;
    }
    @Override
    public void pij() {
        String message = String.format("Pije shake o smaku %s o poziomie slodkosci %d, ktory cechuje %s.",
                smak().toString().toLowerCase(), smak().getPoziomSlodkosci(), rodzajTruskawki.getCecha().toLowerCase());
        System.out.println(message);
    }
}


