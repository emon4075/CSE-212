package BasicProgramming;

// import java.lang.Exception;

public class Error {
    public static void main(String[] args) {
        int a[] = { 7, 9, 45, 63, 10 };
        int b = 7;
        try {
            for (int i = 0; i < 7; i++) {
                int x = a[i] / (b - 7);
                if (a[0] < 100) {
                    throw new ArithmeticException();
                }
                System.out.print(x);
            }
        } catch (ArithmeticException e) {
            System.out.println("Division By Zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        }

    }

}
