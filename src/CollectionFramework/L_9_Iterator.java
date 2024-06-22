package CollectionFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class L_9_Iterator {
    public static void main(String[] args) {
        Set<Integer> S = new TreeSet<>();
        S.add(100);
        S.add(10);
        S.add(50);
        S.add(70);
        S.add(80);
        S.add(90);
        Iterator<Integer> IT = S.iterator();

        while (IT.hasNext()) {
            if (IT.next() < 70) {
                IT.remove();
            }
        }
        System.out.println(S);
    }
}