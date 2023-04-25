package VererbungHase;

public class Osterhase extends Hase{
    public Osterhase(String name) {
        super(name);
    }

    public void verstecktOstereier(){
        System.out.println(getName() + " versteckt Ostereier.");
    }

    @Override
    public void hoppeln() {
        System.out.println(getName() + " muss ganz vorsichtig hoppeln, wegen der vielen Ostereier.");
    }
}
