package AbstraktLogistik;

import java.util.ArrayList;

public class LogisticManager {

    ArrayList<Movable> movables = new ArrayList<>();

    public void addStuff(Movable m){
        movables.add(m);
    }

public void moveAll(){
    for (int i = 0; i < movables.size(); i++){
        movables.get(i).move("Graz");
    }
}
}
