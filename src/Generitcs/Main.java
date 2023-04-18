package Generitcs;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        //Ich möchte dem Generic Info einen string übergeben, da wo das <T< steht
        Info <String> name = new Info<>("Max", 1);
        Info <Integer> age = new Info<>(30, 2);
        Info <String> adresse = new Info<>("Graz", 2);
       // Info < LocalDateTime> registration = new Info<>(LocalDateTime, 1);


        Profil profil = new Profil(name, age, adresse);
        profil.print();
       // System.out.println(registration.getData());

    }
}
