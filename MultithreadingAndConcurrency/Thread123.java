package ma.ecole.MultithreadingAndConcurrency;

public class Thread123 {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new Worker("A", 4000));
        Thread thread2 = new Thread(new Worker("B", 2000));

        // Start both threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread is waiting for threads to complete.");

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have completed. Main thread proceeding.");
    }
}

class Worker implements Runnable {
    private String name;
    private int duration;

    public Worker(String name, int duration) {
        this.name = name;
        this.duration = duration; // duration in milliseconds
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " starting.");
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " interrupted.");
        }
        System.out.println("Thread " + name + " finished after " + duration / 1000 + " seconds.");
    }
}
