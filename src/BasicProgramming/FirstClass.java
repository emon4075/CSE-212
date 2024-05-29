package BasicProgramming;

class SecondClass {
    void methodA(int a, int b) {
        int sum = a + b;
        System.out.println("Both Integer: " + sum);
    }

    void methodA(int a, double b) {
        double sum = a + b;
        System.out.println("Integer and Double: " + sum);
    }

    void methodA(double a, double b) {
        double sum = a + b;
        System.out.println("Both Double: " + sum);
    }
}

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("First Program");
        SecondClass objA = new SecondClass();
        objA.methodA(2.5, 3.2);
    }
}
