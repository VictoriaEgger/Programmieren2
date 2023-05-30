package SortierenHasen;

public class Osterhase extends Hase {
    public Osterhase(String name, int alter,int karotten) {
        super(name, alter,karotten);
    }

    public void verstecktOstereier(){
        System.out.println(getName() + " versteckt Ostereier.");
    }

    @Override
    public void hoppeln() {
        System.out.println(getName() + " muss ganz vorsichtig hoppeln, wegen der vielen Ostereier.");
    }
}
