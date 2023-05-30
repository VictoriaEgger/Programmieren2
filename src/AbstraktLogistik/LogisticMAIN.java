package AbstraktLogistik;

public class LogisticMAIN {
    public static void main(String[] args) {

        Car c1 = new Car("VW", "Blue", 850.50);
        Shirt s1 = new Shirt("Zara", 38, "Pink");

        LogisticManager lm = new LogisticManager();
        lm.addStuff(c1);
        lm.addStuff(s1);

        lm.moveAll();
    }
}
