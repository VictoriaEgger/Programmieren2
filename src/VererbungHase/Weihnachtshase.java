package VererbungHase;

public class Weihnachtshase extends Hase{
    public Weihnachtshase(String name) {
        super(name);
    }

    public void verteileGeschenke(){
        System.out.println(getName() + " verteilt Geschenke.");
    }

    @Override
    public void hoppeln() {
        System.out.println(getName() + " hoppelt mit dem Geschenkesack durch die Gegend.");
    }
}
