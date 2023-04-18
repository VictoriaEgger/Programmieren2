package Vererbung;

public class Student extends Person {

    private String Studium;
    private int matrikelnummer;

    public Student(String name, int alter, String studium, int matrikelnummer) {
        super(name, alter);
        Studium = studium;
        this.matrikelnummer = matrikelnummer;

    }

    public void hallo(){
        System.out.println("Ich bin ein Student");
        //Überschreibt die gleiche methode von der klasse person
    }
}
