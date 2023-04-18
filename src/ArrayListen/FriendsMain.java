package ArrayListen;

import java.util.*;

public class FriendsMain {
    public static void main(String[] args) {
        Friends adam = new Friends("Adam", 30,"Graz", "Austria", 2016);
        Friends sophia = new Friends("Sophie", 29,"Linz", "Austria", 2013);
        Friends felix = new Friends("Felix", 30,"Graz", "Austria", 2016);
        Friends gulliver = new Friends("Gulliver", 30,"Rom", "Italy", 2016);


        //Es wurde keine größe in der Klasse Friendslist definiert für diese ArrayListe
        //Ich kann jetzt einfach freunde hinzufügen, soviele ich will.
        FriendList friendList = new FriendList();
        friendList.addFriend(adam);
        friendList.addFriend(sophia);
        friendList.addFriend(felix);
        friendList.addFriend(gulliver);


        friendList.print();
        System.out.println("__________");
       System.out.println(friendList.friendsFrom("Graz"));

        System.out.println("___________");
        ArrayList<Friends> from = friendList.friendsFrom("Graz");
        friendList.print(from);

        System.out.println("__________");

        ArrayList<Friends> notfrom = friendList.friendsAbroad("Austria");
        friendList.print(notfrom);


        Set<String> names = new HashSet<>();
        names.add("Fred");
        names.add("Hannes");
        names.add("Olaf");
        names.add("Fred");
        System.out.println(names);

        Map<String, Integer> phonenr = new HashMap<>();
        phonenr.put("David", 1234);
        phonenr.put("Manuel", 4543);
        phonenr.put("Peter", 8888);

    }
}
