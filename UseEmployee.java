import java.io.*;
class UseEmployee
{
	public static void main(String args[])
	{
		Console con=System.console();
		Employee e1=new Employee();
		System.out.println("Details of the first employee are :");
		e1.show();
		Employee e2=new Employee("Tushar Bhatia",21,150000);
		System.out.println("Details of the Second employee are :");
		e2.show();
		Employee e3=new Employee(e2);
		System.out.println("Details of the third employee are :");
		e3.show();
	}
}