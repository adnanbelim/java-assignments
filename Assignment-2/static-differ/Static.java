class Example {

    // 1. Static variable (Class-level variable)
    static int count = 0;

    // 2. Static method (Class-level method)
    static void incrementCount() {
        count++;
    }

    // 3. Static block (Executed when the class is loaded)
    static {
        System.out.println("Static block executed. Initializing count...");
        count = 5; // Initialize count to 5 in static block
    }

    // 4. Static nested class (A class defined inside another class as static)
    static class Inner {
        void display() {
            System.out.println("Inside static nested class.");
        }
    }

    // Instance method (non-static)
    void showCount() {
        System.out.println("Count: " + count);
    }
}

public class Static {
    public static void main(String[] args) {
        // 1. Using Static Variable
        System.out.println("Count before increment: " + Example.count);
        Example.incrementCount(); // Calling static method to increment count
        System.out.println("Count after increment: " + Example.count);

        // 2. Using Static Block
        // Static block is automatically executed when the class is loaded.

        // 3. Using Static Nested Class
        Example.Inner inner = new Example.Inner(); // Create object of static nested class
        inner.display();

        // 4. Using Instance method to display count
        Example example = new Example();
        example.showCount(); // Accessing instance method to show count
    }
}
