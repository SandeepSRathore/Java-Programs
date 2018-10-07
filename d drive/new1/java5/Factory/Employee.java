package a;

import a.b.c.Person;
import a.b.Contactinfo;

public class Employee extends Contactinfo
{
  public int salary;
  public Employee()
   {
   salary=00000;
   }
  public Employee(String str1,String str2,int ci,int s)
   {
    super(str1,str2,ci);
	salary=s;
   }
  public Employee(Employee e)
   {
    super(e);
	salary=e.salary;
   }  
  public void show()
  {
   System.out.print("Name:"+name+"Surname:"+surname+"Phone:"+phone+"Salary:"+salary);
  }
}