package Event;

import Klassen_Main.Wochentage;

import java.util.Objects;

public class Event {

    private String titel;
    private String ort;
    private double preis;
    private Eventtyp typ;

    public Event(String titel, String ort, double preis, Eventtyp typ) {
        this.titel = titel;
        this.ort = ort;
        this.preis = preis;
        this.typ = typ;

    }

    public Eventtyp getTyp() {
        return typ;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Event{" +
                "titel='" + titel + '\'' +
                ", ort='" + ort + '\'' +
                ", preis=" + preis +
                ", typ=" + typ +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(titel, event.titel) && Objects.equals(ort, event.ort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, ort);
    }
}
