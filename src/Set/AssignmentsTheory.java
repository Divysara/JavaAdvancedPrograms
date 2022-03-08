package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class AssignmentsTheory {

	public static void main(String[] args) {
		
//23. How to make a Hash Set or Linked Hash Set or Tree Set as thread safe?
		/* If you want to synchronize HashSet in Java or looking for a
		 * thread-safe alternative of HashSet then there are following options.	
		 * 1.Collections.synchronizedSet()
		 * 2.CopyOnWriteArraySet	
		 */
				Set<String> numSet = Collections.synchronizedSet(new HashSet<String>());
				
				numSet.add("A");
				numSet.add("B");
				numSet.add("C");
				numSet.add("D");
				System.out.println(numSet);	
				Iterator<String> numit = numSet.iterator();
				while(numit.hasNext()) {
					numSet.add("E");
				}
				System.out.println(numSet);	
				
//29.List down methods to make collection thread-safe with an examples?
		
				Set<String> copy =new CopyOnWriteArraySet<String>();
				copy.add("B");
				copy.add("C");
				copy.add("A");
				System.out.println(copy);
				Iterator<String> ite = copy.iterator();
				while(ite.hasNext())
				{
					System.out.print(ite.next() + " ");
					copy.add("F");
				}
				System.out.println(copy);
		
	}

}
