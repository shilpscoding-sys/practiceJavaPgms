package javaPracticeProgrammes1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class getCharCount {
	//how to count occurrence/duplicate of each character in String
	public static void main(String[] args)
	{
		System.out.println("Enter any String :");
		Scanner Sc = new Scanner(System.in);
		String str = Sc.nextLine();
           char[] ca = str.toCharArray();
           Map<Character,Integer> map = new HashMap<Character,Integer>();
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

           for(Character c : map.keySet())
           {
        	 if(map.get(c)>1)
        	 {
        		System.out.println("Character "+c+" is repeated "+map.get(c)+"times");
        		
        	 }
           }
	}
}
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		 
        		 
        		 
        	 
           


	


















