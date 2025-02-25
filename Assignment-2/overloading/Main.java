class Calculator {
    // Overloaded method for adding two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for adding three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method for adding two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling the overloaded methods
        System.out.println("Sum of 2 integers: " + calculator.add(5, 10)); // Calls add(int, int)
        System.out.println("Sum of 3 integers: " + calculator.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println("Sum of 2 doubles: " + calculator.add(5.5, 10.5)); // Calls add(double, double)
    }
}
