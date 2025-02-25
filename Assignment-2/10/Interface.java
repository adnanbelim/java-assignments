interface Animal {
    void eat();
}

interface Vehicle {
    void move();
}

class AnimalVehicle implements Animal, Vehicle {
    public void eat() {
        System.out.println("Animal eats food");
    }

    public void move() {
        System.out.println("Vehicle moves on wheel");
    }
}

public class Interface {
    public static void main(String[] args) {
        AnimalVehicle av = new AnimalVehicle();
        av.eat();
        av.move();
    }
}
