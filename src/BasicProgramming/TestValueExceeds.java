package BasicProgramming;

import java.lang.Exception;
import java.util.Scanner;

class ValueExceeds extends Exception {
    ValueExceeds(String message) {
        super(message);
    }
}

public class TestValueExceeds {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        try {
            if (i > 100)
                throw new ValueExceeds("Input Greater than 100");
        } catch (ValueExceeds e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Block");
        }
    }
}
