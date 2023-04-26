package VererbungHase;

public class Hase implements GoesToParty{
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

    @Override
    public void party(String cake, String favDrink) {
        System.out.println(name + " geht zur Party und isst " + cake + " und trinkt " + favDrink + ".");
    }
}
