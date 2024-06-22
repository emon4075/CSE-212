package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class L_8_List {
    public static void main(String[] args) {
        List<String> A = new ArrayList<>();
        A.add("Mango");
        A.add("Gango");
        A.add("Sango");
        System.out.println(A);
        A.add(2, "Pango");
        for (String string : A) {
            System.out.println(string);
        }
        System.out.println(A.isEmpty());
        System.out.println(A.size());
    }
}
