import java.io.*;
class Employee
{
	Console con=System.console();
	private int age,salary;
	private String name;
	public Employee()
	{
		name="Unknown";
	}
	public Employee(String n,int a,int s)
	{
		name=n;
		age=a;
		salary=s;
	}
	public Employee(Employee e)
	{
		name=e.name;
		age=e.age;
		salary=e.salary;
	}
	public void setSalary(int n)
	{
		salary=n;
	}
	public void setAge(int n)
	{
		age=n;
	}
	public void setName()
	{
		name=con.readLine();
	}
	public void show()
	{
		System.out.println("NAME : "+name);
		System.out.println("AGE : "+age);
		System.out.println("SALARY : "+salary);
	}
}