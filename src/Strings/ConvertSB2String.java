package Strings;

public class ConvertSB2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer  sb = new StringBuffer("welcome");
		String str = sb.toString();
		System.out.println("Before append: \n"+ sb +"\n"+ str);
		sb.append(".com");
		System.out.println("After append: \n"+ sb +"\n"+ str);

		String s = "Java Programming";
		StringBuffer sb2 = new StringBuffer(s);
		System.out.println(sb2);
		s = "hello";
		System.out.println(s);
		sb2.append(s);
		System.out.println(sb2);
		StringBuilder sbl = new StringBuilder(sb2);
		System.out.println(sbl);
		StringBuilder sbl2 = new StringBuilder();
		//sbl2 = s; this is wrong way doing it. 
		sbl2.append(s);
		
		System.out.println(sbl2);

	}

}
