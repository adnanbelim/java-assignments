class Human {
    static void sound() {
        System.out.println("OOPC :- Humans are good :)");
    }
}

class Animal extends Human {
    static void sound() {
        System.out.println("OOPC :- Animals make a sound :)");
    }
}

public class Hide {
    public static void main(String[] args) {
        Animal.sound();
        Human.sound();

        Human human = new Human();
        Animal animal = new Animal();

        human.sound();
        animal.sound(); // Method is hidden, not overridden
    }
}
