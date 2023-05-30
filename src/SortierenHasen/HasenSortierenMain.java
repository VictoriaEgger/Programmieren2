package SortierenHasen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HasenSortierenMain {
    public static void main(String[] args) {

        Hase h1 = new Hase("Hansi", 10,1);
        Hase h2 = new Hase("Franz", 3,3);
        Hase h3 = new Hase("Fred", 9,2);
        Hase h4 = new Hase("Peter", 1,0);
        Hase o1 = new Osterhase("Ostern", 9,9);


        ArrayList<Hase> hasenrudel = new ArrayList<>();
        hasenrudel.add(h1);
        hasenrudel.add(h2);
        hasenrudel.add(h3);
        hasenrudel.add(h4);
        hasenrudel.add(o1);

        System.out.println(hasenrudel);

        Collections.sort(hasenrudel);
        System.out.println(hasenrudel);

        System.out.println("----------Mit Comparator Namen vergleichen-----");
        Collections.sort(hasenrudel,new HasenNameComparator());
        System.out.println(hasenrudel);


    }


}
