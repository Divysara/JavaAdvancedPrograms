package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorMethod {

	public static void main(String[] args) {
	/* The primary difference between an ArrayList and CopyOnWriteArrayList is
	that a CopyOnWriteArrayList is synchronized, whereas an ArrayList is not synchronized.
	This means that only a single thread can operate on a CopyOnWriteArrayList instance 
	at a time and other threads need to wait until that lock is released, 
	whereas multiple threads can operate on an ArrayList instance concurrently. */
		
		List<String> l=new CopyOnWriteArrayList<String>();
		l.add("B");
		l.add("C");
		l.add("A");
		Iterator<String> it = l.iterator();
		System.out.println("CopyOnWrite ArrayList");
		while(it.hasNext())
		{
			System.out.println(it.next());
			l.remove("C");
		}
		System.out.println("CopyOnWrite ArrayList after removing c" + l);  
		
		
		List<String> l2=new ArrayList<String>();
		l2.add("B");
		l2.add("C");
		l2.add("A");
		Iterator<String> it2 = l2.iterator();
		System.out.println("ArrayList");
		while(it2.hasNext())
		{
			System.out.println(it2.next());
			//l2.remove("C");  // this will throw exception called "java.util.ConcurrentModificationException"
		}
		System.out.println("ArrayList after removing c"+ l2);  
		
		
		// PGM to convert ArrayList to Array.
	
		List<String> l1=new ArrayList<String>();
		l1.add("B");
		l1.add("C");
		l1.add("A");
	System.out.println("Conversion from List to Array");
		String[] s =   l1.toArray(new String[l1.size()]);
		for(String temp:s)
			System.out.println(temp);
		
		
		// PGM to convert Array to ArrayList.
		
		Integer a[] = {1,2,3,4};
		List<Integer> al = Arrays.asList(a);
		System.out.println("Conversion from Array to List:  ");
		//ArrayList al =  (ArrayList) Arrays.asList(a); this causes error
		System.out.println(al);
		
	}

}
