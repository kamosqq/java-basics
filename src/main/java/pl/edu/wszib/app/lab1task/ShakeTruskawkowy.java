package pl.edu.wszib.app.lab1task;

public class ShakeTruskawkowy extends Shake implements Smak {

    @Override
    public void smak() {
        System.out.println("o smaku truskawkowym");
    }
    @Override
    public void pij() {
        System.out.println("Pije shake");
    }
}


