package Thread.practise.com;


public class JoinExample {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.start();
        try {
            w.join(); // Main waits for worker to complete
        } catch (InterruptedException e) {}

        System.out.println("Main thread continues after Worker is done.");
    }
}

class Worker extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Worker Thread: " + i);
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {}
        }
    }
}


