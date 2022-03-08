package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Unique {

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
		
		for(Map.Entry<Character,Integer> me:mp.entrySet())
		{
			if(me.getValue()==1)
				System.out.println("The Unique Character:" + me.getKey());
		}
	}

}
