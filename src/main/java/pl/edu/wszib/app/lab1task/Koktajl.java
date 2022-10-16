package pl.edu.wszib.app.lab1task;

public abstract class Koktajl implements Jadalne, Pijalne{

    protected final int kcal;

    public Koktajl(final int kcal){
        this.kcal = kcal;
    }

    @Override
    public void jedz(){
        pij();
    }
}
