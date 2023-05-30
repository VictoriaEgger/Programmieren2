package SortierenHasen;


public class Hase implements Comparable<Hase>{
    protected String name;
    protected int alter;
    protected int karotten;


    public void schlafen() {
        System.out.println(getName() + " schläft.");
    }

    public void hoppeln() {
        System.out.println(getName() + " hoppelt davon.");
    }

    public void fressen(String futtername) {
        System.out.println(getName() + " frisst " + futtername + ".");
    }


    public Hase(String name, int alter, int karotten) {
        this.name = name;
        this.alter = alter;
        this.karotten = karotten;
    }

    public int getKarotten() {
        return karotten;
    }

    public void setKarotten(int karotten) {
        this.karotten = karotten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Hase{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", karotten=" + karotten +
                '}';
    }

    @Override
    public int compareTo(Hase o) {
        if (this.alter < o.alter){return -1;}
        if (this.alter > o.alter){return 1;}
        //Ab hier weis ich dass das alter woll gleich sein muss

        if (this.karotten < o.karotten){return -1;}
        if (this.karotten > o.karotten){return 1;}
        return 0;

        //Ich kann zum zahlenvergleich oder bei strings auch diese benutzen
    }

    public static void haseHallo(){
        System.out.println("Hase sagt hallo");
    }

}
