package Player;

import java.util.Objects;

public class Player {

    static int counter = 0;
    private int id;
    private String name;
    private Team team;
    private int points;


    public Player(int id, String name, Team team, int points) {
        this.id = counter++;
        this.name = name;
        this.team = team;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team=" + team +
                ", points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
