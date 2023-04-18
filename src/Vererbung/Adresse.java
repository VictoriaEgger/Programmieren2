package Vererbung;

public class Adresse {

    private String strasse;
    private int hausnummer;
    private String stadt;
    private int postleitzahl;

    public Adresse(String strasse, int hausnummer, String stadt, int postleitzahl) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.stadt = stadt;
        this.postleitzahl = postleitzahl;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "strasse='" + strasse + '\'' +
                ", hausnummer=" + hausnummer +
                ", stadt='" + stadt + '\'' +
                ", postleitzahl=" + postleitzahl +
                '}';
    }

    public String getStrasse() {
        return strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public String getStadt() {
        return stadt;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }
}
