class point3D
{
	private int x,y,z;
	public point3D(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
	}
	public point3D(int a,int b)
	{
		this(a,b,0);
	}
	public point3D(int a)
	{
		this(a,0,0);
	}
	public point3D()
	{
		this(0,0,0);
	}
	public point3D(point3D p)
	{
		this(p.x,p.y,p.z);
		
	}
	public void show()
	{
		System.out.println("x="+x+"y="+y+"z="+z);
	}
}
class CallOneContructorToAnotherContructor
{
	public static void main(String args[])
	{
		point3D p1=new point3D(2,3,4);
		System.out.println("first point is");
		p1.show();
			point3D p2=new point3D(5,4);
		System.out.println("second point is");
		p2.show();
			point3D p3=new point3D();
		System.out.println("third point is");
		p3.show();
			point3D p4=new point3D(p1);
		System.out.println("first point is");
		p4.show();
	}
}