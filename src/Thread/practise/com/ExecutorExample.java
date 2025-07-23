package Thread.practise.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Use ExecutorService to manage a pool of threads.

public class ExecutorExample {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		Runnable task1 = () -> System.out.println("Task 1 running");
		Runnable task2 = () -> System.out.println("Task 2 running");

		executor.submit(task1);
		executor.submit(task2);

		executor.shutdown(); // Required to terminate
	}
}
