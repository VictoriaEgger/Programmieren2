package VererbungHofer.Hund;

public class Dog {
    public static String latinname = "Canis Lupus Familiaris";
    // Statisches attribute. Gibt es nur einmal, egal wieviele Hunde ich erstelle.
    private String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Diese Methode hat nix mit vererbung zu tun. Exkurs static
    //Statische Methoden dürfen nur auf lokale Variablen und statische Attribute zugreifen.
    public static void printLatinName(){
        System.out.println(latinname);

    }

    public void bellen(String wuff){
        System.out.println(name + " bellt: " + wuff);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
