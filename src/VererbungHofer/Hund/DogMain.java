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
        Beagle freddie = new Beagle("Franz", 2, "Gulasch");
        Dog doggo = freddie;

        //bellt wie ein beagle, weil eine beagle instanz auf der dog referenz ist.
        doggo.bellen("wuff");

//DownCasting DANGER ZONE!!

        Dog doggo2 = new Beagle("Hubert", 4, "Spaghetti");
// Will die methoden von Beagle nutzen um lieblingsessen herauszufinden. Aber Hubert ist auf einer Dog Klasse
        // Deshalb downcasten


        Beagle b1 = (Beagle) doggo2;
        b1.eatsLovedFood();

        Dog rex = new KommisarRex(20);

        //Instanceof OPerator: Überprüft ob Instanz der klasse entspricht


        //schaut ob das objekt doggo2 zur basisklasse hund gehört
        //Kann der Begale dass was ein hund kann?
        if (doggo2 instanceof Dog) {
            System.out.println("jo. is a hund.");
        }

        //Schaut ob das object doggo2 ein beagle ist
        if (doggo2 instanceof Beagle) {
            System.out.println("jo. is a beagle.");
        }

        //nicht so schön. überprüft intsanz genau einer konkreten klasse entspricht
        //klasse entspricht(nicht durch abgeleitete instanz ersetzbar)
        //Bist du Beagle genau ein Hund?

        if (doggo2.getClass().equals(Beagle.class)) {
            System.out.println("Yay auf doggo2 ist wirklich ein Beagle und kein anderer Hund");
        }

        //Get nicht weil doggo2 ein Beagle ist und andere Methoden hat. Ist eine Kindklasse Beagle und keinen Basisklasse Hund
        if (doggo2.getClass().equals(Dog.class)) {
            System.out.println("Yay auf doggo2 ist wirklich ein Hund und kein anderer Hund");
        } else {
            System.out.println("Beagle ist kein Hund - sondern ein Beagle");
        }
    }
}
