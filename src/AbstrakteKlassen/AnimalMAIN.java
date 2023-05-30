package AbstrakteKlassen;

import java.util.ArrayList;

public class AnimalMAIN {
    public static void main(String[] args) {

       // Animal a = new Animal(); -> Geht nicht weil Abstrakt. Kann keine Instanz erstellen

        Giraffe georg = new Giraffe("Georg", 4,"gelb");
        Papagei pauli = new Papagei("Pauli", 2,"blau");

        georg.präsentiertFlecken();


        //Upcasten auch auf abstrakten basisklassentyp

        Animal g1 = georg;
      //  g1.präsentiertFlecken(); -> Geht nicht weil es jetzt zur Basisklasse Animal gehört. Daher kann ich keine Methoden der Klasse Giraffe nutzen


        //Mit dieser Abstrackten Liste kann ich trotzdem alles
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(pauli);
        zoo.add(georg);

        for (Animal a: zoo){
            a.move(100);
        }




    }
}
