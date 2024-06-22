package Practice;

public class FinallyExample {
    public static void main(String[] args) {
        int A[] = { 1, 2 };
        int B = 5;
        try {
            int Res = A[3] / 0;
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println("Array Choto Vai");
        } catch (ArithmeticException i) {
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("This is Finally Block");
        }
    }
}
