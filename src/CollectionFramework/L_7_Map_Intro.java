package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L_7_Map_Intro {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        // for (int i = 0; i < 2; i++) {
        // System.out.print("Enter Your ID: ");
        // int id = scanner.nextInt();
        // scanner.nextLine();
        // System.out.print("Enter Your Name: ");
        // String name = scanner.nextLine();
        // map.put(name, id);
        // }
        map.put("Emon", 28);
        map.put("Emona", 82);
        System.out.println(map);
        // map.remove("Emona");
        // System.out.println(map);

        System.out.println("Emon ID: " + map.get("Emon"));
        System.out.println("Emran ID: " + map.containsKey("Emran"));
        for (String string : map.keySet()) {
            System.out.println(map.get(string));
        }
        scanner.close();
    }
}
