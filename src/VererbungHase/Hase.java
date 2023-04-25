package VererbungHase;

public class Hase {
    private String name;



    public void schlafen(){
        System.out.println(getName() + " schläft.");
    }

    public void hoppeln(){
        System.out.println(getName() + " hoppelt davon.");
    }

    public void fressen(String futtername){
        System.out.println(getName() + " frisst " + futtername + ".");
    }


    public Hase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
