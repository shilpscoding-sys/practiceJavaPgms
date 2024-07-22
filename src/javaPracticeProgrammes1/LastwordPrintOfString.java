package javaPracticeProgrammes1;

import java.util.Scanner;

public class LastwordPrintOfString {
	
	public static void main(String[] args) {
		
	    System.out.println("Enter any String :");
	    Scanner sc = new Scanner(System.in); //welcome to Nagpur
	    String str =sc.nextLine();
	    int len =str.length();
	    int lastIndex = str.lastIndexOf(' ');
	    String d1 = str.substring(lastIndex+1);
	    System.out.println(d1);    
			
			
		}

}
