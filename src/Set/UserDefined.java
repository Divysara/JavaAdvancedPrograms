package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefined {

	public static void main(String[] args) {

//28. Explain Can We add duplicate user-defined objects to Set implemented classes with an example? If yes then what is solution?
		
/* YES ! we can add duplicate user-defined objects to Set implemented classes,
 *  bcz the equals method uses object reference and not the content.
 *   so to avoid that we can overrirde the equals and hashcode method in our classes. */		
		
		Set<Customer> s=new HashSet<Customer>();
		s.add(new Customer(202,"Chitra","Delhi"));
		s.add(new Customer(101,"Avni","Chennai"));
		s.add(new Customer(101,"Oshi","Mumbai"));
		s.add(new Customer(101,"Oshi","Mumbai"));
		System.out.println(s);	
			
	}

}
class Customer{

	int cno;
	String cname;
	String loc;
	
	//getters and setters
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	// Paramaterised Constrcutor for the class customer
	
	public Customer(int cno, String cname, String loc) 
	{
		this.cno = cno;
		this.cname = cname;
		this.loc = loc;
	}
	
	 // OVERRIDE toString method
	
	public String toString()
	{
		return cno+"-"+cname+"-"+loc;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag=false;
		Customer cobj=(Customer)obj;
		if(this.cno==cobj.getCno() && this.cname.equals(cobj.getCname())& this.loc.equals(cobj.getLoc()))
		{
			flag=true;
		}
		return flag;
	}
	

}