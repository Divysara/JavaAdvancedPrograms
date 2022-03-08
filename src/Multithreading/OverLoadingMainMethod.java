package Multithreading;

public class OverLoadingMainMethod {

	public static void main(String[] args) {
		
		
		Integer[] i = {1,2,3};
		main(i);

	}
	public static void main(Integer[] ints) //main method overloaded:same method name, but with diff parameters.
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		t1.setName("custome-main-thread");
		System.out.println(t1.getName());
		
	}
}
