package javaPracticeProgrammes1;

import java.util.Scanner;

public class countTheWords {
	//count the words in a given String
	public static void main(String[] args) {

		System.out.println("Enter any string :");//Welcome to java
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		int count=1;
		for(int i =0;i<str.length();i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++; 
			}
		}
		System.out.println("Number of words in a string :" +count);
	}
}





