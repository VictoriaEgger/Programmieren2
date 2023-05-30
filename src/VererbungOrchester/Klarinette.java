package VererbungOrchester;

public class Klarinette extends Instrument {
    public Klarinette(int lauststärke, String name) {
        super(lauststärke, name);
    }

    @Override
    public int play() {
        System.out.println("Die Klarinette " + getName() + " wird gespielt.");
        return super.play();
    }


}
