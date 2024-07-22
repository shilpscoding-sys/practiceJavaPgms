package javaPracticeProgrammes1;

public class ReverseEachAndEveryWordsString {

	public static void main(String[] args) {
		//Reverse Each And Every Words in a given String
		String str = "Mr Arun Mootori";
        String[] words =str.split(" ");
        String reverseString = "";
        
         
        for(String word : words)
        {   
        	String reverseword ="";
        	for(int i = word.length()-1; i>=0;i--)
        	{
        		reverseword = reverseword + word.charAt(i);
        	}
        	reverseString =  reverseString + reverseword + " ";
        }
        	
        System.out.println(reverseString);		
        		 
	}

}
