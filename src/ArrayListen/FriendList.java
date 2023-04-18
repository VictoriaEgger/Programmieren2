package ArrayListen;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class FriendList {

    private List<Friends> friends = new ArrayList<>();

    public void addFriend(Friends f) {

        friends.add(f);
    }

    public void print() {
        for (Friends f : friends) {
            System.out.println(f);
        }

        //als for schleife. mit size weil es eine liste ist und kein array
//        for (int i = 0; i < friends.size(); i++){
//            System.out.println(friends.get(i));
//        }

        //eigene methode für for each bei listen
        //  friends.forEach((f) -> System.out.println(f));
    }


    //Überladene Methode für print
    public void print(ArrayList<Friends> friends) {
        for (Friends f : friends) {
            System.out.println(f);
        }
    }

    public ArrayList<Friends> friendsFrom(String city) {
        ArrayList<Friends> result = new ArrayList<>();

        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getCity().equals(city)) {
                result.add(friends.get(i));
            }

        }
        return result;
    }

    public Friends longestFriend() {
        int year = Year.now().getValue();
        Friends oldestFriend = friends.get(0);

        int howlong = year - friends.get(0).getKnownSince();

        for (int i = 0; i < friends.size(); i++) {
            if ((year - friends.get(i).getKnownSince()) > howlong) {
                howlong = year - friends.get(i).getKnownSince();
                oldestFriend = friends.get(i);
            }
        }
        return oldestFriend;
    }

    public void removeFriend(Friends f) {
        friends.remove(f);
    }

    public ArrayList<Friends> friendsAbroad(String homeCountry) {
        ArrayList<Friends> result = new ArrayList<>();
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getCountry().equals(homeCountry)) {
                continue;
            }else { result.add(friends.get(i));}

        }
        return result;
    }
}
