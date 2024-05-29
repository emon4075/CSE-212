package STL.Algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> A1 = new ArrayList<>();
        A1.add("Mango");
        A1.add("Orange");
        A1.add("Grapes");
        A1.add("Sugarcane");
        System.out.println(A1);
        Collections.sort(A1);
        // Collections.shuffle(A1);
        System.out.println(A1);
        for (String Fruit : A1) {
            System.out.println(Fruit);
        }
        String KEY = "Grapes";
        System.out.println("Searching For: " + KEY);
        int Result = Collections.binarySearch(A1, KEY);
        if (Result >= 0) {
            System.out.println("Found At: " + Result);
        } else {
            System.out.println("Not Found");
        }
    }
}
