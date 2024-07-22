package javaPracticeProgrammes1;

class Encap
{
	private int value1; //data hiding
  public void set1(int x)//data Abstraction
	{
	value1 = x;	
	}
  public int get1()
  {
  	return ++value1;
  }

}
	public class Encapsulation {
	public static void main(String[] args) {
		Encap r = new Encap();
		r.set1(400);
		System.out.println(r.get1());

	}
 }
