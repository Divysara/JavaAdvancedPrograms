package Strings;

public class VowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int v=0, s =0,d=0,c =0;
	        String str = new String("Java String Basic Learnings 2021 year");
	        int l = str.length();
	        str=str.toLowerCase();
	        System.out.println("The lower case of the string: "+ str);
	        for(int i= 0;i<l;i++){
	        if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
	                v++;
	        }
	        else if(str.charAt(i)>'a'&& str.charAt(i)<'z'){
	            c++;
	        }
	        else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
	           d++;
	        }
	        else if(str.charAt(i)==' '){
	            s++;
	        } 
	        
	        }
	        System.out.println("The no of vowels: "+v);
	        System.out.println("The no of consonants: "+c);
	        System.out.println("the no of spaces:" + s);
	        System.out.println("the no of digits:" + d);
	}

}
