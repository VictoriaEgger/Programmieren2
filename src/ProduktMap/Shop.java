package ProduktMap;

import java.util.*;

public class Shop {

    HashMap<String, Produkt> produkte = new HashMap<>();

    public void add(Produkt p){
     produkte.put(p.getTitle(),p);
    }

    public Produkt get(String title) {
        Produkt p = produkte.get(title);

        if (p == null) {
            System.out.println("Produkt nicht vorhanden");
        }
        return p;
    }

    public HashMap<String, Produkt> getShop(){
        return produkte;
    }


//        ArrayList<Produkt> result = new ArrayList<>();
//        for (Map.Entry<String, Produkt> entry : produkte.entrySet()){
//            if (entry.getValue().equals(p)){
//                System.out.println(result.add(entry.getValue()));}
//            else {
//                System.out.println("Produkt nicht vorhanden");
//            }
//        }
//    }

    public ArrayList<Produkt> getByPriceFrom(double from){
        ArrayList<Produkt> result = new ArrayList<>();
        for (Map.Entry<String,Produkt> entry : produkte.entrySet()){
            if (entry.getValue().getPrice() > from){
                result.add(entry.getValue());
            }
        }
        return result;

        //oder

//        for (String key : produkte.keySet()){
//            Produkt p = produkte.get(key);
//            if (p.getPrice() < from){
//                result.add(p);
//            }
//        }
    }

    public ArrayList<Produkt> getByPriceTo(double to){
        ArrayList<Produkt> result = new ArrayList<>();
        for (Map.Entry<String,Produkt> entry : produkte.entrySet()){
            if ((entry.getValue().getPrice() < to)){
                result.add(entry.getValue());
            }
        }
        return result;
    }

    public void removeProductsFromByIterator(double from){
        Iterator<Produkt> it = produkte.values().iterator();
            while (it.hasNext()){
                Produkt produkt = it.next();
                if (produkt.getPrice() > from){
                    it.remove();
            }
        }
    }

    public void removeProductFromKeySet(double from){

        //Ich kann keine remove machen in einer map mit forschleife. gleiches problem wie
        // bei equales.
        // extra ein set erstellen. dann aknn ich die werte dort einfügen und
        // dann removeAll verwenden.
        Set<String> keys = new HashSet<>();
        for (Produkt p : produkte.values()){
            if (p.getPrice() > from){
                keys.add(p.getTitle());
            }
        }
        produkte.keySet().removeAll(keys);

//        for (String key : produkte.keySet()){
//            Produkt p = produkte.get(key);
//            if (p.getPrice() > from){
//                produkte.;
//                System.out.println(p.getTitle() + " has been removed");
//            }
//
//        }
    }




    //Auf die values zugreifen
    public boolean gibstGratis(){
        for (Produkt p : produkte.values()){
            if (p.getDiscount() == 100){
                return true;
            }
        }

        //Über den key
        for (String key : produkte.keySet()){
            Produkt p = produkte.get(key);
            if (p.getDiscount() == 100){
                return true;
            }
        }

        //für Array Listen
        for (Map.Entry<String, Produkt> entry : produkte.entrySet()){
            Produkt p = entry.getValue();
            if (p.getDiscount() == 100){
                return true;
            }
        }
        return false;
    }


}
