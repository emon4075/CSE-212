package ExceptionHandle;

import java.util.Scanner;
// import java.lang.Exception;

class NoMatchException extends Exception {
    NoMatchException(String Message) {
        super(Message);
    }
}

public class TestNoMatchException {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String S1 = "Bangladesh";
        String S2 = Input.next();
        try {
            if (S1.equals(S2)) {
                System.out.println("String Matches");
            } else {
                throw new NoMatchException("Not Matched");
            }
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is The Finally Block");
        }
    }
}
