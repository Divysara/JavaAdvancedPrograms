package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListAssignment3 {

	public static void main(String[] args) {
		
// 21. Add user-class to Array List or Vector or Linked List?
		
		LinkedList ll= new LinkedList();
		
		
		
		
//22. First occurrence of an element in given Array List?
		
		 ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c","a","d","g","a","i"));
	     int firstIndex = list.indexOf("b"); 
	     System.out.println("The Element 'B' first Occured in the index: " +firstIndex);
	     firstIndex = list.indexOf("x");
	     System.out.println("The Element 'X' first Occured in the index: " + firstIndex);
	        
//23. Last occurrence of an element in given Array List?
	     
	     int lastIndex = list.lastIndexOf("a");
	     System.out.println("The Element 'A' Last Occured in the index: " +lastIndex);

	     
//24. Increase the current capacity of an Array List?
	     
	     
	     ArrayList<Integer> arrlist = new ArrayList<Integer>(2);
	     System.out.println(arrlist.size());
	     arrlist.ensureCapacity(40); // used to increase the capacity, but we cant look or see if it has increased.
	     System.out.println(arrlist.size());
	     arrlist.add(10);
	     arrlist.add(20);
	     arrlist.add(30);
	     arrlist.add(40);
	     arrlist.add(50);
	     
	     System.out.println(arrlist + " &\n" + arrlist.size());
	     
//25. Decrease the current capacity of an Array List to the current size?
	     
	     arrlist.trimToSize(); // there's no proof that size will be reduced. but still we can use to save the space
	     System.out.println(arrlist.size());
	     arrlist.add(60);
	     System.out.println(arrlist + " &\n" + arrlist.size());

//26. Find out whether the given Array List is empty or not?
	    /* a).ArrayList.isEmpty() method returns true if the ArrayList is empty, and false if it is not empty.
	       b).ArrayList.size() can also be used*/
	     
	     ArrayList<String> myList = new ArrayList<String>();
         
	        if(myList.isEmpty()) 
	            System.out.println("ArrayList is empty.");
	        else 
	            System.out.println("ArrayList is not empty.");
	       
	        //or Another way
	        
	        if(myList==null || myList.size()==0) 
	            System.out.println("ArrayList is empty.");
	        else 
	            System.out.println("ArrayList is not empty.");
	        
	        myList.add("Java");
	        if(myList.isEmpty()) 
	            System.out.println("ArrayList is empty.");
	        else 
	            System.out.println("ArrayList is not empty.");
	        
//27. Append an element at the end of an Array List?
	        
	        myList.add("SpringBoot");
	        System.out.println("After Appending: "+ myList);
	        
	        
//28. Insert an element at a particular position of an Array List?
	        
	        myList.add(1,"SQL");
	        System.out.println("After Inserting in a particular position: "+ myList);
	        
//29. Serialize an Array List in java?
	        
//30. Synchronize an Array List in java
	 /*We need to synchronize the shared resources to ensure that at a time only one thread is
	   able to access the shared resource. If an Object is shared by multiple threads then there 
	   is need of synchronization in order to avoid the Object's state to be getting corrupted. 
	   Synchronization is needed when Object is mutable. */      

	 /* a).Collections.synchronizedList() method – It returns synchronized list backed by the specified list.
	    b).CopyOnWriteArrayList class – It is a thread-safe variant of ArrayList.*/
	        
	        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
	        
	      //namelist is synchronized by using the synchronizedList method
	       
	      namesList.add("Amit");
	      namesList.add("Bharath");
	       
	      synchronized(namesList)  //Use explicit synchronization while iterating 
	      {
	          Iterator<String> iterator = namesList.iterator(); 
	          while (iterator.hasNext()) 
	          {
	              System.out.println(iterator.next());
	             // namesList.add("ram");
	          }
	      }
	      System.out.println(namesList);
	      
	      //b). CopyOnWriteArrayList class
	      
	      
	      List<String> namesList1 = new CopyOnWriteArrayList<String>();
	        
	      //namelist is synchronized by using the synchronizedList method
	       
	      namesList1.add("Amit");
	      namesList1.add("Bharath");
	       
	       //Synchronized block is not required in this method
	      
	          Iterator<String> iterator1 = namesList1.iterator(); 
	          while (iterator1.hasNext()) 
	          {
	              System.out.println(iterator1.next());
	              namesList1.add("ram");
	          }
	          System.out.println(namesList1);
	      
//31. Traverse or iterate the Array List?
/*1.We can use Iterator to traverse List and Set both 
  2.but using ListIterator we can only traverse list.*/ 	          
	          
	         //a). Enhanced ForLoop
	          ArrayList<Integer> listnew = new ArrayList<Integer>();
	          listnew.add(2);
	          listnew.add(4);
	          listnew.add(6);
	          listnew.add(8);
	          for(Integer i : listnew) {
	        	  System.out.println(i);
	          }
	        
	          //b). Iterator
	          
	          Iterator iterator = listnew.iterator();
	          while(iterator.hasNext()) {
	        	  System.out.print(iterator.next()+ " ");
	          }
	          System.out.println();
	          
	          //c).Normal For Loop
	          
	          for(int i=0; i<listnew.size();i++) {
	        	  System.out.print(listnew.get(i)+ " ");
	          }
	          System.out.println();
	          
	          //d). ListIterator
	          
	          System.out.println("Traversing the list in forward direction:");
	          ListIterator<Integer> listite = listnew.listIterator();
	          while(listite.hasNext()) {
	        	  System.out.print(listite.next() + " ");
	          }
	          System.out.println();
	          System.out.println("\nTraversing the list in backward direction:");
	          
	          while(listite.hasPrevious()) {
	        	  System.out.print(listite.previous() + " ");
	          }
	          System.out.println();

	        
	         
	}

}
