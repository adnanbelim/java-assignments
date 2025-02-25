// First interface
interface Animal {
    void eat(); // Abstract method
}

// Second interface
interface Vehicle {
    void move(); // Abstract method
}

// A class implementing both Animal and Vehicle interfaces
class AnimalVehicle implements Animal, Vehicle {
    // Implementing the eat method from Animal interface
    public void eat() {
        System.out.println("Animal eats food.");
    }

    // Implementing the move method from Vehicle interface
    public void move() {
        System.out.println("Vehicle moves on wheels.");
    }
}

public class Interface {
    public static void main(String[] args) {
        AnimalVehicle av = new AnimalVehicle();
        av.eat(); // Calling method from Animal interface
        av.move(); // Calling method from Vehicle interface
    }
}
