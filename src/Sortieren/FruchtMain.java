package Sortieren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FruchtMain {
    public static void main(String[] args) {

        Frucht f1 = new Frucht("Mango", 350,true);
        Frucht f2 = new Frucht("Banane", 120,true);
        Frucht f3 = new Frucht("Ananas", 700,true);
        Frucht f4 = new Frucht("Oapfl", 200,true);

        Frucht[] fruchtsalat = {f1,f2,f3,f4};

        //Nichts Sortiert
        System.out.println(Arrays.toString(fruchtsalat));


        //Sortiert
        Arrays.sort(fruchtsalat);
        System.out.println(Arrays.toString(fruchtsalat));


        //Sortieren als ArrayListe
        ArrayList<Frucht> fruchtsalatliste = new ArrayList<>();
        fruchtsalatliste.add(f1);
        fruchtsalatliste.add(f2);
        fruchtsalatliste.add(f3);
        fruchtsalatliste.add(f4);

        System.out.println(fruchtsalatliste);

        Collections.sort(fruchtsalatliste);

        System.out.println(fruchtsalatliste);

    }
}
