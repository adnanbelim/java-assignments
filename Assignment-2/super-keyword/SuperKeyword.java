// Parent Class (Superclass)
class Animal {
    // Parent class constructor
    Animal() {
        System.out.println("Animal constructor called");
    }

    // Parent class method
    void sound() {
        System.out.println("Animal makes a sound");
    }

    // Parent class field
    String name = "Generic Animal";
}

// Child Class (Subclass)
class Dog extends Animal {
    String name = "Dog";

    // Constructor of Dog class, calling the parent constructor
    Dog() {
        // Calling parent class constructor using 'super'
        super();
        System.out.println("Dog constructor called");
    }

    // Overriding sound method in Dog class
    @Override
    void sound() {
        // Calling the parent class method using 'super'
        super.sound();
        System.out.println("Dog barks");
    }

    // Method to access parent class field
    void displayName() {
        // Accessing parent class field using 'super'
        System.out.println("Parent class name: " + super.name);
        System.out.println("Child class name: " + this.name);
    }
}

public class SuperKeyword{
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog dog = new Dog();

        // Calling overridden method in Dog class
        dog.sound();

        // Accessing parent and child class fields
        dog.displayName();
    }
}
