package javaPracticeProgrammes1;

import java.util.HashMap;
import java.util.Map;

public class getCharduplicate {
//duplicate/occurrence of each character in a string Through Generic method

	
	public static void dulplicateCharGen(String name)
	{
     Map<Character,Integer> map = new HashMap<Character,Integer>();
	char[] ca = name.toCharArray();
	for(Character c :ca)
    {
 	   if(map.containsKey(c))
 	   {
 		   map.put(c,map.get(c)+1);
 	   }
    else {
 	   map.put(c,1);
    }
    }
	System.out.println(name+ " : " +map);
	}
	public static void main(String[] args) {

		dulplicateCharGen("test");

	}

}	
	
	
	
	
	
	
	
	
