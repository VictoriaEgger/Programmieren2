package Player;

import java.util.ArrayList;
import java.util.Iterator;

public class Verwaltung {

    ArrayList<Player> players = new ArrayList();

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void removePlayer(Player p) {
        players.remove(p);
    }

    public ArrayList<Player> getPlayerByID(int id) {
        ArrayList<Player> result = new ArrayList<>();

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getId() == id) {
                result.add(players.get(i));
            }

        }
        return result;
    }

//    public int getPointsPerTeam(Team team) {
//        int teampoints = 0;
//
//        for (int i = 0; i < players.size(); i++) {
//            if (players.get(i).getTeam().equals(team)) {
//                teampoints = teampoints + players.get(i).getPoints();
//            }
//
//        }
//        return teampoints;
//    }

    public Player getWinner() {
        Player winner = players.get(0);

        int mostpoints = 0;

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getPoints() > mostpoints) {
                winner = players.get(i);
            }

        }
        return winner;
    }

    public void removePlayer(int id) {
        Iterator<Player> it = players.iterator();
        while (it.hasNext()) {
            Player player = it.next();
            if (player.getId() == id) {
                it.remove();
            }
        }

    }
}
