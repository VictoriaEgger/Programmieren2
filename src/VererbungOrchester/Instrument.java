package VererbungOrchester;

public class Instrument implements Comparable<Instrument>{

    private int lauststärke;
    private String name;

    public Instrument(int lauststärke, String name) {
        this.lauststärke = lauststärke;
        this.name= name;
    }


    public int play(){
        System.out.println("Instrument macht Geräusche");
        return getLauststärke();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLauststärke() {
        return lauststärke;
    }

    public void setLauststärke(int lauststärke) {
        this.lauststärke = lauststärke;
    }


    @Override
    public int compareTo(Instrument o) {
        if (lauststärke < o.getLauststärke()){
            return -1;
        }
        if (lauststärke > o.lauststärke){
            return 1;
        }
        return 0;
    }
}
