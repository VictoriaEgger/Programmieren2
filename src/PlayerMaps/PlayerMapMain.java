package PlayerMaps;

public class PlayerMapMain {
    public static void main(String[] args) {

        PlayerListe playerListe = new PlayerListe();
        Player p1 = new Player("Hansi");
        Player p2 = new Player("Astrid");

        playerListe.addOrUpdate(p1, 80);
        playerListe.addOrUpdate(p2, 100);
        System.out.println(playerListe.getPlayer());
        playerListe.addOrUpdate(p1, 80);
        System.out.println(playerListe.getPlayer());

        System.out.println(playerListe.getPlayerWithPoints(100));
    }
}
