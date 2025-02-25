class Animal {
    // Instance method in Animal class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Instance method in Dog class (overrides the method in Animal)
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling instance methods using references
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Reference type is Animal, object type is Dog

        myAnimal.sound(); // Calls sound() in Animal class
        myDog.sound(); // Calls sound() in Dog class (method is overridden)
    }
}
