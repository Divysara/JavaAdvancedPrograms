package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Map<String,Integer> smp=new HashMap<String,Integer>();
		
		smp.put("Social",50);
		smp.put("Maths",70);
		smp.put("Science",80);
		Map<String, Integer> mp = Collections.synchronizedMap(smp);
		mp.put("a", 65);
		System.out.println(mp.entrySet());
		
		Iterator<Entry<String, Integer>> i = mp.entrySet().iterator();
		while(i.hasNext())
		{
						mp.put("English",93);
		}
		
		System.out.println(mp.entrySet());*/
//20.What is UnsupportedOperationException and when will we get in Map implemented classes?
		
/*Any modification in the read-only Map will result in java.lang.UnSupportedOperationException in Java. 
 * You can make any List, Set or Map implementation as read only by using
 *  Collections.unModifiableList() , 
 *  Collections.unModifiableSet() and 
 *  Collections.unModifiableMap() method 

*/


		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("English", 90);
		map.put("Tamil", 97);
		map.put("Math", 99);
		map.put("Science", 90);
		map.put("economics", 89);
		
//26.How to make Map implemented classes as read-only with an example?
/** You can make any List, Set or Map implementation as read only by using
 *  Collections.unModifiableList() , 
 *  Collections.unModifiableSet() and 
 *  Collections.unModifiableMap() method 
*/		
		Map<String, String> tree = new TreeMap<String, String>();
		tree.put("fruits", "mango");
		tree.put("vege", "carrot");
		System.out.println("The data present in the TreeMap: " + tree.entrySet());
		Map<String, String> readOnlyMap = Collections.unmodifiableMap(tree);
		
		//readOnlyMap.put("food", "dosa"); //  java.lang.UnsupportedOperationException
		//readOnlyMap.remove("vege"); // bcz it read only , doesnot allow any modifications.

		
//27. WAP to retrieve only keys from given HashMap?
		
		System.out.println("The keys present in the hashmap: ");
		Set<String> keys = map.keySet();
		Iterator<String> key = keys.iterator();
		while(key.hasNext()){
			System.out.println(key.next());
		}
		
//28. WAP to retrieve only values from given HashMap?

		System.out.println("The Values present in the hashmap: ");
		Collection<Integer> values = map.values();
		Iterator<Integer> V = values.iterator();
		while(V.hasNext()){
			System.out.println(V.next());
		}
		
		
		
		
//29.WAP to retrieve both key & value pairs  from given HashMap?
		
		
		//using normal for loop:
		System.out.println("Using Normal Enhanced for loop:");
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+ " : " + m.getValue());
		}

		//Using Iterator
		System.out.println("Using Iterator :");
		Iterator<Entry<String, Integer>> new_Iterator
        = map.entrySet().iterator();

    // Iterating every set of entry in the HashMap
    while (new_Iterator.hasNext()) {
        Map.Entry<String, Integer> new_Map
            = (Map.Entry<String, Integer>)
                  new_Iterator.next();

        // Displaying HashMap
        System.out.println(new_Map.getKey() + " : "
                           + new_Map.getValue());
    }
		
//30. How do you replace a value associated with the given key if and only if it is currently mapped to given value?

		
		System.out.println("The Entry Set Before replacing old value: " + map.entrySet());
		
		map.replace("English", 90, 93);
		
		System.out.println("The Entry Set after replacing old value: " + map.entrySet());
		
		boolean isReplaced = map.replace("Tamil", 100, 50);
		  
        // print the value of isReplaced
        System.out.println("Old value for 'Tamil' was "
                           + "replaced: " + isReplaced);
		
//31.How do you remove a key-value pair from a HashMap if and only if the specified key is currently mapped to given value?

		
		System.out.println("The Entry Set: " + map.entrySet());
		
		map.remove("Tamil", 96); //doesnot remove bcz the pair doesnot exist. THE VALUE OF TAMIL IS 97
		boolean result = map.remove("Tamil", 96);
		System.out.println("The mentioned pair exist? "+ result);
		System.out.println("The Entry Set after removing an key value pair: " + map.entrySet());
				

	}

}
