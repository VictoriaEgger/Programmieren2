package VererbungOrchester;

public class OrchesterMAIN {
    public static void main(String[] args) {

        //Hab sie als Typ Instrument ausgegeben. Dadurch kann ich die Methoden der einzelenen Instrumenten nicht nutzen.
        Instrument gitarre = new Gitarre(20,"Fernando");
        Instrument geige = new Geige(30, "Siegfried");
        Instrument klarinette = new Klarinette(50,"Gilbert");
        Instrument trompete = new Trompete(11,"Hubert");

        Orchester orchester = new Orchester();
        orchester.addInstrument(gitarre); // Automatischer UpCast wenn ich oben mit Gitarre new Gitarre gearbeitet hätte
        orchester.addInstrument(geige);
        orchester.addInstrument(klarinette);
        orchester.addInstrument(trompete);

        orchester.playAll();
      //  gitarre.stimmen -> Geht nicht weil ich upgecastet habe! Müsste wieder downcasten.

        Gitarre g = (Gitarre) gitarre; //Downcasten
        g.stimmen(); //jetzt kann ich die gitarre stimmen
       // g.playAsInstrument(); // Gitarre wird nur als Instrument gespielt



    }
}
