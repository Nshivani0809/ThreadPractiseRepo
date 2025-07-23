package Thread.practise.com;

//Puts the current thread to sleep (pause execution) for given milliseconds.

public class SleepExample {
	public static void main(String[] args) {
		System.out.println("Start: " + System.currentTimeMillis());
		try {
			Thread.sleep(2000); // sleep for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End:   " + System.currentTimeMillis());
	}
}
