// Abstract class Shape
abstract class Shape {
    int a, b;

    // Empty method to be overridden
    abstract void printArea();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    Rectangle(int length, int width) {
        a = length;
        b = width;
    }

    // Override the printArea method
    @Override
    void printArea() {
        System.out.println("Area of Rectangle: " + (a * b));
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    // Override the printArea method
    @Override
    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * a * b));
    }
}

// Circle class extending Shape
class Circle extends Shape {
    Circle(int radius) {
        a = radius;
        b = 0; // Only radius is needed for Circle
    }

    // Override the printArea method
    @Override
    void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * a * a));
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects for each shape
        Shape rectangle = new Rectangle(5, 4);
        Shape triangle = new Triangle(6, 3);
        Shape circle = new Circle(7);

        // Call printArea() on each object
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
