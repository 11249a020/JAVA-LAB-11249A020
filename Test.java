package mypack;
public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }
}
import mypack.calculator;
public class Test {
    public static void main(String[] args) {
        calculator c = new calculator();
        int result = c.add(10, 20);
        System.out.println("Addition = " + result);
    }
}