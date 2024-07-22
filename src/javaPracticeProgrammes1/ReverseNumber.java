package javaPracticeProgrammes1;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some number :");
		n = sc.nextInt();
		while(n>0)
		{
			int r = n%10;
			//System.out.println("the Reverse number is:" +r);
			System.out.print(r);
			n = n/10;
		}
		}
}
