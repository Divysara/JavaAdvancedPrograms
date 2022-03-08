package Strings;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d = new String("ANUS");
        String d1 = new String("ANUSH");
        int value = d.compareToIgnoreCase(d1);
        System.out.println("After Comparison: " +d.compareToIgnoreCase(d1));
        if(value>0){
            System.out.println(d + " is larger than " +d1);
        }
        else if(value<0){
            System.err.println(d + " is smaller than "+ d1);
        }
        else if(value==0){
            System.out.println(d +" is equal to "+ d1);
        }
	}

}
