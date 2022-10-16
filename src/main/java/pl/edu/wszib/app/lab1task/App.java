package pl.edu.wszib.app.lab1task;

public class App {
    public static void main(String[] args) {
        KoktajlTruskawkowy shake = new KoktajlTruskawkowy(300, RodzajTruskawki.ANANASOWA);
        shake.pij();

        RodzajTruskawki rodzajTruskawki = RodzajTruskawki.ANANASOWA;
        String opis = switch(rodzajTruskawki){
            case ANANASOWA -> {
                yield "opis";
            }
            case KENT -> {
                yield "opis";
            }
            case POLKA -> {
                yield "opis";
            }
            case HONEOYE -> {
                yield "opis";
            }
            case CHRISTINE -> {
                yield "opis";
            }
        };

    }
}
