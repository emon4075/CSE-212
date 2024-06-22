package Practice;

import java.util.Scanner;

class NoMatch extends Exception {
    NoMatch(String Message) {
        super(Message);
    }
}

public class TestNoMatchException {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String S1 = "Bangladesh";
        String S2 = S.next();
        try {
            if (S1 == S2) {
                System.out.println("Milche");
            } else {
                throw new NoMatch("Milche na");
            }
        } catch (NoMatch i) {
            System.out.println(i.getMessage());
            // System.out.println("Milche na");
        } finally {
            System.out.println("Perechi");
        }
    }
}
