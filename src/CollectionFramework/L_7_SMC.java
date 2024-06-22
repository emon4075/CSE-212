package CollectionFramework;

import java.util.Scanner;

public class L_7_SMC {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String X = S.next();
        String Y = S.next();
        int F01 = 0, F10 = 0, F00 = 0, F11 = 0;
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == '0' && Y.charAt(i) == '0') {
                F00++;
            } else if (X.charAt(i) == '1' && Y.charAt(i) == '1') {
                F11++;
            } else if (X.charAt(i) == '0' && Y.charAt(i) == '1') {
                F01++;
            } else {
                F10++;
            }
        }
        int Upper = F11 + F00;
        int Lower = F11 + F00 + F10 + F01;
        System.out.println(Upper / (double) Lower);
        S.close();
    }
}
