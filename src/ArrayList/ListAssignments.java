package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListAssignments {

	public static void main(String[] args) {
// 1. How to add elements to Array List Dynamically?
// 2. Add element at particular index of Array List?
// 3. Remove particular element from Array List?


		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(80);
		list.add(50);
		list.add(70);
		System.out.println("The given list elements: " + list);

		list.add(1,30);
		System.out.println("The given list elements after adding in a particular index: " + list);
		
//3.Removing an element from the List using index no.
		
		list.remove(3); 
		System.out.println("After removing 3rd element using index no: " +list);
		
		//Removing an element from the List using data value.

		list.remove((Integer)20);  // removes first occurrence of '20' alone
		System.out.println("After removing element using list value: "+list);
		
		//Removing the all occurrences of a particular element from the List using data value.
		
		list.removeAll(Arrays.asList(20)); // removes the value of '20' from the entire list
		System.out.println("After removing all occurances of the element using list value: " +list);
		
		System.out.println("Before Removing using clear method : " + list);
	    list.clear();
		System.out.println("After Removing using clear method : " + list);

		
		
//4.  Remove duplicates from Array List?
		
		ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	    Set<Integer> setWithoutDuplicates = numbersList.stream().collect(Collectors.toSet());
	    System.out.println("Set After Removing Duplicates; " + setWithoutDuplicates);
		
//5. Remove all elements of an Array List at a time?
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(20);
		list2.add(80);
		list2.add(50);
		list2.add(70);
		
		System.out.println("Before Removing using RemoveAll method : " + list2);	
		list2.removeAll(list2);
		System.out.println("After Removing using RemoveAll method : " + list2);
		
//6. Reverse ArrayList?
		
		ArrayList<String> arrlist = new ArrayList<String>(); 
		 
        //Adding elements to ArrayList object 
        arrlist.add("Apple");         
        arrlist.add("Amazon");        
        arrlist.add("Facebook");
        arrlist.add("Google");
        arrlist.add("IBM");         
        arrlist.add("Tesla");
                 
        //Displaying ArrayList Before Reverse         
        System.out.println("Before Reverse ArrayList:");         
        System.out.println(arrlist);
         
        /*Reversing the list using 
          Collections.reverse() method*/         
        Collections.reverse(arrlist);
         
        //Displaying list after reverse         
        System.out.println("After Reverse ArrayList:");         
        System.out.println(arrlist);

        
//7. join/merge multiple Array Lists?

        ArrayList<String> arrlist2 = new ArrayList<String>(); 
        arrlist2.add("mac");
        arrlist2.add("Hp");
        arrlist2.addAll(arrlist);
         System.out.println(" After Merging: " +arrlist2);
         
//8.check particular element exist or not?

         System.out.println(arrlist2.contains("Hp"));
         
//9. replace particular element in given Array List?

         arrlist2.set(0,"Lenova");
         System.out.println(" After Replacing: " +arrlist2);
         
//10. Compare if two array List are equal?
         
         ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));
         ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
         boolean result = listOne.equals(listTwo);
         if(result)
        	 System.out.println("The list are equal");
         else
             System.out.println("The list are not equal");

//11. copy one array list to another array list? 
         //1.clone() 2. Collections.copy() 3. Copy ArrayList using ArrayList constructor

		//clone: ex 1:
          ArrayList<String> listThree = (ArrayList<String>) listOne.clone();
         System.out.println(listThree);
         
         //1.clone ex:2 
         ArrayList<String> original = new ArrayList<String>();
         original.add("java");
         original.add("c");
         original.add("c++");
        
         ArrayList<String> clone = (ArrayList<String>) original.clone();
         System.out.println(clone);
         clone.add("Phython"); //does shallow copy, that means changes made to original wont affect the cloned one.
	         //similarly chages made to cloned one doesnot affect original.
	         //but this can be found only with objects and not in primitives
	         System.out.println(original);//does shallow copy. not Deep copy.
         //but this can be found only with objects and not in primitives
         System.out.println(original);
         System.out.println(clone); // for primitives it does deep copy only.
         
         //2.Collections.copy() ex:
         List<String> zoo = new ArrayList<String>();
         zoo.add("Zebra");
         zoo.add("Lion");
         zoo.add("Tiger");
         
         List<String> greet = new ArrayList<String>();
         greet.add("Hello");
         greet.add("Hi");
         greet.add("World");
         greet.add("Fox");
         greet.add("leopard");
         Collections.copy(greet,zoo); // copying the ArrayList zoo to the ArrayList greet
         /*Note 1: If the destination list is larger than the source list, 
         all remaining elements of the destination list will be kept as is.
         i.e. if the source list contains 2 elements and destination contains 5, 
         after the copy, the destination list will still retain its last 3 elements.
         If the destination list is not large enough to contain all the elements of the source list, 
         copy method throws IndexOutOfBoundException.  */
         System.out.println(greet);
         
         //3.Copy ArrayList using ArrayList constructor ex:
         ArrayList cons = new ArrayList(zoo);
         System.out.println(cons);
         
         cons.add("monkey");
         
         System.out.println(cons); //changes to cons doesnot affect zoo.
         System.out.println(zoo);
        
         
        

	}

}
