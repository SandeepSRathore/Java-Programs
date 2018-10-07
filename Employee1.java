package a;
import a.b.Contact;
public class Employee1 extends Contact
{
	private int salary;
	public Employee1()
	{
		salary=0;
	}
	public Employee1(String s1,String s2,int n,int sal)
	{
		super(s1,s2,n);
		salary=sal;
	}
	public Employee1(Employee1 e)
	{
		super(e);
		salary=e.salary;
	}
	public void show()
	{
		super.show();
		System.out.println("SALARY :"+salary);
	}
}