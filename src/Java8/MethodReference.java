package Java8;

import java.util.function.Consumer;
//Driver class
public class MethodReference {

	public static void main(String[] args) {
		// References to Constructor
		// syntax: classname:: new
		
	Consumer<String> c = Student:: new; // Method Reference - constructor
		c.accept("Dhivya");
		
		InterfaceDemo id = Student ::new; //User defined functional interface
		id.test("Dhivya");
	}

}

 
// user -defined class
class Student{
	String name;
	Student(String name){
		this.name = name;
		System.out.println("The name of the student:" + name);
		
		
		
		
		        
	}
}
		        
