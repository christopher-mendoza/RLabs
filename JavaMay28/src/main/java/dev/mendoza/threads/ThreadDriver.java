package dev.mendoza.threads;

public class ThreadDriver {

	public static void main(String[] args) {
		/*
		 * We can use the Runnable Interface (functional interface)
		 * Or we can use lambdas
		 * 
		 * Define an implementation of Runnable
		 */
		
		Runnable task0 = () -> { 
			System.out.println("Running: " + Thread.currentThread()); 
			Resource.change(1,  2000);
		};
		
		Runnable task1 = () -> {
			System.out.println("Running: " + Thread.currentThread());
			Resource.change(2,  3000);
		};
		
		Thread t0 = new Thread(task0);
		Thread t1 = new Thread(task1);
		
		t0.start();
		t1.start();
	}
}
