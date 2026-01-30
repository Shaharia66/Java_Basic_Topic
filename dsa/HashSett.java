import java.util.HashSet;
import java.util.Iterator;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println(set);

        System.out.println(set.size());

        if (set.contains(3)) {
            System.out.println("find it ");
        }
        if (!set.contains(7)) {
            System.out.println("does not find ");
        }

        set.remove(3);
        System.out.println(set);

        Iterator<Integer> it=set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}