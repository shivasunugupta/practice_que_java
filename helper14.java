import java.util.Map;
import java.util.TreeMap;

public class helper14
{
    public static void main(String[] args) {
        TreeMap <String,Integer> tm = new TreeMap<>();

//        a) to associate the specified value with the specified key in a Tree Map.
        tm.put("a",1);
        tm.put("b",2);
        tm.put("c",3);

//        b) to copy Tree Map's content to another Tree Map.
        TreeMap <String,Integer> tm2 = new TreeMap<>();
        tm2.putAll(tm);

//        c) to search for a key in a Tree Map.
        System.out.println(tm.containsKey("a"));

//        d) to search for a value in a Tree Map.
        System.out.println(tm.containsValue(4));

//        e) to get all keys from a Tree Map.
        System.out.println(tm);

//        f) to delete all elements from a Tree Map.
        tm.clear();

//        g) to get the first (lowest) key and the last (highest) key currently in a map.
        System.out.println("fisrt key "+tm.firstKey());
        System.out.println("last key " +tm.lastKey());

    }
}
