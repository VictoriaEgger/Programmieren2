package Player;

import Player.Player;

import java.util.ArrayList;

public class Team {
    ArrayList<Player> players = new ArrayList<>();
    String name;

    public void addPlayer(Player p){
        players.add(p);
    }

    public int getPointsPerTeam(){
        int sum = 0;
        for (Player p: players) {
            sum= sum + p.getPoints();

        }
           return  sum;
        }






    public Team(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' + getPointsPerTeam() +
                '}';
    }
}
