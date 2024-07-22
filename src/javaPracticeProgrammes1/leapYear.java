package javaPracticeProgrammes1;

import java.util.Scanner;

public class leapYear {
	    public static void main(String[] args) {
		int y;
		System.out.println("Enter Any Year :- ");
		Scanner Sc = new Scanner(System.in);
		y = Sc.nextInt();
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
		{
			System.out.println("This is Leap year");

		}
		else
		{
			System.out.println("This is not Leap year");	
		}


	}


}


