package Strings;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swapWithVariable();
		swapWithoutVariable();
		 
		 
	}
static void swapWithVariable() {
	String s = "dad";
	String s2 = "mom";
	System.out.println("Before Swapping");
	System.out.println(s+ " " + s2);
	String swap = s;
	 s= s2;
	 s2 = swap;
	 System.out.println("After Swapping");
	 System.out.println(s+ " " + s2);
}
static void swapWithoutVariable() {
	
	String s = "dad";
	String s2 = "mom";
	System.out.println("Before Swapping");
	System.out.println(s+ " " + s2);
	s = s+s2;
	s2 = s.substring(0, s.length()-s2.length());
	s = s.substring(s2.length());
	System.out.println("After Swapping");
	System.out.println(s+ " " + s2);
}
}
