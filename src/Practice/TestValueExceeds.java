package Practice;

import java.util.Scanner;

class ValueExceeds extends Exception {
    ValueExceeds(String S) {
        super(S);
    }
}

public class TestValueExceeds {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int A = S.nextInt();
        try {
            if (A > 100) {
                throw new ValueExceeds("Value Exceeded");
            } else {    
                System.out.println("Value Not Exceeded");
            }
        } catch (ValueExceeds e) {
            System.out.println(e.getMessage());
        }
    }
}
