class Rational
{
	private int num,deno;
	public Rational()
	{

	}
	public Rational(int n,int m)
	{
		num=n;
		deno=m;
	}
	public Rational(Rational r)
	{
		num=r.num;
		deno=r.deno;
	}
	public String toString()
	{
		return num+"/"+deno;
	}
	public boolean equals(Object o)
	{
		if(o==null)
			return false;
		Rational r=(Rational)o;
		if((num==r.num)&&(deno==r.deno))
			return true;
		else
			return false;
	}
	public Object clone()
	{
		Rational temp=new Rational();
		temp.num=num;
		temp.deno=deno;
		return temp;
	}
	public void set(int n,int m)
	{
		num=n;
		deno=m;
	}
	public void show()
	{
		System.out.println(num+"/"+deno);
	}
	public Rational add(Rational r)
	{
		Rational temp=new Rational();
		temp.deno=deno*r.deno;
		temp.num=(num*r.deno)+(deno*r.num);
		return temp;
	}
	public Rational less(Rational r)
	{
		Rational temp=new Rational();
		temp.deno=deno*r.deno;
		temp.num=(num*r.deno)-(deno*r.num);
		return temp;
	}
	public Rational multiply(Rational r)
	{
		Rational temp=new Rational();
		temp.num=num*r.num;
		temp.deno=deno*r.deno;
		return temp;
	}
	public Rational divide(Rational r)
	{
		Rational temp=new Rational();
		temp.num=num*r.deno;
		temp.deno=deno*r.num;
		return temp;
	}
}