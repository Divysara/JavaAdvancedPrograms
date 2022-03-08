package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
	
	/*The Concurrency API introduces the concept of an ExecutorService as a higher level replacement
	 *  for working with threads directly.
	 *  Executors are capable of running asynchronous tasks and typically manage a pool of threads,
	 *  so we don't have to create new threads manually. 
	 *  All threads of the internal pool will be reused under the hood for revenant tasks, 
	 *  so we can run as many concurrent tasks as we want throughout the life-cycle of our application
	 *  with a single executor service.
	 */

	public static void main(String[] args) throws InterruptedException {
		
		
		ExecutorService execute = Executors.newSingleThreadExecutor();
		execute.submit(() ->  System.out.println("Hello "+ Thread.currentThread().getName()));

		execute.submit(new EvenThread1());
		ExecutorService execute1 = Executors.newFixedThreadPool(2);
		execute1.submit(new EvenThread1()); 
		execute1.submit(new OddThread1());
		
		/*the java process never stops! Executors have to be stopped explicitly -
		 *  otherwise they keep listening for new tasks.
			An ExecutorService provides two methods for that purpose: 
			shutdown() waits for currently running tasks to finish while 
			shutdownNow() interrupts all running tasks and shut the executor down immediately.
		 */
		execute.shutdown();
		execute1.awaitTermination(10, TimeUnit.SECONDS); //it waits for 10 seconds and shutsdown
		execute1.shutdown();
	}

}

class EvenThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		 System.out.println("EVEN "+ Thread.currentThread().getName());

	}
}
class OddThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
		 System.out.println("ODD "+ Thread.currentThread().getName());

	}
}
