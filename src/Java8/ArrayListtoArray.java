package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListtoArray {

	public static void main(String[] args) {
		
		
		// How to convert Arrays to ArrayList?

		String[] array = new String[] {"JAVA", "JSP", "HTML", "SQL"};
        
        List<Object> list = Arrays.stream(array).collect(Collectors.toList());
         
        System.out.println(list);
		
        
        // How to convert Arraylist to Arrays?
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        arrayList.add("JAVA");
        arrayList.add("HTML");
        arrayList.add("JSP");
        arrayList.add("SQL");
       
 
        String[] strArray = arrayList.stream().toArray(String[]::new);
 
        System.out.println(Arrays.toString(strArray));
		
		
	}

}
