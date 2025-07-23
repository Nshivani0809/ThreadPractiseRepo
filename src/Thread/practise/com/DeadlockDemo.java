package Thread.practise.com;


//Two threads wait on each other to release a resource — both are blocked forever.

public class DeadlockDemo {
    static final Object lock1 = "Lock1";
    static final Object lock2 = "Lock2";

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized(lock1) {
                System.out.println("Thread 1: Holding lock1");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized(lock2) {
                    System.out.println("Thread 1: Holding lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(lock2) {
                System.out.println("Thread 2: Holding lock2");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized(lock1) {
                    System.out.println("Thread 2: Holding lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
