package Strings;

public class CountNumbersString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dhiv280";
		
		int count =0;							//char ch = '5';
		int sum =0;								//int i = ch - '0';
		String ch;								//Value after conversion to int: 5
		int y;
		
		
		for(int i =0; i<s.length();i++){
			if (s.charAt(i)>= '0' && (s.charAt(i)<= '9')) {
				count++;
				  y  = Character.getNumericValue(s.charAt(i));
				  sum = sum+y;
		//Another way of getting the int value and adding to the sum is below mentioned inside comment lines.
				/*ch = String.valueOf(s.charAt(i));
				System.out.println(ch);
				sum = sum +Integer.parseInt(ch);
				*/
			}
			
		}
		System.out.println("The string : '"+ s +"'" +" has " + count + " numbers and the sum of the integers are " + sum);
		
	}

}
