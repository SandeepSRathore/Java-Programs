class C
{
	int x;
	public void set(int a)
	{
		x=a;
	}
	public void show()
	{
		System.out.println("X="+x);
	}
}
class B extends C
{
	int x;
	public void set(int a,int b)
	{
		super.x=a;
		x=b;
	}
	public void show()
	{
		super.show();
		System.out.println("Y="+x);
	}
}
class HidingSuperClassMember
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.set(3,4);
		b1.show();
	}
}