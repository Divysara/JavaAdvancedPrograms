package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class Assignments2 {
	
	public static void main(String[] args) {
		

		
//24. Give an example when will get ConcurrentModificationException in Hash Set or Tree Set or Linked Hash Set?
/*iterator in HashSet will work on original copy where as iterator in CopyOnWriteArraySet will work on cloned copy
we will get "concurrentmodifaction" exception in case of HashSet 
where as we will not get "concurrentmodifaction" exception in case of CopyOnWriteArraySet 
 */

		HashSet<String> al=new HashSet<String>();
		al.add("B");
		al.add("C");
		al.add("A");
		Iterator<String> i = al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next() + " ");
			//al.add("F"); //ConcurrentModificationException
		}
		System.out.println();
		
//25. How to avoid ConcurrentModificationException with an example?
//we will not get "concurrentmodifaction" exception in case of CopyOnWriteArraySet
		
		Set<String> copy =new CopyOnWriteArraySet<String>();
		copy.add("B");
		copy.add("C");
		copy.add("A");
		Iterator<String> ite = copy.iterator();
		while(ite.hasNext())
		{
			System.out.print(ite.next() + " ");
			al.add("F");
		}System.out.println();
		
//26. What is UnsupportedOperationException and when will get in set implemented classes?
		/* when we try to modify or perform any operation on the 
		 * read-only Set classes then we get this UnsupportedOperationException */
		
		
//27. How to implement generics for Set implemented classes with an example?
		
		Set<Integer> example = new TreeSet<Integer>();
/* Now, this is targeted to only Integer datatype. i.e only Integer objects can be put in the Set.
 *  If we try to put something else in the Set like String or character, the compiler will give an error. 
 *  The checks of generic type occur at the time of compilation.		
 */
		
		

		
//30. Can we use list-iterator to iterate data in set implemented classes?
/* ListIterator works only in the classes that has implemented List interface
 *  such as ArrayList, LinkedList etc. We cannot use ListIterator in Set, Queue, Deque.*/
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("B");
		lhs.add("C");
		lhs.add("A");
		
	/*	Iterator lit = lhs.iterator();
		while(lit.hasNext()) {
			System.out.print(lit.next()+ " ");
		}
		*/

//31. Can we add multiple null’s in set implemented classes? If yes prove with an example?
/* multiple null values can be added, but it displays only one null value, as set implemeneted classes 
 * doesnot allow duplicates.		
 */
		
		HashSet<String> has=new HashSet<String>();
		has.add("B");
		has.add("C");
		has.add("A");
		has.add("null");
		has.add("null");
		
		System.out.println(has);
		
		LinkedHashSet<String> lhas=new LinkedHashSet<String>();
		lhas.add("B");
		lhas.add("C");
		lhas.add("A");
		lhas.add("null");
		lhas.add("null");
		
		System.out.println(lhas);
		
//32.How to make set implemented classes as read-only with an example?
/*Collections.unmodifiableSet() can be used to make HashSet as read-only/immutable
 * once object is converted into immutable, any operation we try to perform will result in "unsupportedoperation" exception.
 */
		HashSet<String> hs=new HashSet<String>();
		hs.add("B");
		hs.add("C");
		hs.add("A");
		System.out.println(hs);
		hs.add("D");
		System.out.println(hs);
		Set<String> immutable = Collections.unmodifiableSet(hs);
		//immutable.add("F"); // java.lang.UnsupportedOperationException, bcz its immutable.
		System.out.println(immutable);

		
	}

}
