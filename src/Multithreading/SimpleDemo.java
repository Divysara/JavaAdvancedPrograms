package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*Thread can be created by
 * 1. extending a thread class or
 * 2. implementing Runnable, 
 * 3.callable interface and
 * 4. by annonymous way too
*/
public class SimpleDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Thread t = new Multithread("Thread 0ne");
		Thread t2 = new Multithread("Thread Two");
		t.start(); //calling the thread by using start()
		t.join();  // by using join(), we are making others threads to wait until this thread completes.
		
		t2.start();
		t2.join();
		
		//creating thread using Runnable Interface
		System.out.println("Main Thread");
		Runnable m = new Multi();
		Thread t3 = new Thread(m);
		t3.start();
		
		
		//creating thread using Callable Interface
		Callable<String> c = new Multic();
		ExecutorService service =  Executors.newSingleThreadExecutor();
		Future<String> future = service.submit(c);
		
		System.out.println(future.get());
		
	}

}


class Multithread extends Thread{
String name ;
	Multithread(String name){
		this.name = name;
	}
	public void run() {
		try {
			
			for(int i=1; i<=5;i++)
			{
			
				System.out.println(i +"-" + name);
			Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
// Implementing Runnable interface
class Multi implements Runnable{

	@Override
	public void run() {
		System.out.println("Hi from runnable run method");
	}
}


//Implementing Callable interface
class Multic implements Callable{

	@Override
	public String call()throws Exception  {
		
		return "Hi from Callable call method";
	}
}