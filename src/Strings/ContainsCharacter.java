package Strings;

import java.util.Scanner;

public class ContainsCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "Java Developer";
		System.out.println("Enter the character you want to find? ");
	    Scanner sc = new Scanner(System.in);
	    String find = sc.nextLine();
		boolean key = s.contains(find);
		
		if (key) {
			System.out.println("The character is Found!");
			}
		
		else {
			System.out.println("The charcter is not Found!" );
		}
		
		//using Array - CharArray method
		
		char ch[] = s.toCharArray();
		char c =find.charAt(0);
		for(int i = 0;i< s.length(); i++) {
				if(ch[i]==c) {
					System.out.println("The character " + find + " is found in " + i + "  index");
				}
		}sc.close();
		
		//Another way using charAt
		
		char cha= 'r';
		boolean result = false;
		for(int i=0;i<s.length();i++) {
			if(cha == s.charAt(i)) {
				System.out.println("The character is found in index: "+ i);
				result= true;
				break;
				
			}
		}
		if(!result) {
			System.out.println("Character not found !");
		}
		
	}

}
