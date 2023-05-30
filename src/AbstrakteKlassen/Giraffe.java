package AbstrakteKlassen;

public class Giraffe extends Animal{
    //Wenn ich jetzt von einer abstrakten Methode ableite kann ich hier oben gleich die Methoden gleich generieren wiels rot is

   protected int anzahlFlecken;

    public Giraffe(String name, int anzahlBeine, String augeFarbe) {
        super(name, anzahlBeine, augeFarbe);
        anzahlFlecken = 40; //Typische Fleckenanzahl von giraffen
    }


    //weiteren constructor wo die Flecken anders sind
    public Giraffe(String name, int anzahlBeine, String augeFarbe, int anzahlFlecken) {
        super(name, anzahlBeine, augeFarbe);
        this.anzahlFlecken = anzahlFlecken;
    }

    public void präsentiertFlecken(){
        System.out.println("Giraffe " + name + " hat " + anzahlFlecken + " Flecken.");
    }

    @Override
    public void move(int meter) {
        System.out.println("Giraffe " + name + " stolziert " + meter + " weit.");

    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println("Schmatz schmatz: " + withComment);

    }


}
