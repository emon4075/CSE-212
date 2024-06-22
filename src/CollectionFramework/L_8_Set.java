package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class L_8_Set {
    public static void main(String[] args) {
        Set<String> S = new HashSet<>();
        S.add("EMON");
        S.add("REMON");
        S.add("SEMON");
        System.out.println(S);
        S.toArray();
        for (String string : S) {
            System.out.println(string);
        }
    }

}
