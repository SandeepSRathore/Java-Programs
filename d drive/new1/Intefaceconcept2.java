interface X
{
	void a();
	void b();

}
interface Y 
{
	int b();
	void d();

}
interface Z extends X,Y 
{
	void e();
	void f();

}

class Demo implements Z
{
	public void a()
	{
	}
	public void b()
	{
	}
	
	public void d()
	{
	}
	public void e()
	{
	}
	public void f()
	{
	}


}
class Intefaceconcept2 
{
	public static void main(String args[])
	{
		Z x;
		x=new Demo();
		x.a();
		x.b();
		//x.b();
		x.d();
		x.e();
		x.f();
	}
}
