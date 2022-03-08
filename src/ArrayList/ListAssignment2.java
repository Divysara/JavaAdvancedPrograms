package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListAssignment2 {

	public static void main(String[] args) {
		
//12. Convert Array to list:  
		
/*a) This method returns a List view of the underlying array.

b) List returned by this method would be fixed size.

c) when you change an element into this List corresponding element in the original array will also be changed.

d) since List is fixed size, you can not add element into it. If you try you will get exception.

e) although you can not add() or remove() elements on this List you can still change existing elements by using set method.*/

		
	/*	 String[] asset1 = {"equity", "stocks", "gold", "foreign exchange","fixed income", "futures", "options"}; 
	        List<String> assetList1 = Arrays.asList(asset1);
	        //assetList1.add("commodity");// this WILL throw error
	        System.out.println(assetList1);
	        
	        
// But to avoid that you can create new ArrayList using "new" keyword while you are converting 
		
        String[] asset = {"equity", "stocks", "gold", "foreign exchange","fixed income", "futures", "options"}; 
        List<String> assetList = new ArrayList<String>(Arrays.asList(asset));
        assetList.add("commodity");// this WONT throw error
        System.out.println(assetList);
        
        
// 13. convert ArrayList to String Array and vice-versa?

        
        String[] array = {"a", "b", "c", "d", "c","d"};

	    //Method 1 - converting Stringarray to arrayList
	     List list = Arrays.asList(array);          
	     System.out.println("Original array: " +list);
	    // list.add("dhivya"); this will throw error
	    //System.out.println(list);


	      
	     //Method 2
	      ArrayList<String> list2 = new ArrayList<String>();
	      Collections.addAll(list2, array);
	      
	      list2.remove("a");
	      System.out.println("After Removing 'a' :" +list2);
	      
	      list2.removeAll(Arrays.asList("c"));
	      System.out.println("After Removing 'c' :" +list2);

	     //Method 3
	      List<String> list3 = new ArrayList<String>();
	      	for(String temp : array) {
	    	  list3.add(temp);
	      	}
	    	  System.out.println("Adding Manually to the list : " +list3);
		      list3.remove(3);
		      System.out.println("After Removing 3rd element :" +list3);
		      list3.removeAll(Arrays.asList("d"));
		      System.out.println("After Removing 'd' :" +list3);
		      
		  //converting array list to string array
		      
		    String str[] = new String[list2.size()];
		     list2.toArray(str);
		     for(String s : str) 
		    	 System.out.println(s);
		     
		      
//14. convert Array List to Vector or vice-versa?
		     
		  ArrayList al = new ArrayList(Arrays.asList(1,2,3,4,5));
		  System.out.println(al);
		  Vector vector = new Vector(al);
		  System.out.println(vector);
		  
		  Vector vector1 = new Vector();
		  vector1.add(10);
		  vector1.add(12);
		  System.out.println(vector1);
		  ArrayList al2 = new ArrayList(vector1);
		  System.out.println(al2);
		  
		  
//15.convert Array List to Linked List or vice-versa?
		  
		  LinkedList linkedlist = new LinkedList(al);
		  System.out.println(linkedlist);
		  
		  linkedlist.add("g");
		  
		  System.out.println(linkedlist);
		  
		  ArrayList arraylist = new ArrayList(linkedlist);
		  System.out.println(arraylist);
		  
//16. convert vector to Linked List or vice-versa?

		  Vector vect = new Vector(linkedlist);
		  System.out.println(vect);
		  vect.addAll(Arrays.asList("h","i","j","k","l"));
		  System.out.println(vect);
		  LinkedList ll = new LinkedList(vect);
		  System.out.println(ll);
		  */
		
//17. Whether iterator in Array List/Vector/Linked List is fail-safe or fail-fast?
		  
	/*	  ArrayList arrlist = new ArrayList();
		  arrlist.addAll(Arrays.asList(10,20,30,40,50));
		  Iterator ite = arrlist.iterator();
		  
		  while(ite.hasNext()) {
			  System.out.println(ite.next());
			 // arrlist.remove(2);// this throws-Exception in thread "main" java.util.ConcurrentModificationException
			  //hence the iterator in Array List/Vector/Linked List is fail-fast.
		  }
		  

		List<Integer> arrlist2 = new CopyOnWriteArrayList<Integer>();
		arrlist2.add(10);
		arrlist2.add(20);
		arrlist2.add(30);
		arrlist2.add(40);
		arrlist2.add(50);
		System.out.println(arrlist2);
		 
		  Iterator<Integer> itr = arrlist2.iterator();
		  Integer delete;
		  while(itr.hasNext()) {
			  
			  System.out.println(itr.next());
			  arrlist2.add(60);  // Using copyonwritearraylist we can ony add, set. It doesnot throw any exception
			  //hence it is fail-safe. but cannot remove an element.
		 
		  }
		  
		  System.out.println(arrlist2);
		  
		
		String removeElem = "Perl";
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        System.out.println("Before remove:");
        System.out.println(myList);
        Iterator<String> itr1 = myList.iterator();
        while(itr1.hasNext()){
            if(removeElem.equals(itr1.next())){
                itr1.remove(); // Using iterator remove method we can remove an element from a list, 
                //but only on original collection, not on the copyonwritearraylist.
            }
        }
        System.out.println("After remove:");
        System.out.println(myList);
        
        
          
        List<String> strlist = new ArrayList<String>();
		  strlist.add("a");
		  strlist.add("b");
		  strlist.add("c");
		  strlist.add("d");
		  strlist.add("e");
		  System.out.println(" Before Remove " +strlist);
		  String rem = "d";
			 
		  Iterator<String> stringitr = strlist.iterator();
			  
		  while(stringitr.hasNext()) {
			
			if(rem.equals(stringitr.next())) {
				stringitr.remove();
				}
		 }
			  
			  System.out.println("After remove:" + strlist);
		
			  
//18. Get particular element from given Array List?
			  
// ArrayList.get() method is used to retrieve the element at index 3 and this is displayed. 

			  List aList = new ArrayList();
			  aList.add("Ram");
			  aList.add("Krishna");
			  aList.add("Ganesh");
			  aList.add("Hanuman");
			  aList.add("Lakshman");
			  System.out.println("The element at index 3 in the ArrayList is: " + aList.get(3)); */
			  
//19. Display common elements between 2 Array Lists?
			  
			 /* ArrayList<String> classA = new ArrayList<String>(Arrays.asList("Anu","Banu","Chitra", "Devi"));
			  ArrayList<String> classB = new ArrayList<String>(Arrays.asList("Anu","Bincy","Chitra", "Divya"));
			  System.out.println(classA.retainAll(classB));
			  System.out.println(classA); //Displays common elements alone
			  
			  // OR Another way to find manualy
			
			  ArrayList<String> classC = new ArrayList<String>(Arrays.asList("Anu","Banu","Chitra", "Devi"));
			  ArrayList<String> classD = new ArrayList<String>(Arrays.asList("Anu","Bincy","Chitra", "Divya"));
			
		      ArrayList<String> common = new ArrayList<String>();
		 	  for(String names:classD) {
		 		  if(classC.contains(names)) 
				  common.add(names);
		 	  }
		 	 System.out.println("Common Elements :\n"+ common);*/
			  
//20. Display non common elements between 2 Array Lists?
			  
			  ArrayList<String> classE = new ArrayList<String>(Arrays.asList("Anu","Banu","Chitra", "Devi"));
			  ArrayList<String> classF = new ArrayList<String>(Arrays.asList("Anu","Bincy","Chitra", "Divya"));
			  ArrayList<String> temp = new ArrayList<String>(classE);
			  temp.addAll(classF);
			
			  System.out.println("Clubing two lists elements : "+ temp); 
			
			  ArrayList<String> uncommon = new ArrayList<String>();
			
			  for(String names: temp) {
				 if(!classE.contains(names)) {
					 uncommon.add(names);
				 }
				 if(!classF.contains(names)) {
					 uncommon.add(names);
				 }
			  }
			  System.out.println("UnCommon Elements in both classes :\n"+ uncommon);
	}

}
