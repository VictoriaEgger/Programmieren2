package VererbungHase;

public class HaseMain {
    public static void main(String[] args) {
        Hase h1 = new Hase("Hoppel");
        Hase weihnachtshase = new Weihnachtshase("Chris Kringl");
        Hase osterhase = new Osterhase("Peter Hase");

        Hasenstall hasenstall = new Hasenstall();
        hasenstall.addHase(h1);
        hasenstall.addHase(weihnachtshase);
        hasenstall.addHase(osterhase);

        weihnachtshase.hoppeln();
        h1.hoppeln();
        osterhase.hoppeln();
        hasenstall.alleHasenHüpfen();
    }
}
