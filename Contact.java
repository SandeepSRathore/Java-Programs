package a.b;
import a.b.c.Person;
public class Contact extends Person
{
	private int phone;	
	public Contact()
	{
		phone=0;
	}
	public Contact(String s1,String s2,int n)
	{
		super(s1,s2);
		phone=n;
	}
	public Contact(Contact c)
	{
		super(c);
		phone=c.phone;
	}
	public void show()
	{
		super.show();
		System.out.println("PHONE NO :"+phone);
	}
}