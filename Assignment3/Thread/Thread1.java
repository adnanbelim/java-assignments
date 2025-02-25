class Parent extends Thread {
    public void m1() {
        try {
            Thread.sleep(2000); // 2 sec delay
        } catch (Exception i) {
            System.out.println("Error: " + i.getMessage());
        }
        System.out.println("Thread 1");
    }

    public void m2() {
        System.out.println("Thread 2");
    }
}

class ThreadMain {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Parent();

        p2.m2(); // FCFS basis / priority
        p1.m1(); // SCSS basis

        Thread th2 = new Thread(p1);
        Thread th1 = new Thread(p2);

        th2.setPriority(Thread.MAX_PRIORITY); // 10
        th1.start();
        th2.start();
    }
}
