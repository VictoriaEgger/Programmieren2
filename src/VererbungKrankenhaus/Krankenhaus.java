package VererbungKrankenhaus;

import Event.Event;

import java.util.ArrayList;

public class Krankenhaus {

    ArrayList<Arzt> ärzte = new ArrayList<>();

    public void addArzt(Arzt arzt) {
        ärzte.add(arzt);
    }

    public ArrayList<Arzt> getÄrzte() {
        return ärzte;
    }


    public void print() {
        for (Arzt a : ärzte) {
            System.out.println(a.getName() + " verdient " + a.getGehalt());
        }
    }
}
