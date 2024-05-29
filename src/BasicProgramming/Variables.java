package BasicProgramming;

class Person {
    static int Age = 30;
    int Money = 1000;
    public void Name() {
        String myName = "Emon";
        System.out.println(myName);
    }
}

public class Variables {
    public static void main(String[] args) {
        Person P = new Person();
        System.out.println(P.Money);
        System.out.println(Person.Age);
        P.Name();
    }
}
