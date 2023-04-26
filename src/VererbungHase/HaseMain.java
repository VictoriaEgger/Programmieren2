package VererbungHase;

import java.util.ArrayList;

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

        System.out.println();
        System.out.println("-------HasenParty---------");
        //Eine kleine Party
        //Alle in einer Arrayliste speichern die zu einer Party gehen
        ArrayList<GoesToParty> partyPeople = new ArrayList<>();
        partyPeople.add(h1);
        partyPeople.add(osterhase);
        partyPeople.add(weihnachtshase);
partyPeople.add(new Hase("Bernhard"));
partyPeople.add(new Igel());

for (GoesToParty p : partyPeople){
    p.party("Karottenkuchen", "Erdbeermilch");
}

    }
}
