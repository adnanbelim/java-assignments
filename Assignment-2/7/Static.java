class Example {
    static int count = 0;

    static void incrementCount() {
        count++;
    }

    static {
        System.out.println("OOPC :- Static block executed. Initializing count...");
        count = 5;
    }

    static class Inner {
        void display() {
            System.out.println("OOPC :- Inside static nested class");
        }
    }

    void showCount() {
        System.out.println("Count: " + count);
    }
}

public class Static {
    public static void main(String[] args) {
        System.out.println("Count before increment: " + Example.count);

        Example.incrementCount();

        System.out.println("Count after increment: " + Example.count);

        // Static block executes automatically when the class is loaded

        Example.Inner inner = new Example.Inner();
        inner.display();

        Example example = new Example(); // Instance method
        example.showCount();
    }
}
