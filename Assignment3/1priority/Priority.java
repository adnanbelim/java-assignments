class MyThread extends Thread {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Simulating work with a delay
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(threadName + " is running with priority " + this.getPriority());
    }
}

public class Priority {
    public static void main(String[] args) {
        // Create 4 threads
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");
        MyThread t4 = new MyThread("Thread 4");

        // Set different priorities
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10
        t4.setPriority(7); // Priority 7 (custom value between MIN and MAX)

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
