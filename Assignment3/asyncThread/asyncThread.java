class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("EvenThread: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("OddThread: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

public class asyncThread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start(); // Start EvenThread
        try {
            evenThread.join(); // Wait for OddThread to finish before starting EvenThread
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        oddThread.start(); // Start OddThread
    }
}
