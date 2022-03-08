package Multithreading;

public class LockingObjectLevel {

	public static void main(String[] args) {
		EvenThread et1=new EvenThread();
		EvenThread et2=new EvenThread();
		
		Thread t1=new Thread(et1);
		Thread t2=new Thread(et1);
		
		Thread t3=new Thread(et2);
	//	Thread t4=new Thread(et2);
		
		t1.setName("ET1-ThreadOne");
		t2.setName("ET1-ThreadTwo");
		t3.setName("ET2-ThreadThree");
	//	t4.setName("ET2-ThreadFour");
		
		t1.start();
		t2.start();
		t3.start();
		//t4.start();
		

	}

}
 class EvenThread implements Runnable
{
	public void run()
	{
		try {
			disp();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void disp() throws InterruptedException
	{
		
		synchronized (this)
		{
			System.out.println(Thread.currentThread().getName());
			for(int i=1;i<=10;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
					Thread.sleep(200);
				}
			}
		}
		
	}
}