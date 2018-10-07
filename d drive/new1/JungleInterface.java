interface Animal
{
	void speak();
	void move();
	int NO_OF_LEGS=4;
	 
}
class Dog implements Animal
{
	
	public void speak()
	{
		System.out.println("dog bark");
	}
	public void move()
	{
		System.out.println("dog jump");
	}


}
class Horse implements Animal
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
class JungleInterface 
{
	public static void main(String args[])
	{
		
		Animal a;
		a=new Dog();
		a.speak();
		a.move();
		System.out.println("Dog has"+Animal.NO_OF_LEGS+"legs");
		a=new Horse();
		a.speak();
		a.move();
		System.out.println("Horse has"+Horse.NO_OF_LEGS+"legs");
	}

}
