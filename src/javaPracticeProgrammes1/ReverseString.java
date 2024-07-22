package javaPracticeProgrammes1;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Samaira";// for hard coded string
		String rstr = " ";
		for(int i=0;i<str.length();i++)
		{
	char ch = str.charAt(i);
	  rstr = ch +rstr;
		}
	
	System.out.println("The reverse String is :" +rstr );
	}
}
	


