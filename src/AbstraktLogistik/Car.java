package AbstraktLogistik;

public class Car implements Movable{
    private String typ;
    private String color;
    private double weight;

    public Car(String typ, String color, double weight) {
        this.typ = typ;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println(color + typ + " moves to " + destination);
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
