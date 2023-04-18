package PrüfungWiederholung;

public class PersonenVerwaltung {

    private Person[] personen = new Person[0]; // muss initialisiert werden


    //oder über einen methode initialisieren
    public PersonenVerwaltung(int anzahl){
        personen = new Person[anzahl];
    }

    public void fuegePersonHinzu(Person p){
        for (int i = 0; i < personen.length; i++) {
            if (personen[i] == null){
                personen[i] = p;
                break;
            }

        }
    }

    public Person lieferePersonMitID(int id){
        for (int i = 0; i < personen.length; i++) {
            if (personen[i].getId() == id){
                return personen[i];
            }

        }
        return null;
    }

    public void entfernePersonMitID(int id){
        for (int i = 0; i < personen.length; i++) {
            if (personen[i] != null){
                if (personen[i].getId() == id){
                    personen[i] = null;
                    break;
                }
            }

        }
    }
}
