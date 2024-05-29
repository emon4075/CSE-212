package BasicProgramming;

class EQ {
    void Result(int T, int X) {
        double Res = Math.sqrt((6 * T * T) / Math.sqrt(T) + X);
        System.out.println(Res);
    }
}

public class Equation {
    public static void main(String[] args) {
        EQ R1 = new EQ();
        R1.Result(5, 3);
    }
}
