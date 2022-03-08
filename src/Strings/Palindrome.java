package Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String check = sc.nextLine();
        int l = check.length();
        boolean p = true;
        String reverse="";

        for (int i=l-1;i>=0;i--){
            reverse= reverse+check.charAt(i);
        }
        
        System.out.println("The reverse of the entered String is: "+ reverse);

        for (int i=0;i<l;i++){
            if(reverse.charAt(i)!=check.charAt(i))
            p=false;
        }
        if(p){
            System.out.println("The String "+ check +" is a palindrome.");
        }
        else{
            System.out.println("The String "+ check +" is not a palindrome.");

        }sc.close();
	}

}
