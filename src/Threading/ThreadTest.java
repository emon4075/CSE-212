package Threading;

/**
 * ThreadTest
 * Extending The Thread Class
 */
class A extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("A: " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("B: " + i);
        }
    }
}

class C extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("C: " + i);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        A myThing = new A();
        B yourThing = new B();
        C herThing = new C();
        myThing.start();
        yourThing.start();
        herThing.start();
    }
}
