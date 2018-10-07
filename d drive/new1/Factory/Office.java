import a.b.c.Person;
import a.b.Contactinfo;
import a.Employee;

public class Office
{
 public static void main(String args[])
 {
   Employee d1=new Employee();
   System.out.println("First Employee is:");
   d1.show();
   
   Employee d2=new Employee("Sahil","Vaishnav",12345,7000000);
   System.out.println("Second Employee is:");
   d2.show();
	
   Employee d3=new Employee(d2);
   System.out.println();
   d3.show();
  }
}