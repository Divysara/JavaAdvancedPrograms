package Strings;

import java.util.Scanner;

public class LastToNextWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Sentence:");
		String string ;
		Scanner sc = new Scanner(System.in);

		string = sc.nextLine();
		System.out.println("The last word of the given Sentence: " + string.substring(string.lastIndexOf(" "), string.length()));
	
	// Another way to do this:
		String strarr[]  = string.split(" ");
		System.out.println("The last word of the given string: " + strarr[strarr.length-1] + " " + strarr[strarr.length-2]);
	
	}
}
