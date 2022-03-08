package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class MostRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Character,Integer> mp=new LinkedHashMap<Character,Integer>();
		String str="ProgrammingPart";
		char[] ch = str.toCharArray();
		for(char c:ch)
		{
			if(mp.containsKey(c))
			{
				mp.put(c,mp.get(c)+1);
			}
			else
			{
				mp.put(c,1);
			}
		}
		
		char ky=' ';
		Integer vl=0;
		for(Map.Entry<Character,Integer> me:mp.entrySet())
		{
			if(me.getValue() >vl)
			{
				ky=me.getKey();
				vl=me.getValue();
			}		
		}
		System.out.println("Most Repeated Character is: ");
		System.out.println(ky+" Ocurred "+vl + " times");
	}

}
