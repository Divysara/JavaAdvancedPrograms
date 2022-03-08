package Map;

import java.util.HashMap;
import java.util.Map;

public class MapAssingment {

	public static void main(String[] args) {
		
//1.Explain How to create Hash Map object with an example?
		
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
//2.WAP to add elements to Hash Map Dynamically?
		
		hashmap.put("Linux", 500);
		hashmap.put("Unix", 700);
		hashmap.put("Mac", 600);
		hashmap.put("Windows", 700);
		
//3.WAP to check HashMap is empty or not with an example?
		
		boolean empty = hashmap.isEmpty();
		System.out.println("The HashMap is Empty : " + empty);
		
//4.WAP to remove particular entry from Hash Map with an example?
		
		System.out.println("The key to be removed is 'Mac'& its value is: ");
		System.out.println(hashmap.remove("Mac"));
		System.out.println("after removing the entry set: \n"+ hashmap.entrySet());
		
//5. WAP to check particular Key exist or not in Hash Map?
		
		System.out.println("The HashMap contains the key - 'Windows' ?  : ");
		System.out.println(hashmap.containsKey("Windows"));
		
//6. WAP to check particular Value exist or not in Hash Map?
		
		System.out.println("The HashMap contains the Value - '700' ?  : ");
		System.out.println(hashmap.containsValue(700));

//7. WAP to replace particular entry in given Hash Map?
		
		int k = hashmap.replace("Linux", 400);
		System.out.println("Previous value of 'Linux': " + k);
		System.out.println("After Replacing the entry set: \n" + hashmap.entrySet());
		
//8. WAP to compare 2 HashMap?
		
		HashMap<String, Integer> hashmap2 = new HashMap<String, Integer>();
		hashmap2.putAll(hashmap);
		boolean equals = hashmap2.equals(hashmap);
		if(equals)
		System.out.println("The two hashmaps are equal");
		else
			System.out.println("Not equal!");
		
//9. WAP to copy one Hash Map to another Hash Map?
		
		Map<String, Integer> clone  =  (Map<String, Integer>) hashmap2.clone();
		System.out.println("The cloned copy or copy of original HashMap : ");
		System.out.println(clone.toString());
		
//10. WAP to get particular entry from given Hash Map?
		
	    Integer integer = hashmap2.get("Windows");
	    System.out.println(integer);
	    
	    System.out.println(hashmap2.entrySet().toArray()[0]);
		/*
		
				
				
				*/
		
		
			
		
		
		
	}
	
	
	
	

}
