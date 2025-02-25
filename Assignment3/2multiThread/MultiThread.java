import java.util.Random;

class NumberGenerator extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        for(int i = 0; i < 2; i++) {
            int number = random.nextInt(100); // Generate random number between 0-99
            System.out.println("Generated Number: " + number);

            if (number % 2 == 0) {
                new SquareCalculator(number).start();
            } else {
                new CubeCalculator(number).start();
            }

            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

class SquareCalculator extends Thread {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

class CubeCalculator extends Thread {
    private int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

public class MultiThread {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        generator.start();
    }
}
