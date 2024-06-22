package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L_9_Collections {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(100);
        L.add(10);
        L.add(50);
        L.add(60);
        L.add(40);
        System.out.println(L);
        Collections.sort(L);
        System.out.println(L);
        System.out.println("Max In The List: " + Collections.max(L));
        System.out.println("Min In The List: " + Collections.min(L));
        // Collections.shuffle(L);
        // System.out.println(L);

        /*
         * Binary Search
         */

        int Result = Collections.binarySearch(L, 69);
        if (Result >= 0) {
            System.out.println("Found At: " + Result);
        } else {
            System.out.println("Not Found");
        }
        Collections.reverse(L);
        System.out.println(L);
    }
}