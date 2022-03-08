package Multithreading;

public class DeadLock {
	
	
	private static int count = 0; 
	public static synchronized int getCount()
	{ 
		return count;
	} 
	public  synchronized void setCount(int count)
	{
		this.count = count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

	}
	

}
