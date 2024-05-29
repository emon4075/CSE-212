package Threading;

class B {
    void Testing() {
        System.out.println("From Class B");
    }
}

class A extends B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        super.Testing();
    }
}

public class Q7 {
    public static void main(String[] args) {
        A OA = new A();
        Thread Th = new Thread(OA);
        Th.start();
    }
}
