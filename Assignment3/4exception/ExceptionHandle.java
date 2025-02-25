public class ExceptionHandle {

    // Method that may throw an exception
    public static void checkNumber(int num) throws ArithmeticException {
        if (num == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        try {
            // Trying to call method which might throw exception
            checkNumber(0); // This will throw an exception
        } catch (ArithmeticException e) {
            // Catch block to handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Finally block will always execute
            System.out.println("Finally block executed.");
        }

        // Manually throwing an exception
        try {
            throw new Exception("Custom exception thrown");
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
