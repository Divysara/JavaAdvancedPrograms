package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintEvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println("The list of numbers in the List: " + numbers);
	    ArrayList<Integer> even = new ArrayList<Integer>();
	    ArrayList<Integer> odd = new ArrayList<Integer>();
	       
	       for(int i=0;i<numbers.size();i++) {
	    	   if((numbers.get(i))%2==0) {
	    		   even.add(numbers.get(i));
	    	   }
	    	   else {
	    		   odd.add(numbers.get(i));
	    	   }
	    	   
	       }
	       System.out.print("The list of even numbers: " +even + " ");
	       System.out.println();
	       System.out.print("The list of odd numbers: " +odd + " ");
	}

}
