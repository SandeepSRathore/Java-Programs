class point
{
	private int x;
	private int y;
	final private int z;
	public point()
	{
		z=100;
		
	}
	public point(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
	}
	public void set(int a,int b)
	{
		x=a;
		y=b;
		
	}
	public void show()
	{
		System.out.println("x="+x+"y="+y+"z="+z);
	}
	
}
class Demo3
{
	public static void main(String args[])
	{
		point p1=new point();
		p1.show();
		p1.set(70,80);
		p1.show();
		
		point p2=new point(10,20,500);
		p2.show();
		p2.set(30,40);
		p2.show();
		
	}
}