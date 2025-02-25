class Example {

    // 1. Final Variable: A variable that cannot be modified once initialized.
    final int MAX_SPEED = 120;

    // 2. Final Method: A method that cannot be overridden by subclasses.
    final void displaySpeed() {
        System.out.println("Maximum Speed: " + MAX_SPEED);
    }

    // 3. Final Class: A class that cannot be subclassed.
    final class InnerClass {
        void show() {
            System.out.println("Inside final inner class");
        }
    }
}

public class Final {
    public static void main(String[] args) {
        // 1. Final Variable: Cannot change MAX_SPEED after initialization.
        Example obj = new Example();
        System.out.println("MAX_SPEED: " + obj.MAX_SPEED);

        // 2. Final Method: Can call displaySpeed but cannot override it in subclass.
        obj.displaySpeed();

        // 3. Final Class: Cannot create subclass of InnerClass.
        // Example.InnerClass innerObj = obj.new InnerClass(); // This is allowed
        Example.InnerClass innerObj = obj.new InnerClass();
        innerObj.show();

        // Trying to modify a final variable would result in a compile-time error.
        // obj.MAX_SPEED = 150; // Uncommenting this line will give an error.
    }
}
