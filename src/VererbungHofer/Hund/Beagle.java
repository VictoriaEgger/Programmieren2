package VererbungHofer.Hund;

public class Beagle extends Dog{
    //Beagle hat jetzt alles was ein hund hat

public String lovedFood;

//Welche informationen brauche ich um einen beagle zu erzeugen? -> Die informationen von hund, deshalb constructor
    //plus eigen eigenschaften
    //Benenung absichtlich anders. Muss nicht gleich heißen wie in der basisklasse
    public Beagle(String name2, int age2, String lovedFood) {
        //super: ist meine basis klasse. ich rufe den konstruktor der basisklasse auf
        super(name2, age2);
        this.lovedFood = lovedFood;
    }
    //Wir können neue Methoden machen die nur ein beagle kann

    public void eatsLovedFood(){
        //können nicht auf name zugreifen weil es private ist bei Dog ->muss ich mit getName() holen.
        //auf protected schon!!! age ist protected.
        System.out.println("The beagle " +getName() + "(Age: " + age +") eats " + lovedFood);
    }

    //Ich kann von bestehenden Methoden, die methoden in einer abgeleiteten Klasse verwenden und verändern-> MethodenÜBERSCHREIBEN


    @Override
    public void bellen(String wuff) {
        System.out.println(getName() + " bellt und jammert: " + wuff);
    }
}
