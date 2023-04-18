package Klassen_Main;

public class Class {

    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;

    private Wochentage tag; //Day ist die enum klasse von wo ich die einzelnen wochentage aufrufe.

    public Class(String name, int hours, int maxCapacity) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        enrolledStudents = 0;
    }


    //überladener konstrukter mit zusätzlichen wochentag hinzugefügt
    public Class(String name, int hours, int maxCapacity, Wochentage tag) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        enrolledStudents = 0;
        this.tag = tag;
    }

    public void enroll(){
        enrolledStudents++;
    }

    public boolean maxCapacityReached(){
        boolean frei = false;
        if(enrolledStudents < maxCapacity){
            frei = true; }
        else {
            frei = false;
        }
        return frei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public Wochentage getTag() {
        return tag;
    }
}
