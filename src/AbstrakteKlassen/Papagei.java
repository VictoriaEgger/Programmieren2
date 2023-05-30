package AbstrakteKlassen;

public class Papagei extends Animal{




    public Papagei(String name, int anzahlBeine, String augeFarbe) {
        super(name, anzahlBeine, augeFarbe);
    }

    @Override
    public void move(int meter) {
        System.out.println("Papagei " + name + " fliegt " + meter + " Meter weit.");

    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println("Papagei spricht: " + withComment);

    }
}
