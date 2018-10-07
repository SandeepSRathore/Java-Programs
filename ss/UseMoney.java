import java.io.*;
class Money
{
	private int rs;
	private int paisa;
	public Money()
	{}
	public Money(int rs,int paisa)	
	{
	this.rs=rs;
	this.paisa=paisa;
	}
	public Money(Money m)
	{
	rs=m.rs;
	paisa=m.paisa;
	}
	public void read(int rs,int paisa)
	{
		this.rs=rs;
		this.paisa=paisa;
	}
	public void show()
	{
	System.out.print("rupees is"+rs+"paisa is"+paisa);
	}
}
class UseMoney
{
	public static void main(String args[])
	{
	Money m1=new Money();
	System.out.println("first amout is");
	m1.show();
	Money m2=new Money(100,20);
	System.out.print("second amount is");
	m2.show();
	m1.read(200,80);
	System.out.print("now first amount is");
	m1.show();
	Money m3=new Money(m2);
	System.out.println("third amount is");
	m3.show();
	}
}
