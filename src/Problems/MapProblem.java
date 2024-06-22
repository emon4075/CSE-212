package Problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MapProblem {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String Doc_1 = S.nextLine();
        String[] token1 = Doc_1.split(" ");
        Set<String> ST1 = new HashSet<String>();
        for (int i = 0; i < token1.length; i++) {
            ST1.add(token1[i]);
        }
        String Doc_2 = S.nextLine();
        String[] token2 = Doc_2.split(" ");
        Set<String> ST2 = new HashSet<String>();
        for (int i = 0; i < token2.length; i++) {
            ST2.add(token2[i]);
        }
        int Similar = 0;
        for (String S1 : ST2) {
            for (String S2 : ST1) {
                if (S1.equals(S2)) {
                    Similar++;
                }
            }
        }
        for (String string : ST2) {
            ST1.add(string);
        }
        double Result = Similar / (double)ST1.size();
        System.out.printf("%.3f", Result);
    }
}
