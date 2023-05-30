package VererbungOrchester;

public class Gitarre extends Instrument{

    public Gitarre(int lauststärke, String name) {
        super(lauststärke, name);
    }

    @Override
    public int play() {
        System.out.println("Die Gitarre " + getName() + " wird gespielt");
        return play();
    }

    public void stimmen(){
        System.out.println("Gitarre wird gestimmt");
    }

}
