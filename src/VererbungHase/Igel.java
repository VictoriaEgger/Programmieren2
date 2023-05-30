package VererbungHase;

public class Igel implements GoesToParty{



    //Gehört nicht zur Basisklasse Hase. Durch das interface kann ich totzdem die GoesToParty implementieren und den Igel zur Party hinzufügen.
    //Wäre GoesToParty auch eine BasisKlasse und der Igel wäre schon einer übergeordneten Basisklasse zugeteilt, könnte ich das nicht machen.
    //Deshalb arbeiten wir mit interfaces um die Objecte noch mehr zu erweitern
    @Override
    public void party(String cake, String favDrink) {
        System.out.println("Igel geht zur Party und isst ganz vorsichtig, um niemanden zu stechen.");
    }
}
