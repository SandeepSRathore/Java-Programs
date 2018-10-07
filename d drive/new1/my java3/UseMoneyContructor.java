class Money
{
	private int rs,paisa;
	public Money()
	{
		rs=paisa=0;
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
	public void set(int r,int p)
	{
		rs=r;
		paisa=p;
	}
	public void show()
	{
		System.out.println(rs+"."+paisa);
	}
}
class UseMoneyContructor
{
	public static void main(String args())
	{
		Money m1=new Money();
		System.out.println("first amt is:");
		m1.show();
		Money m2=new Money(100,20);
		System.out.println("sec amt is:");
		m2.show();
		
	}
}