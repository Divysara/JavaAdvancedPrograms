package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
// creating and initializing ArrayList
		
		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println(al1);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(1,50);// inserting the element 50 in the index 1.
		System.out.println(al);
		
		
// converting array to arrayList
		
		Integer []a = {10,20,30,40,50,20,20};
		ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(a));
		System.out.println(l);
		
//Removing an element from the List using index no.
		
			l.remove(3); 
			System.out.println("After rmoving 3rd element: " +l);
			
//Removing an element from the List using data value.

			l.remove((Integer)20);  // removes first occurrence of '20' alone
			System.out.println(l);
			
//Removing the all occurrences of a particular element from the List using data value.
			
			l.removeAll(Arrays.asList(20)); // removes the value of '20' from the entire list
			System.out.println(l);
	      
//Method 1 - converting Stringarray to arrayList	      
	      
		  String[] array = {"a", "b", "c", "d", "c","d"};
 	      List list = Arrays.asList(array);          
	      System.out.println(list);
	     // list.add("dhivya"); this will throw error
	      System.out.println(list);
      
 //Method 2
	      
	      ArrayList<String> list2 = new ArrayList<String>();
	      Collections.addAll(list2, array);
	      System.out.println(list2);
	      list2.remove("a");
	      System.out.println(list2);
	      list2.removeAll(Arrays.asList("c"));
	      System.out.println(list2);

 //Method 3
	      
	      List<String> list3 = new ArrayList<String>();
	      for(String temp : array) {
	    	  list3.add(temp);
	      }
	      System.out.println(list3);
	      list3.remove(3);
	      list3.removeAll(Arrays.asList("d"));
	      System.out.println(list3);
	      
	 /*    int i =0;
	      ArrayList cust = new ArrayList();
	      System.out.println("Enter the details of the customer");
	      while(i<5) {
	      Scanner sc = new Scanner(System.in);
	      cust.add(sc.nextLine());
	      i++;
	      }
	      System.out.println(cust); */
	      
	      
 //Ex: To proove that arraylist accepts duplicates
	      
	      ArrayList alnew = new ArrayList(Arrays.asList("d","e","f",20));
	      System.out.println(alnew);
	      alnew.add('d');
	      
	      System.out.println(alnew);
	      
//Ex: Merge two arrays
	      
	      ArrayList al2 = new ArrayList();
	      al2.addAll(alnew);
	      System.out.println(al2);
	      
//Ex: Inserting value in a particular Index
	      
	      ArrayList al3 = new ArrayList(Arrays.asList("a","b","c",20));
	      
	      al3.addAll(2, al2); // inserts the value of al2 from the index value mentioned 
	      System.out.println(al3);
	      System.out.println(al3.get(4));
	       
	       
//Example for Immutable arraylist:
	       
	   	ArrayList<String> arrstr=new ArrayList<String>();
		arrstr.add("B");		
		arrstr.add("C");
		List<String> immutable = Collections.unmodifiableList(arrstr);
		//immutable.add("D");  -  java.lang.UnsupportedOperationException
		System.out.println(immutable);
		
// How to manually add elements from array to arraylist?
		
		
		
		Integer intarr[] = {10,20,30,40};
		List<Integer> listarr = new ArrayList<Integer>();
		for(Integer n : intarr)
		{
			listarr.add(n);
		}
		
		System.out.println(listarr);
		
// How to compare if two arrayslist are Equal?
		
		List<String> l1=new ArrayList<String>();
		l1.add("B");
		l1.add("C");
		l1.add("A");

		
		List<String> l2=new ArrayList<String>();
		
		l2.add("B");
		l2.add("C");
		l2.add("A");
		boolean flag = l1.equals(l2);
		if(flag)
		{
			System.out.println("2 ArrayList are equal");
		}
		else
		{
			System.out.println("2 ArrayList are not equal");
		}
		
// How to clone ArrayList?
//  ***********************	
   
   ArrayList<String> arl=new ArrayList<String>();
	arl.add("B");
	arl.add("C");
	arl.add("A");
	ArrayList<String> cloned=(ArrayList<String>)arl.clone();
	cloned.add("D");
	System.out.println(arl);
	System.out.println(cloned);
		
		
	}

}
