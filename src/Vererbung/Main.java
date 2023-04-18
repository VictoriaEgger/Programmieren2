package Vererbung;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Depp", 33,"Bio", 12345);
        s1.hallo();
        Lektor l1 = new Lektor("Peter", 33,"Uni", "Bio");
        l1.hallo();
        Arbeitnehmer a1 = new Arbeitnehmer("Franz", 33,"Uni");
        a1.hallo();


        Wohngemeinschaft wohngemeinschaft = new Wohngemeinschaft(new Adresse("straße",77,"graz",8888));
        wohngemeinschaft.addPerson(s1);
        wohngemeinschaft.addPerson(l1);
        wohngemeinschaft.addPerson(a1);


    }
}
