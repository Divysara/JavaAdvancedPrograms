
public class Constructor {

	int accno;
	String name;
	public Constructor() 
	{
		name = "sruthi";
		accno = 123;
		int age = 32;
		
	}
	
	void display() 
	{
		System.out.println("accno: "+ accno);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c = new Constructor();
		System.out.println(c.accno +"-"+ c.name);
		c.display();
	}

}
