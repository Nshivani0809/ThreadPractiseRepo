package Thread.practise.com;

/*thread is the smallest unit of execution. If my application needs to do a single background task, like downloading a file, I might use a single thread to avoid blocking the main UI or logic.
In contrast, multithreading allows multiple threads to run concurrently — for example, in Swiggy or Zomato, you might want to handle:

Tracking order live (one thread),

Processing payment (another thread),

Updating UI (main thread),
all simultaneously without blocking each other.
   -There are 2 ways.
   	1.Extending Thread Class
   	2.Runnable Interface*/
public class SleepDemo {

	public static void main(String[] args) {
		

	
		Mythread thread = new Mythread();
	    Thread t = new Thread(new MyRunnable());
		/*
		 * run() ➤ If you directly call run() like a normal method, it executes on the
		 * current thread (usually main thread).
		 *  ➤ No new thread is created. It's not multithreading. */		
		t.start();
		/*	
		start()
		➤ Calls the JVM to create a new thread, then calls the thread’s run() method in that new thread.
		➤ It enables true multithreading.*/
		thread.start();
	}

}
class Mythread extends Thread{
	public void run() {
        System.out.println("Thread running using Thread class");
    }
	
}

/*Runnable thread is thread that is used to run mutliple tasks parallely.
Ex: Games */
class MyRunnable implements Runnable {
	
	public void run() {
		System.out.println("Runnable thread is running");
	}

}
