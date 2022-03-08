package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Assignment2 {

	public static void main(String[] args) {
		
//11. How do you find the number of elements present in Tree Map?
		
		Map<String, Integer> treemap = new TreeMap<String, Integer>();
		
		treemap.put("Linux", 500);
		treemap.put("Unix", 700);
		treemap.put("Mac", 600);
		treemap.put("Windows", 700);
		System.out.println(" The No of elements present in the Tree Map: " +treemap.size());
		
//12. How do you append an element at the end of Tree Map?
/* TreeMap is an sorted map. it displays the keys sorted in Ascending order. 
 * so it's not possible to append the element at the end. 
 * but we can convert this to LinkedHashMap and append the element at last.
 *  bcz LinkedHashMap maintains insertion order.
 */

		treemap.put("Hp", 650);
		System.out.println("After appending : " + treemap);
		LinkedHashMap<String, Integer> lhs = new LinkedHashMap<String, Integer>(treemap);
		lhs.put("Dell",760);
		System.out.println("After appending ; " + lhs);
		
//13. How do you remove all elements of Tree Map or Hash Map at a time?

		treemap.clear();
		System.out.println(treemap);
		
//14.Can we add null key/null value to a Tree Map and prove with an example?
/* we can add as many null VALUES as we can , but for KEY, it doesnot accept any null KEY. */
		
		treemap.put("Linux", 500);
		treemap.put("Unix", 700);
		treemap.put("null", null);
		treemap.put("sony", null);
		//treemap.put(null, null);
		treemap.put("Intel", null);
		System.out.println(treemap);
		
//15. Can we add null key/null value to a Hash Map and prove with an example?
/* we can add as many null VALUES as we can , but for KEY, it accepts only one null KEY. */	
		
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
		hashmap.put("Linux", 500);
		hashmap.put("Unix", 700);
		hashmap.put("Mac", null);
		hashmap.put("Windows", null);
		hashmap.put(null, 20);
		hashmap.put(null, 40);// here it takes the latest added one. not 20.
		System.out.println(hashmap);

//16. Can we add heterogeneous elements to a Tree Map and prove with an example?
/*No, Sorted collections don't allow addition of heterogeneous elements as they are not comparable.*/
		
		//treemap.put('c', 1.90); this throws error
		
//17. How to make a Hash Map or Linked Hash Map or Tree Map as thread safe?
		
/* The Hash or Tree or LinkedHashMap can be made thred safe by using Collections.synchronizedMap(Map object); */

//18.Give an example when will get ConcurrentModificationException in Hash Map or Tree Map or Linked Hash Map?
		
		Map<String,Integer> smp=new HashMap<String,Integer>();
		
		smp.put("Social",50);
		smp.put("Maths",70);
		smp.put("Science",80);
		
		Iterator<Entry<String, Integer>> i = smp.entrySet().iterator();
		while(i.hasNext())
		{				Entry<String, Integer> key = i.next();  
                        System.out.println("Map Value:" + smp.get(key));  
						System.out.println(i.next());
						smp.put("English",93);
						smp.remove("Maths");
		}
		
		System.out.println(smp.entrySet());
		
		
		
		
		
		/*
		
			
		
		Map<String,Integer> cmp=new ConcurrentHashMap<String,Integer>();
		cmp.put("Social",50);
		cmp.put("Maths",50);
		cmp.put("Science",80);
		Iterator<Entry<String, Integer>> i1 = cmp.entrySet().iterator();
		while(i1.hasNext())
		{
			System.out.print(i1.next()+ " ");
			cmp.put("English",93);
		}
		System.out.println();
		System.out.println(cmp);
		
		
		Set set = mp.entrySet();
		Iterator i2 = set.iterator();
	while(i2.hasNext())
	{
		Map.Entry me = (Map.Entry)i2.next();
        System.out.print(me.getKey() + ": ");
        System.out.println(me.getValue());
        
	}
	
	System.out.print(mp.entrySet());
	
	System.out.println();
*/
		
	}

}
