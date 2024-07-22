package javaPracticeProgrammes1;

public class CountDigitsOfNumbers {
	public static void main(String[] args) {
		int num=123456;
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
     System.out.println("no.of Digits :" +count);
	}

}
