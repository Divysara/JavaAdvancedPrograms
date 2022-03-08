package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("Apples", 120);
		map.put("Plums", 103);
		map.put("Pears", 140);
		map.put("Mangoes", 210);
		map.put("Bananas", 190);
		
		//Here we are converting MAP to List and performing sorting operation.
		
		List<Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list,(o1,o2)-> o1.getValue()-o2.getValue());
		
		System.out.println("Sorting by Normal: ");
		System.out.println("*****************");
		for(Entry<String,Integer> entry: list) {
			System.out.println(entry.getKey()+ " - " + entry.getValue());
		}
				
		
		System.out.println();
		System.out.println("Sorting by Key: ");
		System.out.println("***************");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		
		System.out.println();
		
		System.out.println("Sorting by Value: ");
		System.out.println("*****************");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
		
	}

}
