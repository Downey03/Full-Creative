import java.util.*;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(5);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.contains(5));
        arrayList.remove(0);

        System.out.println(arrayList);

        linkedList.add(5);
        linkedList.add(6);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.contains(5));
        linkedList.remove();

        System.out.println(linkedList);

    }
}
