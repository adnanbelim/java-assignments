class Example {
    final int speed = 60; // Can't be modified, final variable

    final void display() {
        System.out.println("Speed:" + speed); // Can't be overridden by subclass
    }

    final class Inner { // A class that can't be subclassed
        void show() {
            System.out.println("Final inner class");
        }
    }
}

public class Final {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("Speed obj:" + obj.speed);
        obj.display();
        Example.Inner innerObj = obj.new Inner();
        innerObj.show();
    }
}