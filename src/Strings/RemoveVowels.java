package Strings;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str = new String("Java String Basic Learnings 2021 year");
        System.out.println("The given String : \n" + str);
        
 
        	str = str.replaceAll("[aeiouAEIOU]", "");
        	System.out.println(" After removing Vowels \n" + str);
        
	}

}
