package Strings;

public class TrimSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   hello world welcome !";
		String s2="";
		for(int i =0; i< s.length()-1;i++) {
			
			if(!String.valueOf(s.charAt(i)).isBlank()) {
				s2=s2+ Character.toString(s.charAt(i));
				
			}
		}
		System.out.println("Before Trimming: \n" + s);
		System.out.println("After Trimming: \n" + s2);
		
		
		//another way: 
		
		System.out.println("Before Trimming: \n" + s);
		System.out.println("After Trimming: \n" + s.replaceAll("\\s",""));

	}

}
