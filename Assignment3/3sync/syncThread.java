class EvenThread extends Thread {
    private final Object lock;

    public EvenThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            synchronized (lock) {
                System.out.println("EvenThread: " + i);
                lock.notify(); // Notify the OddThread to proceed
                try {
                    if (i < 10) {
                        lock.wait(); // Wait for OddThread to print
                    }
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}

class OddThread extends Thread {
    private final Object lock;

    public OddThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            synchronized (lock) {
                System.out.println("OddThread: " + i);
                lock.notify(); // Notify the EvenThread to proceed
                try {
                    if (i < 9) {
                        lock.wait(); // Wait for EvenThread to print
                    }
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}

public class syncThread {
    public static void main(String[] args) {
        Object lock = new Object(); // Shared lock object

        EvenThread evenThread = new EvenThread(lock);
        OddThread oddThread = new OddThread(lock);

        oddThread.start(); // Start OddThread first
        evenThread.start(); // Start EvenThread second
    }
}
