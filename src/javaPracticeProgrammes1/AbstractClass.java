package javaPracticeProgrammes1;

public class AbstractClass {


	public static void main(String[] args) {


		Dog d = new Dog();
		Lion l = new Lion();
		d.sound();l.sound();
	}
}

     abstract class animal
    {
	animal()
	{
		System.out.println("all animals are here...!");
	}

	public abstract void sound();
    }
     class Dog extends animal
    {
	Dog()
	{
		super();
	}

	public void sound()
	{
		System.out.println("The dod is Barking");
	}
    }

    class Lion extends animal
    {
	Lion()
	{
		super();
	}
	public void sound()
	{
		System.out.println("The lion is Roars");
	}

}


