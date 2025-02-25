// Base class (Parent class) - Super
class Animal {
    // Declare the variable 's' in the base class
    String s = "Dogs Bark"; // Correct string syntax
}

// Derived class (Child class) - Sub
class Dog extends Animal {
    // Method in the Dog class to print the value of 's'
    void makeSound() {
        System.out.println(s); // Accessing the inherited 's' variable
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Dog
        Dog dog = new Dog();

        // Calling the makeSound() method from the Dog class
        dog.makeSound(); // This will print "Dogs Bark"
    }
}
