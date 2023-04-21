import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<Character> hashSet = new HashSet<>();
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Character> treeSet = new TreeSet<>();

        hashSet.add('e');
        hashSet.add('b');
        hashSet.add('s');

        System.out.println(hashSet);

        treeSet.add('u');
        treeSet.add('f');
        treeSet.add('m');

        System.out.println(treeSet);

        linkedHashSet.add('r');
        linkedHashSet.add('z');
        linkedHashSet.add('n');

        System.out.println(linkedHashSet);
    }
}
