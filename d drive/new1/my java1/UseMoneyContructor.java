import java.io.*;
class Money1
{
	private int rs,paisa;
	public Money1()
	{
		rs=paisa=0;
	}
	public Money1(int r,int p)
	{
		rs=r;
		paisa=p;
	}
	public Money1(Money1 m)
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
	public static void main(String args[])
	{
		Money1 m1=new Money1();
		System.out.println("first amt is:");
		m1.show();
		Money1 m2=new Money1(100,20);
		System.out.println("sec amt is:");
		m2.show();
		m1.set(200,20);
		m1.show();
		Money1 m3=new Money1(m2);
		m3.show();
	}
}