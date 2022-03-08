package Multithreading;

public class LambdaInMultithreading {

	public static void main(String[] args) {
		/*Instead of creating seperate class to implement runnable interface
		 * making use of lambda expression, since Runnable is a functional Interface
		 * https://winterbe.com/posts/2015/04/07/java8-concurrency-tutorial-thread-executor-examples/
		 */
		
		Runnable task = () -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		};

		task.run();

		Thread thread = new Thread(task);
		thread.start();

		System.out.println("Done!");
		

	}

}
