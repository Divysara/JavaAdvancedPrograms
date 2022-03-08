package Strings;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class AssignmentsString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String s = "apple";
		CharacterUsingIndex(s);
		asciiValue(s);
		ascii(s);
		findWord();
		lengthOfString();
		repeatedWord();
		firstRepeatedCharacter();
		firstRepeatedWord(); 
		

	}

	static void CharacterUsingIndex(String s) {
		
		System.out.println("Enter the character to find its index number: ");
		Scanner sc = new Scanner(System.in);
		char key  = sc.next().charAt(0);
		boolean count = false;
		int index;
		for(int i =0; i<s.length();i++) {
			if(s.charAt(i) == key) {
				index = i;
				count = true;
				System.out.println(" The character " + key + " is found in the index "+ index);
			}
		}
		 if (!count) {
			System.out.println("The given character is not found in the string !");
		}
	
	}
	
	
	static void asciiValue(String s) throws UnsupportedEncodingException {
		
		String str = "ABCDEFGHIJKLMNOP";
		// translating text String to 7 bit ASCII encoding
		byte[] b = str.getBytes("US-ASCII"); 
		System.out.println("ASCII value of " + str + " is following"); 
		System.out.println(Arrays.toString(b));

	}
	
	static void ascii(String s) {
		
		System.out.println("The ASCII Value of the given string: ");
		char ch[] = s.toCharArray();
		for( char c : ch) {
			System.out.println((int)(c));
		}
		
	}
	
	static void findWord() {
		
		String s = "can you find the word inside a string";
		String strarr[] = s.split(" ");
		boolean count = false;
		for(String str : strarr) {
			String find = "find";
			if(find.compareTo(str) == 0) {
				System.out.println("The word '"+ find + "' is found in the string : " + s);
				count = true;	
			}
		}
		if(!count) {
			System.out.println("Not found");
		}	
	}
	
	static void lengthOfString(){
		
		String s = "find the length of the string";
		System.out.println("The length of given string is: " + s.lastIndexOf(""));
		char ch[] = s.toCharArray();
		int i=0;
		for( char c: ch) {
			i++;
		}
		System.out.println("The length of given string is: " + i);			
	}
	
	static void repeatedWord() {
		
		String s = "word is repeated many times in the word file word file";
		String sub = "file";
		int f=0,c=0;
		
		for(int i =0; i<=s.length()-sub.length();i++)
		{
			if(s.charAt(i)==sub.charAt(0)) 
			{	
			 f =0;	
			 	for(int j =1;j<sub.length();j++) {
			 		if(s.charAt(i+j)!=sub.charAt(j)){
						f =1;
						break;		
			 		}
			 	}
				
			 	if(f==0) {
				c=c+1;
			 	}	
			}
		}
		if(c==0) 
			System.out.println("The substring not found");
		
		else 
			System.out.println("The frequency of the substring '" + sub + "' is: "+ c);
	}
	
	
	static void firstRepeatedCharacter() {
		String s = "abcbcbc";
		boolean flag = false;
		for(int i = 0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println("The First repeated character is : "+ s.charAt(i));
					flag =true;
					break;
				}
				if(flag)
					break;
			}
		}
		if(!flag)
			System.out.println("No repeated character!");
	}
	
	static void firstRepeatedWord() {
		String s = "I love to play and  love to sing";
		String str[]=s.split(" ");
		
		boolean flag =false;
		for(int i= 0; i<str.length;i++) {
			for(int j =i+1; j<str.length;j++) {
				if(str[i].equalsIgnoreCase(str[j])) {
					System.out.println("The First repeated word is : "+ str[i]);
					flag =true;
					break;
				} 
				if(flag)
				   break;
			}
		}
		if(!flag)
			System.out.println("No repeated word!");
		}
	
	
	
	
}
