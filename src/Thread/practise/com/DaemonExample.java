package Thread.practise.com;

//Background threads — die when main thread dies.

public class DaemonExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try { Thread.sleep(1000); } catch (Exception e) {}
            }
        });

        t.setDaemon(true);
        t.start();

        System.out.println("Main thread ends...");
    }
}
