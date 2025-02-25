// Base class (Parent class)
class Animal {
    // Static method in the Animal class
    static void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Child class)
class Dog extends Animal {
    // Static method in the Dog class (hides the sound() method in Animal)
    static void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling static methods using class names
        Animal.sound(); // Calls sound() in Animal class
        Dog.sound(); // Calls sound() in Dog class

        // Calling static methods using references
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Reference type is Animal, object type is Dog

        myAnimal.sound(); // Calls sound() in Animal class
        myDog.sound(); // Calls sound() in Animal class (method is hidden, not overridden)
    }
}

/*
 * Static methods can be called without creating an instance of the class.
 * Static methods are resolved at compile-time based on the reference type, not the actual object type.
 */

/*
 * Method Hiding:
 
    Occurs with static methods.
    The method to be called is resolved at compile-time based on the reference
    type.
    Static methods are not polymorphic.

 * Method Overriding:
        
    Occurs with instance methods.
    The method to be called is resolved at runtime based on the actual object
    type.
    Instance methods are polymorphic.
 */