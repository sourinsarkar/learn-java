class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Code {
    public static void main(String[] a) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
    }
}
