package PrüfungWiederholung;

public class PersonTest {
    public static void main(String[] args) {
        PersonenVerwaltung personenVerwaltung = new PersonenVerwaltung(10);

        personenVerwaltung.fuegePersonHinzu(new Person(1,"Seppl"));
        Person p1 = personenVerwaltung.lieferePersonMitID(1);

        personenVerwaltung.lieferePersonMitID(1);

        personenVerwaltung.entfernePersonMitID(1);
    }
}
