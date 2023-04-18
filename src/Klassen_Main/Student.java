package Klassen_Main;

import java.util.Arrays;

public class Student {

    public static int counter = 0;
    public int nonStaticCounter = 0;
    private String firstname;
    private String lastname;
    private Class[] classes;

    public int id;

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.classes = new Class[3];
     //   counter++; //statische variable wird immer hochgezählt
        nonStaticCounter++;
        this.id = counter++; // heißt das jeder student der erstellt wird einen id zugewisen bekommt.
        // dieser zahl wird vom statischen counter genommen, der jedesmal hochzählt wenn ein neuer student erstellt wird.
    }

    public void anwelchenTagenUnterricht(){
        System.out.println("Student  " + this.lastname + " hat Unterricht am: ");

        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null){
                System.out.println(classes[i].getTag() + " (" + classes[i].getName() + ")");
            }

        }
    }



    public void enroll(Class c) {

        if (alreadyEnrolled(c)) return;


        if (c.maxCapacityReached()) {
//bezieht sich auf die Klasse Class.
// Wenn dort maxcapacity kein boolean ist,
// dann funktioniert die bedinung nicht.
            for (int i = 0; i < classes.length; i++) {
                if (classes[i] == null) {
                    c.enroll(); //sagt der klasse das ein neuer student hinzugefügt wird
                    classes[i] = c; // an dieser stelle im array wird jetzt ein student hinzugefügt
                }
            }
        } else {
            System.out.println("Nix frei");

        }
    }

    private boolean alreadyEnrolled(Class c) {
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null) {
                if (classes[i].getName().equals(c.getName())) {
                    System.out.println(c.getName() + "bereits angemeldet");
                    return true;
                }

            }
        }
        return false;
    }


    public void printClass() {
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null) {
                System.out.println(classes[i].getName());
            } else {
                System.out.println(classes[i]);
            }
        }

    }


    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", classes=" + Arrays.toString(classes) +
                '}';
    }

    public static int getCounter() {
        return counter;
    }

    public int getNonStaticCounter() {
        return nonStaticCounter;
    }

    public int getId() {
        return id;
    }
}


