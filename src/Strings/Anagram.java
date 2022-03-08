package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the first string");
        String first = sc.nextLine();
        System.out.println("Enter the second string");
        String second = sc.nextLine();
         first =first.replace(" ", "");
         second  = second.replace(" ", "");
         first = first.toLowerCase();
         second  = second.toLowerCase();
         sc.close();

         char a[] = first.toCharArray();
         char b[] = second.toCharArray();

         Arrays.sort(a);
         Arrays.sort(b);
         boolean result = Arrays.equals(a,b);

         if(result){
             System.out.println("The strings are anagram");
         }
         else{
            System.out.println("The strings are not anagram");

         }
         
	}

}
