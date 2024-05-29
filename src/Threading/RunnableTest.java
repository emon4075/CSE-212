package Threading;

class EX extends Exception {
    EX(String message) {
        super(message);
    }
}
class A implements Runnable {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("A: " + i);
        }
    }
}
class B implements Runnable {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("B: " + i);
            try {
                if (i > 4) {
                    throw new EX("Exception");
                }
            } catch (EX e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
class C implements Runnable {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("C: " + i);
        }
    }
}
public class RunnableTest {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        Thread threadA = new Thread(objA);
        Thread threadB = new Thread(objB);
        Thread threadC = new Thread(objC);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
