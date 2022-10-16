package pl.edu.wszib.app.lab1task;

public class KoktajlTruskawkowy extends Koktajl implements Smak {

    private final RodzajTruskawki rodzajTruskawki;
    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki
    ) {
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
    }
    @Override
    public String smak() {
        return "Truskawkowy";
    }
    @Override
    public void pij() {
        String message = String.format("Pije shake o smaku %s, którą cechuje %s", smak(), rodzajTruskawki.getCecha());
        System.out.println(message);
    }
}


