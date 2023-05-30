package SortierenHasen;

import java.util.Comparator;

public class HasenNameComparator implements Comparator<Hase> {

    @Override
    public int compare(Hase o1, Hase o2) {
        //Hasennamen vergleichen
      return  o1.name.compareTo(o2.name);
    }
}
