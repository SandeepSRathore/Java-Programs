import a.Employee1;
class Office
{
	public static void main(String args[])
	{
		Employee1 e1=new Employee1();
		System.out.println("Details of the first employee are :");
		e1.show();
		
		Employee1 e2=new Employee1("Sandeep","Rathore",9887644,15000000);
		System.out.println("Details of the second employee are :");
		e2.show();
			
		Employee1 e3=new Employee1(e2);
		System.out.println("Details of the third employee are :");
		e3.show();
	}
}