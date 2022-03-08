package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

public class ListAssignment4 {

	public static void main(String[] args) {
		
//32. Initialize an Array List in java?
		// creating and initializing ArrayList
		
			ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
				System.out.println(al1);
				
//33. Find the length of the Array List? 
		/*By using  size() method of ArrayList class we can easily determine the size of the ArrayList. 
		 * This method returns the number of elements of ArrayList. */
		
				System.out.println(al1.size());
				
//35. Sort Array List in ascending order?

				ArrayList<String> list = new ArrayList<String>();   
				// adding elements to the ArrayList   
				list.add("Lexus");   
				list.add("Toyota");   
				list.add("Kia");   
				list.add("Hyundai");   
				list.add("Volvo");   
				list.add("Audi");   
				list.add("Ford");  
				list.add("BMW");  
				// printing the unsorted ArrayList   
				System.out.println("Before Sorting: "+ list);   
				/* Sorting ArrayList in ascending Order by invoking sort() method of the Collections class
				and passed the object of the ArrayList class */ 
				
				Collections.sort(list);   
				System.out.println("After Sorting: "+ list);   
				
//36. Sort Array list Of Strings in Descending Order?
				/* invoked reverseOrder() method along with the sort() method 
				 * of the Collections class and passed the object of the ArrayList class
				 *  i.e., list that sorts the elements in the descending order. */

				Collections.sort(list, Collections.reverseOrder());   
				System.out.println("After Reverse Sorting: "+ list);  

//37. Sort Linked List in java?
				
				LinkedList<String> llist = new LinkedList<String>();   
				// adding elements to the ArrayList   
				llist.add("Lexus");   
				llist.add("Toyota");   
				llist.add("Kia");   
				llist.add("Hyundai");   
				llist.add("Volvo");   
				llist.add("Audi");   
				llist.add("Ford");  
				llist.add("BMW");  
				// printing the unsorted ArrayList   
				System.out.println("Before Sorting LinkedList: "+ llist);   
				/* Sorting ArrayList in ascending Order by invoking sort() method of the Collections class
				and passed the object of the ArrayList class */ 
				
				Collections.sort(llist);   
				System.out.println("After Sorting LinkedList: "+ llist);   
				
//38. Merge two sorted linkedlist
				
				LinkedList<Integer> l1 = new LinkedList<Integer>();
				l1.add(100);
				l1.add(30);
				Collections.sort(l1);
				System.out.println(l1);
				LinkedList<Integer> l2 = new LinkedList<Integer>();
				l2.add(200);
				l2.add(40);
				Collections.sort(l2);
				System.out.println(l2);
				
				LinkedList<Integer> l3 = new LinkedList<Integer>(l1);
				l3.addAll(l2);
				Collections.sort(l3);
				System.out.println(" The merged sorted list: "+ l3);
								
				
//39. Add an element at the middle of the linked list? 
		
				llist.add(2, "Tesla");
				System.out.println("After Inserting an element in LinkedList: "+ llist);   
				
//40. Get sub list from Array List in Java?
				
				ArrayList<String> subLists = new ArrayList<String>(llist.subList(0, 5));
				System.out.println("SubList from a LinkedList: "+ subLists); 

//41.WAP to find 3rd element from end in a linked list in one pass?
				
				System.out.println(llist.size());
				System.out.println("The 3rd Element from the end of the LinkedList: "+ llist.get(llist.size()-3));
				
//43. How to remove duplicates from a Linked List in Java? 

			LinkedList<Integer> numbersList = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));	
			Set<Integer> s = new HashSet<Integer>(numbersList); //convert to set to remove duplicates
			System.out.println(s);
			
			// or use stream().collect(Collectors.toset() method
			
			Set<Integer> setWithoutDuplicates = numbersList.stream().collect(Collectors.toSet());  
			System.out.println(setWithoutDuplicates);
				
//43.b). How to remove duplicates from a Array List in Java? 	
			
			ArrayList<Integer> orig = new ArrayList<Integer>(Arrays.asList(10,20,20,30,30,40,404,404));
			ArrayList<Integer> unique = new ArrayList<Integer>();
			
			for(int i =0;i<orig.size();i++) {
				if(!unique.contains(orig.get(i)))
					unique.add(orig.get(i));
			}
			System.out.println("The Original List: " + orig);
			System.out.println("The Unique List: " +unique);
			
	}

}
