package VererbungHase;

import java.util.ArrayList;

public class Hasenstall {

    ArrayList<Hase> hasen = new ArrayList<>();


    public void addHase (Hase h){
        hasen.add(h);
    }

    public void alleHasenHüpfen(){

     for (int i = 0; i < hasen.size(); i++){
         hasen.get(i).hoppeln();
     }
     //oder mit foreach
//        for (Hase h : hasen){
//            h.hoppeln();
//        }

    }
}
