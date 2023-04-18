package ProduktMap;

import java.util.ArrayList;

public class ProduktMain {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Apfel", 10.00);

        p1.setDescription("Produkt 1 von SHop A");
        System.out.println(p1.getPriceWIthDiscount());
        System.out.println(p1);

        Produkt p2 = new Produkt("Birne",20.00);
        p1.setDescription("Produkt 2 von SHop B");

        Produkt p3 = new Produkt("Orange",30.00);
        p1.setDescription("Produkt 3 von SHop B");

        Produkt p4 = new Produkt("Melone",40.00);
        p1.setDescription("Produkt 4 von SHop B");

        System.out.println(p1.equals(p2));

        Shop shop = new Shop();
        shop.add(p1);
        shop.add(p2);
        shop.add(p3);
        shop.add(p4);
        System.out.println(shop.getShop());
        //oder mit
      //  System.out.println(shop.produkte);
        System.out.println("___________________");

        ArrayList<Produkt> produkts = shop.getByPriceFrom(12.00);
        System.out.println(produkts);


        System.out.println("___________________");
        System.out.println("Mit iterator produkt entfernt");
        shop.removeProductsFromByIterator(35.00);
        System.out.println(shop.produkte);


    }
}
