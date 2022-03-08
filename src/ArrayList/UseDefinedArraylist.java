package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseDefinedArraylist {
	

	public static void main(String[] args) {
		
		
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(new Student(20,"Dhivya",212));
		arr.add(new Student(21,"Vilona",200));
		arr.add(new Student(25,"Harini",205));
		
		System.out.println(arr);
		Collections.sort(arr);
	
		System.out.println(arr);
	}

}
class Student implements Comparable<Student>{
	String name;
	int rollno, age;
	
	Student(int i, String string, int j){
		this.name= string;
		this.age=i;
		this.rollno=j;
		
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return name+"-"+rollno+"-"+age;
	}

	

	@Override
	public int compareTo(Student s) {
		if(this.rollno > s.getRollno())
		{
			return 1;
		}
		else if(this.rollno <s.getRollno())
		{
			return -1;
		}
		else
		{
			return 0;
		}		
	}

	
	
}