package Multithreading;

public class VolatileDemo implements Runnable{
	
	  static volatile int count = 0;
	   static int k =9;
	  int j = 0;
	  
	@Override
	public void  run() {
		
		
		for(int i =1; i<=2;i++) {
			try {
				
				count ++;
				j++;
				System.out.println(Thread.currentThread().getName() +" The value of count : "+ count  + " value of i : "+ i +"The value of j : "+ j);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void check() {
		System.out.println("the value of k: "+ k++);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		VolatileDemo v =new VolatileDemo();
		v.check();
		Runnable r = new VolatileDemo();
		Thread t = new Thread(r);
		t.start();
		//t.join();
		Runnable r2 = new VolatileDemo();
		Thread t2 = new Thread(r2);
		t2.start();
		//t2.join();
		v.check();
	}
	

}

/*note:In absence of volatile keyword, the value of variable in each thread's stack may be different. 
 * By making the variable as volatile, all threads will get same value in their working memory
 *  and memory consistency errors have been avoided.

Here the term variable can be either static (class) variable or instance (object) variable.

Regarding your query :

Anyway a static variable value is also going to be one value for all threads, then why should we go for volatile?

If I need instance variable in my application, I can't use static variable. 
Even in case of static variable, consistency is not guaranteed due to Thread cache.

Using volatile variables reduces the risk of memory consistency errors, 
because any write to a volatile variable establishes a happens-before relationship with
 subsequent reads of that same variable.
  This means that changes to a volatile variable are always visible to other threads.


 */
