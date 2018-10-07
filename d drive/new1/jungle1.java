abstract class Animal
{
	//public int x;
	abstract public void speak();
	abstract public void move();
	
}
class Dog extends Animal
{
	public int x=20;
	public void speak()
	{
		System.out.println("Dog bark");
	}
	public void move()
	{
		System.out.println("Dog jum");
	}
	
}
class Hourse extends Dog
{
	public int x=30;
	public void speak()
	{
		System.out.println("Horse neigh");
	}
	public void move()
	{c
		System.out.println("Horse run");
	}
}
class jungle1
{
	public static void main(String args[])
	{
		Animal a;  //=new Animal();
		a=new Dog();
		a.speak();
		a.move();
	//	System.out.println(a.x);
		a=new Hourse();
		a.speak();
	//	System.out.println(a.x);
		a.move();
		Animal arr[]=new Animal[3];
		arr[0]=new Dog();
		arr[1]=new Hourse();
		arr[2]=new Hourse();
		for(int i=0;i<arr.length;i++)
			arr[i].speak();
	}
}
	