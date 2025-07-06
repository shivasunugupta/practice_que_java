import java.util.*;

public class helper13 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

//        a) To associate the specified value with the specified key in a HashMap.
        map.put("India", 120);
        map.put("China", 110);
        map.put("USA", 30);
        System.out.print(map + " ");
        System.out.println();

//        b) To count the number of key-value (size) mappings in a map.
        System.out.println(map.size());

//        c) To copy all mappings from the specified map to another map.
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Singapore", 4);
        map2.put("japan", 10);
        map2.put("Russia", 30);
        map2.putAll(map);
        System.out.print("map 2 -> " + map2 + " ");

//        d) To remove all mappings from a map.
        map.clear();

//        e) To check whether a map contains key-value mappings (empty) or not.
        System.out.println( map2.containsKey("Russia"));

//        f) To get a collection view of the values contained in this map.
        System.out.println( map2.containsValue(10));

    }
}