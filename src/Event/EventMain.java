package Event;

import java.util.ArrayList;

public class EventMain {
    public static void main(String[] args) {
        Event e1 = new Event("MastersOfDirt", "Schwarzlsee", 80.90,Eventtyp.REISE);
        Event e2 = new Event("Hundeausstellung", "Messe Graz", 19.50, Eventtyp.VORTRAG);
        Event e3 = new Event("Indie Konzert", "Wien Gasometer", 30.00, Eventtyp.KONZERT);

        Eventkalender kalender = new Eventkalender();
        kalender.addEvent(e1);
        kalender.addEvent(e2);
        kalender.addEvent(e3);


        System.out.println(kalender.getByOrt("Schwarzlsee"));
        System.out.println(kalender.getByTitle("Indie Konzert"));
        System.out.println(kalender.getMostExpensive());

        ArrayList<Event> ort = kalender.getByOrt("Schwarzlsee");
        kalender.print(ort);

        System.out.println(e1.equals(e2));

    }


}
