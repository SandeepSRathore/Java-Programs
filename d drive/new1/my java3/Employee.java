import java.io.*;
class Employee
{
	private String name;
	private int age;
	private float sal; 
	public void read()
		
	{
		Console con=System.console();
		System.out.print("Eneter the name:");
		name=con.readLine();
		System.out.print("Eneter the Age:");
		age=Integer.parseInt(con.readLine());
		System.out.print("Eneter the sal:");
		sal=Float.parseFloat(con.readLine());
		
	}
	public void show()
	{
		System.out.println("NAME:"+name);
		System.out.println("AGE:"+age);
		System.out.println("SALARY:"+sal);
	}
}