class Animal
{
	public void speak()
	{
		System.out.println("Animal speak");
	}
	public void move()
	{
		System.out.println("Animal move");
	}
}
class Dog extends Animal
{
	public void speak()
	{
		System.out.println("Dog bark");
	}
	public void move()
	{
		System.out.println("Dog jum");
	}
}
class Hourse extends Animal
{
	public void speak()
	{
		System.out.println("Horse neigh");
	}
	public void move()
	{
		System.out.println("Horse run");
	}
}
class Jungle
{
	public static void main(String args[])
	{
		Animal a;
		a=new Dog();
		a.speak();
		a.move();
		//System.out.println(a)
		a=new Hourse();
		a.speak();
		a.move();
	}
}
	