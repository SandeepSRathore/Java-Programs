class c
{
	private int x;
	public void setX(int a)
	{
		x=a;
	}
	public void showX()
	{
		System.out.println("X="+x);
	}
	
}
class B extends c
{
	private int y;
	public void setXY(int a,int b)
	{
		setX(a);
		y=b;
	}
	public void showXY()
	{
		showX();
		System.out.println("y="+y);
	}
}

class Inheritanceconcept
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.setXY(3,4);
		b1.showXY();
	
		System.out.println();
	}
}