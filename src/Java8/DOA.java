package Java8;

import java.util.ArrayList;
import java.util.List;

public class DOA {

	
	public static List<Employee> getDetails(){
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(12,"Rohan","Civil", 40000));
		list.add(new Employee(18,"Arun","IT", 70000));
		list.add(new Employee(2,"Bindhu","Marketing", 50000));
		list.add(new Employee(24,"Daniel","Production", 90000));
		list.add(new Employee(19,"wysong","HR", 55000));
		return list;
	}
	

}
