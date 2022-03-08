package Java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamAPIDemo {

	
	public static void main(String[] args) {
		
/*1.First we sort user defined objects before java 8	
 *****************************************************************/
		
		//calling the getDetails method which returns list and hence we are storing it in a list

		System.out.println("SORTING BEFORE JAVA 8");
		System.out.println("**********************");
	
		List<Employee>  emp= DOA.getDetails();
		
		Comparator<Employee> c = Comparator.comparing(Employee::getId);
		
		
		Collections.sort(emp, new MyCompare()); // sorting the emp by using MyCompare class object(without identity)
		
		System.out.println(emp);
		System.out.println();
		
/*2. Now we sort objects using java 8 features - Lamba Expression
 *****************************************************************
		
		a. Theres's no need for seperate class creation which implements comparator Interface
		b. no need for Compare - method overridding
		*/
		List<Employee> emp1 = DOA.getDetails(); 
		System.out.println("SORTING USING LAMBDA EXPRESSION");
		System.out.println("********************************");
		

		Collections.sort(emp1,(o1, o2) ->o1.getName().compareTo(o2.getName()));
		
		System.out.println(emp1);
		System.out.println();
		
/*3. Now we sort objects using java 8 features - Lamba Expression & StreamAPI
*****************************************************************************	*/	
		
		System.out.println("SORTING USING LAMBDA & STREAM-API");
		System.out.println("**********************************");
		List<Employee> emp2 = DOA.getDetails(); 
		
		emp2.stream().sorted((o1, o2) ->o1.getName().compareTo(o2.getName())).forEach(x->System.out.println(x));
		
		//.stream().forEach(x->System.out.println(x));
		
		// Another Optimized Way of sorting by Id
		
		System.out.println("SORTING USING OPTIMIZED LAMBDA & STREAM-API");
		System.out.println("*******************************************");
		
		emp2.stream().sorted(Comparator.comparing(e ->e.getId())).forEach(System.out::println);
		System.out.println();
		
/*4. Now we sort objects by using Method Reference 
**************************************************/		
		
		System.out.println("SORTING USING LAMBDA & STREAM-API WITH METHOD REFERENCE");
		System.out.println("********************************************************");
		
		emp2.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);

	}

}


class MyCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (o1.getName().compareTo(o2.getName()));
	}
	
}