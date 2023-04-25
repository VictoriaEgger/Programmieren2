package VererbungHofer.Hund;

public class DogMain {
    public static void main(String[] args) {
        //Statische Attribute können ohne object(Instanz) verwendet werden.
        System.out.println(Dog.latinname);
        //Hier auch ohne HundeObject möglich
        Dog.printLatinName();

        Beagle snoopy = new Beagle("Snoppy", 30, "Lasagne");
        snoopy.eatsLovedFood();
        snoopy.bellen("Awwwwoooooo");

        Dog dexter = new Dog("Dexter", 7);
        dexter.bellen("wuff wuff");

        //Up-Casting
        //Kann jetzt auf Dog und Beagle zugreifen. Und es wurde nur ein Object erzeugt.
        Beagle freddie = new Beagle("Franz",2,"Gulasch");
        Dog doggo = freddie;

        //bellt wie ein beagle, weil eine beagle instanz auf der dog referenz ist.
        doggo.bellen("wuff");

//DownCasting DANGER ZONE!!

        Dog doggo2 = new Beagle("Hubert", 4, "Spaghetti");
// Will die methoden von Beagle nutzen um lieblingsessen herauszufinden. Aber Hubert ist auf einer Dog Klasse
        // Deshalb downcasten

        Beagle b1 = (Beagle) doggo2;
        b1.eatsLovedFood();
    }
}
