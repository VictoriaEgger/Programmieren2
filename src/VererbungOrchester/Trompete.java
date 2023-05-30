package VererbungOrchester;

public class Trompete extends Instrument{
    public Trompete(int lauststärke, String name) {
        super(lauststärke, name);
    }

    @Override
    public int play() {
        System.out.println("Die Trompete " + getName() + " wird gespielt.");
        return super.play();
    }


}
