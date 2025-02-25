class Animal {
    Animal() {
        System.out.println("OOPC :- Animal constructor called");
    }

    void sound() {
        System.out.println("OOPC :- Animal makes sound");
    }

    String name = "Parent class field";
}

class Dog extends Animal {
    Dog() {
        super(); // Calling parent class constructor
        System.out.println("OOPC :- Subclass Constructor called");
    }

    void sound() {
        super.sound(); // Calling parent class method
        System.out.println("OOPC :- Subclass method");
    }

    void displayName() {
        System.out.println("Parent class name: " + super.name); // Accessing parent class field
        System.out.println("Subclass name: " + this.name);
    }

    String name = "Subclass field";
}

public class Super {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.displayName();
    }
}
