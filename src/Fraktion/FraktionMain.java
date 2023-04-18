package Fraktion;

public class FraktionMain {
    public static void main(String[] args) {

        Fraktion fraktion = new Fraktion(1,5);
        System.out.println(fraktion.toDecimal());

        fraktion.print();

        Fraktion fraktion1 = new Fraktion(1,5);

        //Ergebniss wird neu benannt, dass bei der methode multiplicate herauskommt
        Fraktion result = fraktion.multiplicate(fraktion1);
        result.print();
//brauche einen dritten bruch für die überladene methode mit b2 und b3
        Fraktion fraktion2 = new Fraktion(1,5);
        //nach der multiplikations methode kann ich gleich die methode für das print aufrufen
        fraktion.multiplicate(fraktion2,fraktion2).print();

        System.out.println("Es wurden bereits " + Fraktion.getCounter() + " erstellt.");
        //Ergebniss is 6. Weil überall bei new die fraktion aufgerufen wird.



    }
}
