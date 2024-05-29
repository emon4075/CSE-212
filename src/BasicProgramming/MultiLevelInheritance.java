package BasicProgramming;

class ClassA {
    public double Lower(double T, double X) {
        double L = Math.sqrt(T) + X;
        return L;
    }
}

class ClassB extends ClassA {
    public double Upper(double T) {
        double preRes = (6 * T * T);
        return preRes;
    }
}

class ClassC extends ClassB {
    public double Result(double L, double H) {
        double Res = Math.sqrt(L / H);
        return Res;
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        ClassC EQ = new ClassC();
        double L = EQ.Lower(5, 3);
        double preRes = EQ.Upper(5);
        double Res = EQ.Result(preRes, L);
        System.out.println(Res);
    }
}
