package pl.edu.wszib.app.lab1task;

public abstract class KoktajlSmakowy extends Koktajl implements Smakowalny{

    private final RodzajSmaku rodzajSmaku;
    public KoktajlSmakowy(int kcal, RodzajSmaku rodzajSmaku) {
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    }
    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }
}
