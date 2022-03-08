package Strings;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 String inputStr ="abcabcd";
		 char ch[] = inputStr.toCharArray();
				 

	        for(char i :ch){
	        //	System.out.println(inputStr.indexOf(i));
	        	//System.out.println(inputStr.lastIndexOf(i));
	        	if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
	            System.out.println("First non-repeating character is: "+i);
	            break;
	        	}
	        }
	        
	        String s = "apple";
	        
	        for(int  i= 0; i<s.length();i++) {
	        	//System.out.println(s.indexOf(i));
	        	//System.out.println(s.lastIndexOf(i));
	        	if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
	        		System.out.println("First non-repeating Character is: " + s.charAt(i));
	        		break;
	        	}
	        }
	}

}
