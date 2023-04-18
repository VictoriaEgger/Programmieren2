package Vererbung;

import java.util.ArrayList;

public class Wohngemeinschaft {

    Adresse adresse;
    private ArrayList<Person> personen;

    public Wohngemeinschaft(Adresse adresse) {
        this.adresse = adresse;
        this.personen = new ArrayList<>();
    }


    public ArrayList<Person> getPersonen() {
        return personen;
    }

    public void addPerson(Person p){
        personen.add(p);


    }
}
