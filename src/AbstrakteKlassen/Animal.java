package AbstrakteKlassen;

public abstract class Animal {

    protected String name;
    protected int anzahlBeine;
    protected String augeFarbe;

    public Animal(String name, int anzahlBeine, String augeFarbe) {
        this.name = name;
        this.anzahlBeine = anzahlBeine;
        this.augeFarbe = augeFarbe;
    }

    //Soll bei allen Tieren gleich sein
    public void printAnimalDescription(){
        System.out.println(name + ",Beine: " + anzahlBeine + " , AUgenfarbe: " + augeFarbe);
    }

    //Abstracte Methoden
    public abstract void move(int meter);
    public abstract void makeNoise(String withComment);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
    }

    public String getAugeFarbe() {
        return augeFarbe;
    }

    public void setAugeFarbe(String augeFarbe) {
        this.augeFarbe = augeFarbe;
    }
}
