package VererbungOrchester;

public class Geige extends Instrument{

    public Geige(int lauststärke, String name) {
        super(lauststärke, name);
    }

    @Override
    public int play() {
        System.out.println("Die Geige " + getName() + "wird gestrichen.");
        return super.play();
    }
}
