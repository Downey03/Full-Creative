import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();

        hashMap.put('z',1);
        hashMap.put('f',2);
        hashMap.put('q',3);

        System.out.println(hashMap);

        treeMap.put('b',1);
        treeMap.put('c',2);
        treeMap.put('a',3);

        System.out.println(treeMap);

        linkedHashMap.put('j',1);
        linkedHashMap.put('r',2);
        linkedHashMap.put('b',3);

        System.out.println(linkedHashMap);
    }
}
