package Strings;

/* to compare two strings we can use equals method, 
 * but to compare string with stringbuilder or stringbuffer we should use content equals
 */

public class CompareSBandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("welcome");
		String s = "welcome";
		String s2 = "welcome";
		System.out.println(s2.equals(s)); // true
		System.out.println(sb.equals(s)); //false
		System.out.println(s.contentEquals(sb)); //true  :first string should come, then only sb, or sbl
		System.out.println(s.contentEquals(s2)); //true
		
		StringBuffer sb2 = new StringBuffer("welcome");
		System.out.println(s.contentEquals(sb2)); //true
		
		StringBuilder sb3 = new StringBuilder("welcome");
		System.out.println(sb3.equals(sb2));//false
		System.out.println(sb3.toString().equals(sb2.toString())); //true
		
	/*  We can't use the equals method of the StringBuffer class for comparing two StringBuffer objects.
	 * The StringBuffer class equals method returns true only if both the comparing objects pointing to the same memory location
	 * .i.e. here comparing the memory address of the StringBuffer objects, not their contents.
     Hence we have to convert the StringBuffer objects to String 
        and use the String class equals method for comparing StringBuffer objects.
        String class equals method returns true if both the String objects occupies the same content.*/
		
	}

}
