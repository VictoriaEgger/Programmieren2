package Klassen_Main;

public class MainErstellen {
    public static void main(String[] args) {
        Class k1 = new Class("Test",10,10);
        k1.enroll();
        k1.maxCapacityReached();
        Student s1 = new Student("Pep","pep");
        Student s2 = new Student("Sep", "Dep");


        //System.out.println( Student.getCounter());
      //  System.out.println(s1.getNonStaticCounter());
        System.out.println(s1.getId());
        System.out.println(s2.getId());

//Wochentag hinzufügen
        Class k2 = new Class("DB",10,10, Wochentage.Montag);

        System.out.println(k2.getTag());




    }
}
