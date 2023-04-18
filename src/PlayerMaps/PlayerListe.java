package PlayerMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlayerListe {

    HashMap<Player, Integer> player = new HashMap<>();

    public void addOrUpdate(Player p, int points) {
        Integer spielerVorhanden = player.get(p);
        if (spielerVorhanden == null) {

            player.put(p, points);
        } else {
            player.put(p, player.get(p) + points);
        }
    }

    public HashMap<Player, Integer> getPlayer() {
        return player;
    }

    public ArrayList<Player> getPlayerWithPoints(int points){
ArrayList <Player> result = new ArrayList<>();
for(Map.Entry<Player, Integer> entry : player.entrySet()){
    if (entry.getValue() > points){
        result.add(entry.getKey());
    }
}

//oder
//        for (Player p : player.keySet()){
//            if (player.get(p) > points){
//                result.add(p);
//            }
//        }
return result;
    }
}

