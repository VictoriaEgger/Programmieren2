package VererbungKrankenhaus;

public class KrankenhausMAIN {
    public static void main(String[] args) {
        Krankenhaus krankenhaus = new Krankenhaus();

        Arzt a1 = new Arzt("Sep",1800);
        SpezialisierterArzt a2 = new SpezialisierterArzt("Ferdinand",19000, 50);

        krankenhaus.addArzt(a1);
        krankenhaus.addArzt(a2);

        krankenhaus.print();

    }
}
