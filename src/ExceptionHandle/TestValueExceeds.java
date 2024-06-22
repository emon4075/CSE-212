package ExceptionHandle;

import java.util.Scanner;

class ValueExceeds extends Exception {
    ValueExceeds(String M) {
        super(M);
    }
}

public class TestValueExceeds {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = Input.nextInt();
        try {
            if (Number <= 100) {
                System.out.println("Number is in the Bound");
            } else {
                throw new ValueExceeds("Value Exceeds");
            }
        } catch (ValueExceeds e) {
            System.out.println(e.getMessage());
        }
    }
}
