package Java8;

import java.util.Arrays;
import java.util.List;

public class MethodsOfStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> str = Arrays.asList("a","","b","c","");
		int count = (int) str.stream().filter(x-> x.isEmpty()).count(); // counting the empty string alone
		
		System.out.println(count); //0/p: 2
		
		List<String> str1 = Arrays.asList("apple","","bat","cats","","app");
		int count1 = (int) str1.stream().count(); //counting all the strings
		
		System.out.println(count1); //o/p: 5
		
		str1.stream().filter(x-> x.startsWith("a")).forEach(System.out::println); //0/p: apple
		
		
		
		
	}

}
