package Event;

import java.util.ArrayList;
import java.util.Iterator;

public class Eventkalender {

    private ArrayList<Event> events = new ArrayList();

    public void addEvent(Event e) {
        events.add(e);
    }

    public void print() {
        for (Event e : events){
            System.out.println(e);
        }
     //   events.forEach((e) -> System.out.println(e));

    }

    public void print(ArrayList<Event> events) {
        for (Event e : events){
            System.out.println(e);
        }

       // events.forEach((e) -> System.out.println(e));

    }

    public ArrayList<Event> getByTitle(String title) {
        ArrayList<Event> result = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getTitel().equals(title)) {
                result.add(events.get(i));
            }
        }
        return result;
    }

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> resultOrt = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getOrt().equals(ort)) {
                resultOrt.add(events.get(i));
            }
        }
        return resultOrt;
    }

    public ArrayList<Event> getByTyp(String typ) {
        ArrayList<Event> resultTyp = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getTyp().equals(typ)) {
                resultTyp.add(events.get(i));
            }
        }
        return resultTyp;
    }

    public Event getMostExpensive() {
        Event mostExpensiveEvent = events.get(0);

        double mostExpensive = events.get(0).getPreis();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getPreis() > mostExpensive) {
                mostExpensiveEvent = events.get(i);
            }

        }
        return mostExpensiveEvent;
    }

    public void removeMostExpensive(double limit){
        Iterator<Event> it = events.iterator();
        while (it.hasNext()){
            Event event = it.next();
            if (event.getPreis() > limit){
                it.remove();
            }
        }
    }

}
