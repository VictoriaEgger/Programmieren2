package Vererbung;

public class Arbeitnehmer extends Person{
    private String arbeitgeber;

    public Arbeitnehmer(String name, int alter, String arbeitgeber) {
        super(name, alter);
        this.arbeitgeber = arbeitgeber;
    }

    public void hallo(){
        System.out.println("Hallo bin der arbeitgeber");
    }
}
