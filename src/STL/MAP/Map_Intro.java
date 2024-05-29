package STL.MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Intro {
    public static void main(String[] args) {
        Map<String, Integer> M1 = new TreeMap<String, Integer>();
        // Map<String, Integer> M1 = new HashMap<String, Integer>();
        M1.put("Emon", 28);
        M1.put("Anik", 02);
        M1.put("Saad", 45);
        M1.put("Emran", 19);
        System.out.println(M1);
        System.out.println(M1.get("Emon"));

        for (String MapKey : M1.keySet()) {
            System.out.println(MapKey);
        }
        for (String Value : M1.keySet()) {
            System.out.println(M1.get(Value));
        }
    }
}
