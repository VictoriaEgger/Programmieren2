package AbstraktLogistik;

public class Shirt implements Movable{
    private String brand;
    private int size;
    private String color;

    public Shirt(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public void move(String destination) {
        System.out.println(brand + color + ", Size: " + size + " moves to " + destination);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
