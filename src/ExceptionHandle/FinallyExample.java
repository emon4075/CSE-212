package ExceptionHandle;

/**
 * FinallyExample
 */
public class FinallyExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int A[] = { 1, 2 };
        int B = 7;
        try {
            int Result = A[2] / (B - 7);
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide By 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Nai");
        } finally {
            float Result = A[1] / (float) B;
            System.out.println(Result);
        }
    }
}