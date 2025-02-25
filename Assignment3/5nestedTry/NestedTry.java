public class NestedTry {

    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block started.");

            try {
                // Inner try block
                System.out.println("Inner try block started.");
                int result = 10 / 0; // This will throw ArithmeticException
                System.out.println(result);
            } catch (ArithmeticException e) {
                // Inner catch block
                System.out.println("Caught exception in inner catch: " + e.getMessage());
            }

            // This code runs after the inner try-catch
            System.out.println("Outer try block continued.");

            int result = 10 / 5;
            System.out.println(result); // This will throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            // Outer catch block
            System.out.println("Caught exception in outer catch: " + e.getMessage());
        }

        System.out.println("Program completed.");
    }
}
