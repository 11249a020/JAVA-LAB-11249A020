public class VariablesDemo {
    int instanceVar=10;
    // Static variable
    static String staticVar = "I am static";

    public void showVariables() {

        // Local variable
        int localVar = 5;
        System.out.println("Instance Variable:"+instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {

        VariablesDemo obj1 = new VariablesDemo();
        obj1.showVariables();

        System.out.println("Accessing static variable via class: " + VariablesDemo.staticVar);
    }
}