package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// 14. WAP to display common elements between 2 Hash sets?

				HashSet<String> set = new HashSet<String>();
				set.add("Dhivya");
				set.add("uma");
				set.add("tulasi");
				System.out.println("The First set:\n " + set); 
				
				HashSet<String> set2= new HashSet<String>();
				set2.add("Dhivya");
				set2.add("uma");
				set2.add("sindhu");
				System.out.println("The Second set:\n " + set2);
				
				System.out.println(set2.retainAll(set)); // This function is used to retain all the common elements.
				System.out.println("The Common Elements of two sets:\n " + set2);
				
		//15. WAP to display non common elements between 2 Hash sets?

				HashSet<String> temp = new HashSet<String>(set);
				  temp.addAll(set2);
				
				  System.out.println("Clubing two set elements : "+ temp); 
				
				  HashSet<String> uncommon = new HashSet<String>();
				
				  for(String names: temp) {
					 if(!set.contains(names)) {
						 uncommon.add(names);
					 }
					 if(!set2.contains(names)) {
						 uncommon.add(names);
					 }
				  }
				  System.out.println("UnCommon Elements in both sets :\n"+ uncommon);
				
		//16. How do you find the number of elements present in Tree Set?

				  Set<Integer> treeSet = new TreeSet<Integer>(Arrays.asList(20,30,70,10));
				  System.out.println("The number of Elements present in the treeset: " +treeSet.size());
				  
		//17. How do you append an element at the end of Hash Set?
				  /* can't guarentee that the element added using the add method will be appended last. bcz
				   * HashSet doesnt maintain Insertion order. if at all we want to append then convert them to linked hash set
				   * and perform the appending action.
				   */
				  set2.add("Vani");
				  System.out.println(set2);
				  LinkedHashSet<String> lhs = new LinkedHashSet<String>(set2);
				  lhs.add("Bhavna");
				  System.out.println(lhs);
		//18. How do you insert an element at a particular position of an Array List?
				  /* we can't do this in set bcz it doesnot maintain insertion order.*/
				  
				  ArrayList<Integer> arrlist = new ArrayList<Integer>();
				  arrlist.add(10);
				  arrlist.add(20);
				  arrlist.add(30);
				  arrlist.add(40);
				  arrlist.add(50);  
				  arrlist.add(1,0);
			        System.out.println("After Inserting in an element in a particular position: "+ arrlist);
			        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>(arrlist); 
			        System.out.println(lhs2);
			        //lhs2.add(2,20); this is not possible;
			           
			        
		//19. How do you remove all elements of Tree Set or Hash Set at a time?
		/*Using the clear() method only clears all the element 
		 * from the set and not deletes the set. 
		 * In other words, we can say that the clear() method is used to only empty an existing HashSet.
		 */
			        System.out.println("Before removing the elements: " +treeSet);
			        treeSet.clear();
			        System.out.println("After removing the elements using clear : " + treeSet);
			        
			        
		//20. Can we add null element to a Tree Set and prove with an example?
		/* cannot add null elements to treeset. It doensot allow null elements.
		 * 	   if we try to add it throws null pointer exception     
		 */
			        
			        Set<Integer> treeSet1 = new TreeSet<Integer>();
			        //Populating the HashSet
			        treeSet1.add(1124);
			        treeSet1.add(3654);
			        treeSet1.add(7854);
			        treeSet1.add(9945);
			        System.out.println(treeSet1);
			        //Adding null elements
			      //  treeSet1.add(null);
			        /* Exception in thread "main" java.lang.NullPointerException
			         * bcz Treeset doesnot allow null values.
			         */
			       // System.out.println(treeSet1); 
			        
		//21. Can we add null element to a Hash Set and prove with an example?
		 /* can add null elements to Hashset. It does allow null elements.
		 */
			        HashSet<Integer> hashset = new HashSet<Integer>();
			        //Populating the HashSet
			        hashset.add(1124);
			        hashset.add(3654);
			        hashset.add(7854);
			        hashset.add(9945);
			        System.out.println(hashset);
			        //Adding null elements
			        hashset.add(null);
			        System.out.println(hashset);
			        
		//22. Can we add heterogeneous elements to a Tree Set and prove with an example?
		/*Cannot add heterogeneous elements to the treeset. classcast exception is thrown.
		 * Exception in thread "main" java.lang.ClassCastException: class java.lang.String 
		 * cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
		 */
				        
			        TreeSet treeSet2 = new TreeSet<>();
			        treeSet2.add("Divya");
			       // treeSet2.add(20);
			        System.out.println(treeSet2);
			        
	}
}
		
