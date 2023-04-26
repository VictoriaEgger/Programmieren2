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

    //brauche kein implements GoesToParty weil das extent Hase schon das drinnen hat

    @Override
    public void party(String cake, String favDrink) {
        System.out.println("Der Weihnachtshase " + getName() + " bring ganz viel Geschenke mit.");
    }
}
