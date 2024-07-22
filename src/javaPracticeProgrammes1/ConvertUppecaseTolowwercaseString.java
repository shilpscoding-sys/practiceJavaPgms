package javaPracticeProgrammes1;

import java.util.Scanner;

public class ConvertUppecaseTolowwercaseString {

	public static void main(String[] args) {
		char ch,ch2;
		System.out.println("Enter Any Character :");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);//ch=a
		if(ch>='A' && ch<='Z')
		{
			ch2 = Character.toLowerCase(ch);
			System.out.println(ch2);
		}
		else
			{
			ch2 = Character.toUpperCase(ch);
			System.out.println(ch2);	
			}
		}
		
		

	}


