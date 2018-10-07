package a;
import a.b.c.Person;
import a.b.ContactInfo;
public class Employee extends ContactInfo
{
private int salary;
public Employee()
{
salary=0;
}
public Employee(int sal,int phn,String nm,String sm )
{
super(phn,nm,sm);
salary=sal;
}
public Employee(Employee e)
{
super(e);
salary=e.salary;
}
public void show()
{
super.show();
System.out.println("salary="+salary);
}
}