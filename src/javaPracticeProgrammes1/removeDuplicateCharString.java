package javaPracticeProgrammes1;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateCharString {
//remove duplicate character in a given string
	public static void main(String[] args) {
   String str ="coconut";
   Set<Character> set = new LinkedHashSet<Character>();//duplicates doesn't allow
   for(int i=0;i<str.length();i++)
   {
	   set.add(str.charAt(i));//c o n u t
   }
	StringBuffer sb = new StringBuffer();
	for(Character c : set)
	{
		sb.append(c);
	}
		
	System.out.println("String text after removing the duplocate is:"+sb);	
		
		
	}

}
