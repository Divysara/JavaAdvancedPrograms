package Strings;

public class UpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "APPLE is Delicious";
		
		// UpperCase to LowerCase
		for(int i =0; i<s.length(); i++) {
			char ch =s.charAt(i) ;
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' ) {
				ch = (char)(s.charAt(i)+32);
				System.out.print( (char) ch);	
			}
			else {
				ch =s.charAt(i);
				System.out.print( (char) ch);
			}
		}
		System.out.println();
		
		//LowerCase to UpperCase
		
		for(int i =0; i<s.length(); i++) {
			char ch =s.charAt(i) ;
			if(s.charAt(i)>='a' && s.charAt(i)<='z' ) {
				ch = (char)(s.charAt(i)-32);
				System.out.print( (char) ch);	
			}
			else {
				ch =s.charAt(i);
				System.out.print( (char) ch);
			}
		}
		
	}

}
