class Rational
{
	private int num;
	private int den;
	public Rational()
	{}
	public Rational(int n,int d)
	{
	num=n;
	den=d;
	}
	public Rational(Rational r)
	{
	num=r.num;
	den=r.den;
	}
	public void set(int n,int d)
	{
	num=n;
	den=d;
	}
	public void show()
	{
	System.out.print(num+"/"+den);
	}
}
class UseRational
{
	public static void main(String args[])
	{
	Rational r1=new Rational();
	r1.show();
	Rational r2=new Rational(1,2);
	r2.show();
	Rational r3=new Rational(r2);
	r3.show();
	}
}

	
