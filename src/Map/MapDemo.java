package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//1. what is purpose of putIfAbsent() method?		
//	-----------------------------------------
/*putIfAbsent() method inserts the specified key/value to the hashmap 
if the specified key is already not present in the hashmap.*/
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("English", 90);
		map.put("Tamil", 97);
		map.put("Math", 99);
		map.put("Science", 90);
		map.put("economics", 89);
		System.out.println("The Entry Set: " + map.entrySet());
		
		map.putIfAbsent("Geography", 100);  
		System.out.println("The Entry Set after adding: " + map.entrySet());
		
		map.putIfAbsent("Math", 100); // It doesn't add bcz the key "Math" is already present.
		System.out.println("The Entry Set: " + map.entrySet());
		
//2. what is purpose of "remove(key,value)" method?		
//	-----------------------------------------------
		
		map.remove("Tamil", 96); //doesnot remove bcz the pair doesnot exist. THE VALUE OF TAMIL IS 97
		boolean result = map.remove("Tamil", 96);
		System.out.println("The mentioned pair exist? "+ result);
		System.out.println("The Entry Set after removing an key value pair: " + map.entrySet());
				
//3.What is the purpose of replace(key,oldValue,newValue)"?	
// --------------------------------------------------------		
	/*The replace(K key, V oldValue, V newValue) method of Map interface, 
	 * implemented by HashMap class is used to replace the old value of 
	 * the specified key only if the key is previously mapped with the specified old value.*/	
		
		
		map.replace("English", 90, 93);
		System.out.println("The Entry Set after replacing old value: " + map.entrySet());
		
		boolean isReplaced = map.replace("Tamil", 100, 50);
		  
        // print the value of isReplaced
        System.out.println("Old value for 'Tamil' was "
                           + "replaced: " + isReplaced);
        
// 4. How to join/merge 2 HashMap objects?
// ---------------------------------------	   
        
        
        //map 1
        HashMap<Integer, String> map1 = new HashMap<>();
        
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(5, "E");
         
        //map 2
        HashMap<Integer, String> map2 = new HashMap<>();
         
        map2.put(1, "G");   //It will replace the value 'A', bcz the recent value will be updated.
        map2.put(2, "B");
        map2.put(3, "C");
        map2.put(4, "D");  
         
        //Merge maps
        map1.putAll(map2);
         
        System.out.println(map1);
        
        Map<String,String> mp=new HashMap<String,String>();
		mp.put("India","Delhi");
		mp.put("UK","London");
		String put = mp.put("UK", "UK");
		System.out.println(put);
				
	}

}
