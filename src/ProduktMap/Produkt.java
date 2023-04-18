package ProduktMap;

import java.util.Objects;

public class Produkt {


    private String title;
    private double price;
    private double discount;
    private String description;

    public Produkt(String title, double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public Produkt(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "title='" + title + '\'' +
                ", price=" + getPriceWIthDiscount() +
                '}';
    }

    public double getPriceWIthDiscount(){
        double nachgelassenerPreis;
        nachgelassenerPreis = this.price -(this.price*(discount/100));
        return nachgelassenerPreis;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(produkt.price, price) == 0 && Objects.equals(title, produkt.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }
}
