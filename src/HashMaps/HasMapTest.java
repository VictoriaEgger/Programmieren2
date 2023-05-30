package HashMaps;

import SortierenHasen.Hase;

import java.util.HashMap;
import java.util.Map;

public class HasMapTest {
    public static void main(String[] args) {
        //Wir möchten alle hasen mit einer steuernummer speichern
        //um sie schnell zu finden um korrekt versteuern zu können
        HashMap<String, Hase> steuerHasen = new HashMap<>();

        Hase h1 = new Hase("Hansi", 2 ,2);
        Hase h2 = new Hase("Susi", 3 ,3);

        //In die HashMap einfügen
        steuerHasen.put("123H", h1);
        steuerHasen.put("234H", h2);

        //Element auslesen durch Angabe des Schlüssels
        //Wenn schlüssel nicht vorhanden ist kommt "null" zurück.
        System.out.println(steuerHasen.get("123H"));

        //Fragen ob es diesen spezielen schlüssel in der map gibt
        System.out.println(steuerHasen.containsKey("234H"));

        //Fragen ob es dieses Object schon gibt. ACHTUNG SEHR LANGSAM! Nur im Notfall!!!
        steuerHasen.containsValue(h1);

        //Ersetzt den Hasen 1 mit Hase 2. Jetzt ist der Hase auf 123H UND 234H!!!
        //steuerHasen.put("123H",h2);

        //Über Hashmap drüber iterrieren. Man iterriert über die menge ALLER schlüssel

        for (Map.Entry<String,Hase> hase : steuerHasen.entrySet()){
            System.out.println(hase.getKey());
            Hase h = hase.getValue();
            h.hoppeln();

        }

        //oder so: Hier bekommt man nur den schlüssel

        for (String key : steuerHasen.keySet()){
            System.out.println(key);
            Hase h = steuerHasen.get(key);
            h.hoppeln();
        }


    }
}
