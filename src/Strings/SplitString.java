package Strings;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Desire is the root cause of sorrow");
		String arr[] = s.split("\\s");
		for(String a : arr) {
			System.out.println(a);
		}

	}

}
