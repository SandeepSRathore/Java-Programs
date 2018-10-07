import java.io.*;
class Employee
{
private String name;
private int age;
private float sal;
	public Employee()
	{
		Console con=System.console();
		System.out.print("Enter the name:");
		name=con.readLine();
		System.out.print("Enter the age:");
		age=Integer.parseInt(con.readLine());
		System.out.print("Enter the sal:");
		sal=Float.parseFloat(con.readLine());
	}
	public Employee(String name,int age,float sal)
	{
	
		this.name=name;
	
		this.age=age;
			
		this.sal=sal;
	}
	public Employee(Employee m)
	{

	name=m.name;
	age=m.age;
	sal=m.sal;
	}
	public void show()
	{
			System.out.println("detail is:");
			System.out.println("NAME is:"+name);
			System.out.println("AGE is:"+age);
			System.out.println("SAL is:"+sal);
	}
}
class UseEmployeeNoInputForContrucorClass
{
	public static void main(String args[])
	{
		System.out.println("first detail is");
		Employee m1=new Employee();
		m1.show();
		System.out.println("second detail is");
		Employee m2=new Employee("ram",45,5000.0f);
		m2.show();
		System.out.println("copy of second");
		Employee m3=new Employee(m2);
		m3.show();
		
		
	}
}