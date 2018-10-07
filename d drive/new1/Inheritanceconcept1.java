interface X
{
	void a();
	void b();

}
interface Y extends X
{
	void c();
	void d();

}
class Demo implements Y
{
	public void a()
	{
	}
	public void b()
	{
	}
	public void c()
	{
	}
	public void d()
	{
	}
}
class Inheritanceconcept1 extends Demo
{
	public static void main(String args[])
	{
		Demo x;
		x=new Demo();
		x.a();
		x.b();
		x.c();
		x.d();
		
	}
}
