package javaPracticeProgrammes1;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
	 int n,i,count = 0;
	 System.out.println("Enter any number");//9
	 Scanner sc =new Scanner(System.in);//1,2,3,4,5,6,7,8,9
	   n = sc.nextInt();
	   for(i=1;i<=n;i++)
	   {
		   if(n%i==0)
		   {
			   count++;
		   }
	   }
		if(count==2)
		{
			System.out.println("This is prime number");
		}
		
		else {
			System.out.println("This is not prime number");
		}
		
		
	}

}
