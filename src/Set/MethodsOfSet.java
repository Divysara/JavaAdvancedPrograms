package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MethodsOfSet {

	public static void main(String[] args) {
//1.Explain How to create Hash Set object with an example?
		
		Set<String> set = new HashSet<String>();
		set.add("Dhivya");
		set.add("uma");
		set.add("tulasi");
		
//2.How to store Object into Hash Set with an example?
		
		
		Set<String> set2= new HashSet<String>();
		set2.add("Dhivya");
		set2.add("uma");
		set2.add("sindhu");
		
//3.How to check Hash Set is empty or not with an example?

		System.out.println("The given set is Empty : "+ set2.isEmpty());
		
//4. How to remove objects from Hash Set with an example?
		
		System.out.println("Before Removing all objects from set:\n" + set2);
		set2.removeAll(set2);
		System.out.println("After Removing all objects from set:\n" + set2);
		
//5. How to add elements to Hash Set in Java Dynamically?
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(40);
		hashSet.add(50);
		System.out.println("Before oject Insertion:\n " + hashSet);
		System.out.println("Is the oject Inserted? \n " + hashSet.add(30));
		for(Integer i:hashSet) {
			System.out.print(i + " ");
		}
//6. WAP to check particular element exist or not in Hash Set?

		System.out.println("\n The Given element exist ? "+ set.contains("uma"));
		
//7. WAP to remove particular element in given Hash Set?		
		
		set.remove("uma");
		System.out.println("After Removing first element from set: \n" + set);
		
//8. WAP to replace particular element in given Hash Set?

		if(hashSet.contains(10)) {
			hashSet.remove(10);
			hashSet.add(100);
		}
		System.out.println("After Replacing the element in the set: \n" + hashSet);
		
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			if(iterator.next()==100)
				iterator.remove();
		}
		hashSet.add(300);
		System.out.println("After Replacing the element in the set: \n" + hashSet);
		
//9. WAP to compare 2 Hash Sets?
		
		Set<String> setHash = new HashSet<>(Arrays.asList("a", "b", "c"));
		Set<String> setHash2 = new HashSet<>(Arrays.asList("a", "b1", "c"));
		boolean result= setHash.equals(setHash2);
		if(result) {
			System.out.println("The Sets are Equal");
		}
		else
			System.out.println("The Given Sets are not Equal");
		
//10. WAP to copy one Hash set to another Hash Set?

		HashSet<String> setHash3 = new HashSet<String>();
		setHash3.addAll(setHash);
	    System.out.println("Set after Copying using addAll Method: \n" + setHash3);
	    
	    //or another way is to clone
	    
	    System.out.println("The original Copy:\n" + setHash3);
	    HashSet setHash4 = (HashSet)setHash3.clone();
	    System.out.println("The Cloned Copy:\n" + setHash4);
	    
//11. WAP to convert array to Hash Set?

	  String[] strarr  = {"Apple", "Pears","Banana", "plums"};
	  Set<String> hash = new HashSet<String>(Arrays.asList(strarr));
	  System.out.println("Array Converted to HashSet: " + hash);
	  
//12. WAP to convert Hash Set to Array?

	  HashSet<Integer> hs = new HashSet<Integer>();
	  hs.addAll(hashSet);
	  System.out.println(" Hash Set : "+ hs);
	  Integer itarr[] = new Integer[hs.size()];
	  hs.toArray(itarr);
	  System.out.println("Hashset Coverted to Array: ");
	  for(int i : itarr)
		  System.out.println(i);
	  
//13. WAP to get particular element from given Hash Set?
		
/*	  The HashSet is not an appropriate choice of collection if you want to retrieve an element using an index. 
	  If your requirement is such, you should use any List implementation like LinkedList or ArrayList. */
	  
	  //but just we can find if the particular element exist or not?
	  Set<Integer> s= new HashSet<Integer>(Arrays.asList(10,20,30));
	  Iterator ite= s.iterator();
	  Integer element = 30;
	  while(ite.hasNext()) {
		  if(s.contains(element)) {
			  System.out.println("The Particular Element " + element + " is found");
			  break;
		  }
	  }
	  
		
	
		
		
	}

}
