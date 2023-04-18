package Fraktion;

public class Fraktion {


    public static int counter = 0;
    private int numerator;
    private int denominator;

    public double toDecimal() {
        return (double) numerator / denominator;
    }


    //könnte auch die generierbare toString methode anpassen
    //und die dann verwenden.
    public void print() {
        System.out.println(numerator + " / " + denominator);
    }


    //b2 ist ein neuer bruch
    // ich will einen bruch zurückhaben. Unsere klasse ist ein bruch. deshalb fraktion
    // deshalb neue Fraktion erstellen wie Array
    public Fraktion multiplicate(Fraktion b2) {
        //b2 bruch mit den
        Fraktion result = new Fraktion(b2.getNumerator() * this.numerator, b2.getDenominator() * this.denominator);
        return result;
    }



    //b2 b3 steht für die erstellten objecte im main, damit ich diese dann eintragen kann
    // und sie miteinander multipliziert werden
    public Fraktion multiplicate(Fraktion b2, Fraktion b3) {
        // die methode zum multiplizieren mit den eigenen werten gibt es schon
        //darum brauche ich keine new Fraktion und kann multiplicate
        return multiplicate(b2).multiplicate(b3);

    }


    public Fraktion(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        counter++;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static int getCounter() {
        return counter;
    }
}
