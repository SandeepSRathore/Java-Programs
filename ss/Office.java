class employee
{
	private String name;
	int age;
	int salary;
	public employee()
	{}
	public employee(String n,int a,int s)
	{
	name=n;
	age=a;
	salary=s;
	}
	public employee(employee e)
	{
	name=e.name;
	age=e.age;
	salary=e.salary;
	}
	public void read(String n,int a,int s)
	{
	name=n;
	age=a;
	salary=s;
	}
	public void show()
	{
	System.out.println("name is"+name+"age is"+age+"salary is"+salary);
	}
}
class Office 
{
	public static void main(String args[])
	{
	employee e1=new employee();
	e1.show();
	employee e2=new employee("sandeep",21,30000);
	e2.show();
	employee e3=new employee(e2);
	e3.show();
	e2.read("kuldeep",22,40000);
e2.show();
	}
}
	 