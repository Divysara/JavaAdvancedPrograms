package Strings;

// how to reverse a string using recursive manner?

public class Recursion {
	public static void main(String[] args) {
		
		Recursion obj = new Recursion(); //instance of the class
		
		String content  = "recursion method";
		System.out.println(content);
		
		 obj.recursion(content); // calling the method
	}
	String recursion(String s) {
		if(s.isEmpty())     // checking if the string is empty?
			return  " ";
		
		else
			System.out.print(s.charAt(s.length()-1)); //printing the last character in the string
		
	
	return recursion(s.substring(0,s.length()-1)); // calling the method again by passing the substring of the string

	}
}