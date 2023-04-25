package VererbungHofer.Hund;

public class KommisarRex extends Dog{

    //Ich muss nicht zu 100% alle parameter weiter weitergeben. ZB Kommisar Rex ist immer Rex. Also wir der Name automtisch inzugefügt
    // Das gleiche wenn ich etwas gleich im konstruktor berechnen will. zb ich erstelle ein quadrat und mache gleich eine umfangberechnung im konstruktor
    public KommisarRex(int age) {
        super("Rex", age);
    }
}
