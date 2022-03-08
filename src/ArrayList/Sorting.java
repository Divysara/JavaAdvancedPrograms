package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sorting two array list
		
		ArrayList<String> arrstr = new ArrayList<String>();
		
		
		arrstr.add("dhivya");
		arrstr.add("nandhini");
		arrstr.add("uma");
		arrstr.add("anu");
		System.out.println(arrstr);
		Collections.sort(arrstr);
		System.out.println(arrstr);
		Iterator it = arrstr.iterator();
		
		for(String s : arrstr) {
			System.out.println(s);
		}
		
		while(it.hasNext()) {
			arrstr.add("tulasi");
		}
		System.out.println(arrstr);
		
		
	List<Integer> list = new CopyOnWriteArrayList<Integer>();
	list.add(10);
	list.add(20);
	Iterator it1 = list.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
		list.add(30);
		list.remove(0);
		
		
	}
	
		System.out.println(list);
		
	}
	
	

}
