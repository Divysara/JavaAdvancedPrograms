package Strings;

public class ReverseString {

	static String sent;
	static void revWordByWord(String s) {
		sent = s;
		String strarr[] = s.split(" ");
		
		for(int i =strarr.length-1;i>=0;i--) {
		System.out.print(strarr[i]+ " ");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "Believe that You can do it";
		System.out.println("Original String : \n" + s);
		revWordByWord(s);
		char ch[]  = s.toCharArray();
		System.out.println("After Reversing: ");
		String reverse= "";
		
		for(int i=ch.length-1; i>=0;i--) {
			reverse=  reverse+ch[i];
		}
		System.out.print(reverse);
		System.out.println();
		
		 // reversing using charAT Method:
		
		String reverse2= "";
		for(int i=s.length()-1;i>=0;i--) {
			reverse2=  reverse2+s.charAt(i);
			
		}
		System.out.println("After Reversing using CharAT: ");
		System.out.println(reverse2);
		
		
	}

}
