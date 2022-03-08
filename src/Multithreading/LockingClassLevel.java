package Multithreading;

public class LockingClassLevel {

	public static void main(String[] args) {
		
		OddThread Ot1=new OddThread();
		OddThread Ot2=new OddThread();
		
		Thread t1=new Thread(Ot1);
		Thread t2=new Thread(Ot1);
		
		Thread t3=new Thread(Ot2);
		Thread t4=new Thread(Ot2);
		
		t1.setName("OT1-ThreadOne");
		t2.setName("OT1-ThreadTwo");
		t3.setName("OT2-ThreadThree");
		t4.setName("OT2-ThreadFour");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();	
	}
}

class OddThread implements Runnable
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
		
		synchronized (getClass())
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