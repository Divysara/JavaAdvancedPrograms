package Strings;

public class CountCharacter {
	public static void main(String[] args) {
		String s = "Java Developer";
		int l= s.length();
        
        int count = 0;
        for(int i=0;i<l;i++){
            if(s.charAt(i) == 'e' ){
                count++;
            }         
        }
        System.out.println("Given character occured : "+ count + " times" );
	}
}
