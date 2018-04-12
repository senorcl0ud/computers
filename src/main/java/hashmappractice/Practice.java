package hashmappractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {
        Map<Integer, String> games = new HashMap<>();
         games.put(1,"Person 5");
         games.put(2,"Nier: Automata");
         games.put(3,"Monster Hunter World");
         games.put(4,"Dragonball FighterZ");
         games.put(5, "Rainbow 6: Siege");

        Iterator<Map.Entry<Integer, String>> gameSet = games.entrySet().iterator();

        games.replace(5, "Rainbow 6: Siege", "Fortnite");
        while(gameSet.hasNext()){

            Map.Entry<Integer, String> entry = gameSet.next();
            System.out.println(" Game: " + entry.getValue() + " Music Ranking: " + entry.getKey());


        }
        System.out.println(games.containsKey(4));
        System.out.println(games.containsValue("Brawlhalla" ));
        games.clear();
        System.out.printf("|%- 20d|", 93);

    }
}
