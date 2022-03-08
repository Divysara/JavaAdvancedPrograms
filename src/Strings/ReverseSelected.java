
 
package Strings;

public class ReverseSelected {

	/**
	 * reversing the each word alone and keeping in the same order of the string
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "java html sql";
		String strarray[]  = s.split(" ");
		for(String str: strarray) {
			System.out.print(str +  " ");
		}
		System.out.println();
		
		for(int i=strarray.length-1;i>=0;i--) {
			System.out.print(strarray[i]+ " ");
		}
		
		System.out.println();
		
		for(int i=(s.length()-1);i>=0;i--){
			
		}
		
		for(int i=0; i<3; i++){ 
			char[] s1 = strarray[i].toCharArray(); 
			for (int j = s1.length-1; j>=0; j--)
			{
		System.out.print(s1[j]);
		}
		System.out.print(" ");

		}
	}

}
