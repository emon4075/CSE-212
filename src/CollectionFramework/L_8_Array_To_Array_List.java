package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_8_Array_To_Array_List {
    public static void main(String[] args) {
        String[] Colors = { "red", "white", "gray", "yellow", "blue" };
        List<String> L = new ArrayList<>(Arrays.asList(Colors));
        System.out.println(L);
    }
}
