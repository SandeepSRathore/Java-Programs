class Money
{
	private int rs,paisa;
	public Money()
	{
		
	}
	public Money(int r,int p)
	{
		rs=r;
		paisa=p;
	}
	public Money(Money m)
	{
		rs=m.rs;
		paisa=m.paisa;
	}
	public void set( int r, int p)
	{
		rs=r;
		paisa=p;
	}
	public void show()
	{
		System.out.println(rs+"."+paisa);
	}
	public Money add(Money m)
	{
		Money temp=new Money();
		temp.rs=rs+m.rs;
		temp.paisa=paisa+m.paisa;
		if(temp.paisa>=100)
		{
			temp.rs++;
			temp.paisa%=100;
		}
		return temp;
	}
	public Money less(Money m)
	{
		Money temp=new Money();
		int p1,p2,d;
		p1=(rs*100)+paisa;
		p2=(m.rs*100)+m.paisa;
		d=p1-p2;
		temp.rs=d/100;
		temp.paisa=d%100;
		return temp;
	}
	public Money multiple(int n)
	{
		Money temp=new Money();
		temp.rs=rs*n;
		temp.paisa=paisa*n;
		if(temp.paisa>=100)
		{
			temp.rs+=temp.paisa/100;
			temp.paisa%=100;
		}
		return temp;
	}
}