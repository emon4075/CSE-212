package BasicProgramming;

class Sample1 {
    void MethodA() {
        System.out.println("MethodA_S1");
    }
}

class Sample2 extends Sample1 {
    void MethodA() {
        System.out.println("MethodA_S2");
    }

    void MethodB() {
        System.out.println("MethoB");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Sample1 OBJ = new Sample2();
        OBJ.MethodA();
    }
}
