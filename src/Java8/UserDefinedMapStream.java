package Java8;

import java.util.Map;
import java.util.TreeMap;

public class UserDefinedMapStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Employee, Integer> map = new TreeMap<>();
		map.put(new Employee(12,"Rohan","Civil", 40000),20);
		map.put(new Employee(18,"Arun","IT", 70000),49);
		map.put(new Employee(2,"Bindhu","Marketing", 50000),37);
		map.put(new Employee(24,"Daniel","Production", 90000),15);
		map.put(new Employee(19,"wysong","HR", 55000),65);
		
		
	}

}
