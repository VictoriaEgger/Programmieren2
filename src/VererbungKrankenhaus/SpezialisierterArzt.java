package VererbungKrankenhaus;

public class SpezialisierterArzt extends Arzt{
    private double zuschlag;

    public SpezialisierterArzt(String name, double gehalt, double zuschlag) {
        super(name, gehalt); // bezieht sich im hintergrund audf die arzt klasse
        this.zuschlag = zuschlag;
    }

    public double getGehalt(){
        return super.getGehalt()* (1+ zuschlag);
        //braucht super weil es sonst das getGehalt vom spezialisiertan arzt nimmt
        //wir wollen aber das gehalt von der klasse arzt
        //sonst ist es wie eine recursion die sich immer selber aufruft
        // mit dem super wird es aber umgangen
    }
}
