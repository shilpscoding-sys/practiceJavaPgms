package javaPracticeProgrammes1;

import java.util.HashMap;
import java.util.Map;

public class duplicatesWordsCountInString {

	public static void main(String[] args) {
		//duplicate words count in a string
		String str = "i love my india i love my country";
        String[] s = str.split(" ");
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(String st:s)
        {
        	Integer old = map.get(st);
        	if(old == null)
        	{ old =0;
        	}
        	map.put(st, old+1);
        }
        System.out.println(map);
        
        	
        
	}

}
