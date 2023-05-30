package VererbungOrchester;

import java.util.ArrayList;

public class Orchester {

    ArrayList<Instrument> instrumente = new ArrayList<>();

    public void addInstrument(Instrument s) {
        instrumente.add(s);
    }

    public int playAll() {
        int sumAll = 0;
        for (int i = 0; i < instrumente.size(); i++) {
            sumAll += instrumente.get(i).play();
            // instrumente.get(i).play();
          //  sumAll = sumAll + instrumente.get(i).getLauststärke();
        }
        System.out.println("Gesamte Lautstärke aller Insrtumente ist: " + sumAll);
        return sumAll;
    }
}
